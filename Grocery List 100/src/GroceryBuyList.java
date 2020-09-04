public class GroceryBuyList {


    private int itemId, quantity;

    public GroceryBuyList(int itemId, int quantity) {
        this.itemId = itemId;
        this.quantity = quantity;
    }

    public int getItemId() {
        return itemId;
    }

    public void setItemId(int itemId) {
        this.itemId = itemId;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return "GroceryBuyList{" +
                "itemId=" + itemId +
                ", quantity=" + quantity +
                '}';
    }
}
