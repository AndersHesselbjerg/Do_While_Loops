public class GroceryItemOrder {



    private String name;
    private int quantity, itemId;
    private double price;

    public GroceryItemOrder(String name, int itemId, double price) {
        this.name = name;
        this.quantity = 1;
        this.itemId = itemId;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int getItemId() {
        return itemId;
    }

    public void setItemId(int itemId) {
        this.itemId = itemId;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "GroceryItemOrder{" +
                "name='" + name + '\'' +
                ", quantity=" + quantity +
                ", itemId=" + itemId +
                ", price=" + price +
                '}';
    }
}
