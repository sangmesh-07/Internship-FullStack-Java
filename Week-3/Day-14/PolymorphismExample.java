// Parent Class
class Animal {
    
    // Method to be overridden (Runtime Polymorphism)
    void sound() {
        System.out.println("Animal makes a sound");
    }

    // Method Overloading (Compile-Time Polymorphism)
    void eat() {
        System.out.println("Animal eats food");
    }

    void eat(String food) {
        System.out.println("Animal eats " + food);
    }
}

// Child Class
class Dog extends Animal {
    
    // Overriding parent method
    @Override
    void sound() {
        System.out.println("Dog barks");
    }
}

public class PolymorphismExample {
    public static void main(String[] args) {

        // Runtime Polymorphism
        Animal obj = new Dog();
        obj.sound();   // Calls Dog's sound() method

        // Compile-Time Polymorphism
        obj.eat();
        obj.eat("meat");
    }
}