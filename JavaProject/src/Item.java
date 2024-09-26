// a blueprint for creating new items. Every new item you make is an OBJECT. Hence, Object Oriented Programming (OOP)
// Making this class abstract means we can no longer use this class to create an object
public abstract class Item {
    // private (versus public) means that this attributes cannot be accessed outside of this class
    private String name;
    private int quantity;

    // use a constructor in order to create an actual object that uses this blueprint
    public Item(String name, int quantity) {
        this.name = name;
        this.quantity = quantity;
    }

    // the two methods below allow you to access & modify the private attributes above
    public String getName() {
        return name;
    }
    public int getQuantity() {
        return quantity;
    }

    public abstract void displayInfo();

    // @Override // override the built-in toString 
    // public String toString() {
    //     return "Item: " + name + ", Quantity: " + quantity;
    // }

}
