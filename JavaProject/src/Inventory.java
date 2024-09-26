import java.util.ArrayList;

public class Inventory {
    // an arrayList of items. An Array List is a collection or a specialized subset of non primitive datatypes. It stores & manages groups of objects. It is also predefined as you can see in the import line above (util) that Java already has it built in. 
    // the main difference between an array and array list is that arrays cannot store objects. ArrayLists can also be dynamically resized, whereas arrays are fixed. Important to note that Arrays are not fixed sizes in all languages, but in Java they are a fixed size.
    private ArrayList<Item> items;

    // constructor for inventory. 
    public Inventory() {
        items = new ArrayList <>();
    }

    // use a method to add items to the items array list above
    public void addItem(Item item) {
        items.add(item);
    }

    // display the inventory
    public void displayInventory() {
        for (Item item : items) {
            System.out.println("Item: " + item.getName() + ", Quantity: " + item.getQuantity());
        }
    }
}
