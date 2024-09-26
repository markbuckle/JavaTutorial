// item is the superclass, fruit is the subclass to item. Fruit inherits the attributes and any other methods in Item.
public class Fruit extends Item {
    private String type;

    public Fruit(String name, int quantity, String type) {
        super(name, quantity);
        this.type = type;
    }

    public String getType() {
        return type;
    }
}
