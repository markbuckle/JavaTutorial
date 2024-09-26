<h3>Java & Objected-Oriented Programming</h3>

When creating items within code, every new item you make is an OBJECT. Hence,
Object Oriented Programming (OOP):

```java
public class Item {}
```

Private (versus public) means that this attributes cannot be accessed outside of
this class, i.e.:

```java
private String name;
private int quantity;
```

The two methods below allow you to access & modify the private attributes above,
i.e.:

```java
public String getName() {
        return name;
    }
    public int getQuantity() {
        return quantity;
    }
```

This whole process (above) is what is referred to as **encapsulation**; it keeps
our details inside the class safe, and provides controlled ways to access or
modify it.

In order to create an actual object that uses the above blueprint, we need to
use a **constructor**:

```java
public Item(String name, int quantity) {
    this.name = name;
    this.quantity = quantity;
}
```

Next we have to create an inventory class. The inventory class will hold and
display these items.

**Inheritance** is when once class inherits the attributes and any other methods
in another class, i.e.:

```java
public class Fruit extends Item {}
```
