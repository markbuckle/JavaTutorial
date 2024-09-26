public class main {
    public static void main(String[] args) {
        // assign the value of an empty inventory object
        Inventory inventory = new Inventory();

         // assign the values of items
        Item item = new Item("Generic Item", 10);
        Fruit fruit = new Fruit("Apple", 20, "Fuji");
        Weapon weapon = new Weapon("Sword", 2, 75, "Melee");

        inventory.addItem(item);
        inventory.addItem(fruit);
        inventory.addItem(weapon);
        inventory.displayInventory();

    }
}
