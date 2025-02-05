// Abstract Class: Encapsulation and Abstraction
abstract class ColdDrink {
    private String brand; // Encapsulation: private data members
    private int volume; // volume in milliliters

    // Constructor
    public ColdDrink(String brand, int volume) {
        this.brand = brand;
        this.volume = volume;
    }

    // Getters and Setters (Encapsulation)
    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    // Abstract Method: Abstraction
    public abstract void drinkType();
}

// Inheritance: Subclasses of ColdDrink
class Soda extends ColdDrink {
    public Soda(String brand, int volume) {
        super(brand, volume);
    }

    // Overriding Abstract Method (Polymorphism)
    @Override
    public void drinkType() {
        System.out.println(getBrand() + " is a soda drink with a volume of " + getVolume() + " ml.");
    }
}

class Juice extends ColdDrink {
    public Juice(String brand, int volume) {
        super(brand, volume);
    }

    // Overriding Abstract Method (Polymorphism)
    @Override
    public void drinkType() {
        System.out.println(getBrand() + " is a juice drink with a volume of " + getVolume() + " ml.");
    }
}

class EnergyDrink extends ColdDrink {
    public EnergyDrink(String brand, int volume) {
        super(brand, volume);
    }

    // Overriding Abstract Method (Polymorphism)
    @Override
    public void drinkType() {
        System.out.println(getBrand() + " is an energy drink with a volume of " + getVolume() + " ml.");
    }
}

// Main Class
public class oops {
    public static void main(String[] args) {
        // Polymorphism: Different objects of ColdDrink
        ColdDrink soda = new Soda("Coca-Cola", 500);
        ColdDrink juice = new Juice("Tropicana", 300);
        ColdDrink energyDrink = new EnergyDrink("Red Bull", 250);

        // Method Calls: Runtime Polymorphism
        soda.drinkType();
        juice.drinkType();
        energyDrink.drinkType();

        // Using Encapsulation
        soda.setBrand("Pepsi");
        System.out.println("Updated Soda Brand: " + soda.getBrand());
    }
}
