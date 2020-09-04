
import java.util.ArrayList;

public class Supermarket {
    public static void main(String[] args) {
        //GroceryItemOrder[] groceries = new GroceryItemOrder[100];
        //GroceryList[] buyList = new GroceryList[10];
        GroceryList buyList = new GroceryList();

        buyList.setGroceryItems();
        buyList.getGroceryItems();

        buyList.addToBuyList(1,3);
        buyList.addToBuyList(5,1);

        buyList.getBuyList();

    }


}
