// Abstract class
abstract class Vehicle {

    // Abstract method (no body)
    abstract void start();

    // Normal method
    void fuelType() {
        System.out.println("Vehicle uses fuel");
    }
}

// Child class
class Car extends Vehicle {

    // Providing implementation of abstract method
    void start() {
        System.out.println("Car starts with a key");
    }
}

public class AbstractExample {
    public static void main(String[] args) {

        Vehicle v = new Car();  // Parent reference
        v.start();
        v.fuelType();
    }
}
