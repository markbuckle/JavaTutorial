// item is the superclass, fruit is the subclass to item. Fruit inherits the attributes and any other methods in Item.
// When going from a class to an interface, be sure to change "extends" to "implements"
public class Fruit implements ItemStuff {
// public class Fruit extends Item {
    private String name;
    private int quantity;
    private String type;

    public Fruit(String name, int quantity, String type) {
        // since we are no longer inheriting these variables, we must do this the old fashioned way
        this.name = name;
        this.quantity = quantity;
        this.type = type;
    }

    public String getType() {
        return type;
    }
    @Override
    public String getName() {
        return name;
    }
    @Override
    public int getQuantity() {
        return quantity;
    }
    @Override
    // public String toString() {
    public void  displayInfo() {
        System.out.println("Fruit: " + getName() + ", Quantity: " + getQuantity() + ", Type: " + type);
    }
}
