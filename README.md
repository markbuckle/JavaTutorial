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

<h4>Polymorhpisms</h4>
If you hover over the toString function, you'll notice it says "It is recommended that all subclasses override this method.". Overriding and overloading are elements of a  polymorhphism.
```java
@Override
public String toString() {
    return "Item: " + name + ", Quantity: " + quantity;
}
```
This (above) is just one concept of polymorphisms. Overriding is an example of a **runtime polymorphism**. This method is considered **dynamic**.

There are also **static polymorphisms** which are also known as **compile time
polypmorphisms**. This is also known as Overloading (versus Overriding).
