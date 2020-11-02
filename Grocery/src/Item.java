public class Item {import java.util.ArrayList;

    public class Item {

        private String itemType;
        private String itemName;
        private double itemPrice;
        private int itemQuantity;
        private ArrayList<String> items;

        public Item() {
            items = new ArrayList<>();
        }

        public Item (String itemType, String itemName, double itemPrice, int itemQuantity, ArrayList<String> items) {
            this.itemType = itemType;
            this.itemName = itemName;
            this.itemPrice = itemPrice;
            this.itemQuantity = itemQuantity;
            this.items = items;
        }

        public String getItemType() {
            return itemType;
        }

        public void setItemType(String itemType) {
            this.itemType = itemType;
        }

        public String getItemName() {
            return itemName;
        }

        public void setItemName(String itemName) {
            this.itemName = itemName;
        }

        public double getItemPrice() {
            return itemPrice;
        }

        public void setItemPrice(double itemPrice) {
            this.itemPrice = itemPrice;
        }

        public int getItemQuantity() {
            return itemQuantity;
        }

        public void setItemQuantity(int itemQuantity) {
            this.itemQuantity = itemQuantity;
        }

        public ArrayList<String> getItems() {
            return items;
        }

        public void setItems(ArrayList<String> items) {
            this.items = items;
        }




    }
