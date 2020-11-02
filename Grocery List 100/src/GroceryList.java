import java.util.ArrayList;

public class GroceryList {



    private ArrayList<GroceryItemOrder> groceries = new ArrayList<>();
    private ArrayList<GroceryBuyList> buyList = new ArrayList<>();
    private Files file = new Files();

    public GroceryList() {
    }

    public void setGroceryItems() {
        file.readFile();
        groceries = file.returnArray();
        groceries.add(new GroceryItemOrder("1 stk. løg", 0, 1.10));
        groceries.add(new GroceryItemOrder("1kg Kartofler", 1, 15.50));
        groceries.add(new GroceryItemOrder("1kg Gulerødder", 2, 12.25));
        groceries.add(new GroceryItemOrder("500g hakket okse", 3, 32.50));
        groceries.add(new GroceryItemOrder("500g Sandwitchbrød", 5, 11.50));
        groceries.add(new GroceryItemOrder("Iceberg salathoved", 6, 10.25));
        groceries.add(new GroceryItemOrder("Rød Prince", 7, 41.50));
        groceries.add(new GroceryItemOrder("Svampe på dåse", 8, 15.50));
        groceries.add(new GroceryItemOrder("1l Skummetmælk", 9, 8.50));
        groceries.add(new GroceryItemOrder("1l Letmælk", 10, 9.50));
        groceries.add(new GroceryItemOrder("1l Sødmælk", 11, 10.50));
        groceries.add(new GroceryItemOrder("2kg Hvedemel", 12, 15.50));
        groceries.add(new GroceryItemOrder("1 plade Maraubou", 13, 27.00));
        groceries.add(new GroceryItemOrder("Blandet slik pr. 100g", 14, 8.50));
        groceries.add(new GroceryItemOrder("Sølvpapir", 15, 5.50));
        groceries.add(new GroceryItemOrder("Bagepapir", 16, 12.50));
        groceries.add(new GroceryItemOrder("JA", 16, 12.50));
    }

    public void getGroceryItems() {
        for(GroceryItemOrder grocerieList : groceries) {
            System.out.println("ID: "+grocerieList.getItemId()+"\t\tPris: "+grocerieList.getPrice()+"\t\tVare: "+grocerieList.getName());
        }

    }

    public void addToBuyList(int itemId, int quantity) {
        buyList.add(new GroceryBuyList(itemId,quantity));
    }
    public void getBuyList() {
        double cost, totalCost;
        int listItemId, listQuantity;
        System.out.println();
        for(GroceryBuyList groceryBuyList : buyList) {
            listItemId = groceryBuyList.getItemId();
            listQuantity = groceryBuyList.getQuantity();
            cost = groceries.get(listItemId).getPrice();
            totalCost = groceries.get(listItemId).getPrice()*listQuantity;

            System.out.println("Vare: "+groceries.get(listItemId).getName()+"\t\t\tPris: "+cost+"*"+listQuantity+" = "+totalCost+"\t\t\tMængde: "+listQuantity);
        }
        System.out.println("\nTotal Pris: "+getTotalCost());

    }

    public double getTotalCost() {
        double totalCost=0;
        int listItemId, listQuantity;

        for (GroceryBuyList buyListPrice: buyList) {
            listItemId = buyListPrice.getItemId();
            listQuantity = buyListPrice.getQuantity();

            totalCost+=groceries.get(listItemId).getPrice()*listQuantity;
        }

        return totalCost;
    }




}
