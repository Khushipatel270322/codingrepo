// Abstract Class: Encapsulation and Abstraction
abstract class Coffee {
    private String coffeeType; // Encapsulation: private data members
    private double price;      // Price of the coffee

    // Constructor
    public Coffee(String coffeeType, double price) {
        this.coffeeType = coffeeType;
        this.price = price;
    }

    // Getters and Setters (Encapsulation)
    public String getCoffeeType() {
        return coffeeType;
    }

    public void setCoffeeType(String coffeeType) {
        this.coffeeType = coffeeType;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    // Abstract Method: Abstraction
    public abstract void prepare();
}

// Inheritance: Subclasses of Coffee
class Espresso extends Coffee {
    public Espresso(double price) {
        super("Espresso", price);
    }

    // Overriding Abstract Method (Polymorphism)
    @Override
    public void prepare() {
        System.out.println("Preparing " + getCoffeeType() + " with strong and rich coffee shot.");
    }
}

class Cappuccino extends Coffee {
    public Cappuccino(double price) {
        super("Cappuccino", price);
    }

    // Overriding Abstract Method (Polymorphism)
    @Override
    public void prepare() {
        System.out.println("Preparing " + getCoffeeType() + " with steamed milk and foam.");
    }
}

class Latte extends Coffee {
    public Latte(double price) {
        super("Latte", price);
    }

    // Overriding Abstract Method (Polymorphism)
    @Override
    public void prepare() {
        System.out.println("Preparing " + getCoffeeType() + " with lots of milk and a light coffee taste.");
    }
}

// Main Class
public class cvm {
    public static void main(String[] args) {
        // Polymorphism: Different objects of Coffee
        Coffee espresso = new Espresso(2.50);
        Coffee cappuccino = new Cappuccino(3.00);
        Coffee latte = new Latte(3.50);

        // Prepare coffees
        espresso.prepare();
        cappuccino.prepare();
        latte.prepare();

        // Using Encapsulation
        cappuccino.setPrice(3.20);
        System.out.println("Updated price of " + cappuccino.getCoffeeType() + ": $" + cappuccino.getPrice());
    }
}
