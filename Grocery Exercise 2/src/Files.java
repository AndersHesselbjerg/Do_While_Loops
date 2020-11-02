import java.io.File;
import java.util.ArrayList;
import java.util.Formatter;
import java.util.Scanner;



public class Files {

    private Scanner scanFile;
    private ArrayList<GroceryItemOrder> groceries = new ArrayList<>();

    public void createFile() {
        final Formatter groceryItems;
        File groceryItemsFile = new File("GroceryItems.txt");

        if(!groceryItemsFile.exists()) {
            try {
                groceryItems = new Formatter("GroceryItems.txt");
            }
            catch (Exception e) {
                System.out.println("Error creating GroceryItems.txt");
            }
        }

    }

    public void openFile() {
        try {
            scanFile = new Scanner(new File("GroceryItems.txt"));
        }
        catch (Exception e) {
            System.out.println("Could not find filename GroceryItems.txt");
        }
    }

    public void readFile() {
        createFile();
        openFile();
        int itemId;
        String name;
        double price;
        while(scanFile.hasNext()) {
            name = scanFile.next();
            itemId = scanFile.nextInt();
            price = scanFile.nextDouble();

            groceries.add(new GroceryItemOrder(name, itemId, price));
        }
        scanFile.close();
    }

    public ArrayList<GroceryItemOrder> returnArray(){
        return groceries;
    }




}
