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
    // overload this method to do something else
    public void addItem(String name, int quantity, String type){
        items.add(new Fruit(name, quantity, type));
    }
    public void addItem(String name, int quantity, int damage, String type){
        items.add(new Weapon(name, quantity, damage, type));
    }

    public void displayInventory() {
        for (Item item: items) {
            item.displayInfo();
        }
    }

    // display the inventory
    public void displayInventory(String Type) {
        for (Item item : items) {
            // if you hover over toString, you'll notice it says "It is recommended that all subclasses override this method.". Overriding and overloading are elements over polymorhphisms.
            if (item instanceof Fruit && ((Fruit) item).getType().equalsIgnoreCase(type)){
                System.out.println(item.toString());
        } else if (Item instanceof Weapon && ((Weapon) item).getType().equalsIgnoreCase(type)){
            System.out.println(item.toString());
        }
    }
}
