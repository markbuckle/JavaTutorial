public class main {
    public static void main(String[] args) {
        // assign the value of an empty inventory object
        Inventory inventory = new Inventory();

         // assign the values of items
        Item item = new Item("Generic Item", 10);
        Fruit fruit = new Fruit("Apple", 20, "Fuji");

        inventory.addItem(item);
        inventory.addItem(fruit);
        inventory.displayInventory();

    }
}
