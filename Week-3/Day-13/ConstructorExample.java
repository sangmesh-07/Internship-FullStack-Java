class Student {

    String name;
    int age;

    // Parameterized Constructor
    Student(String n, int a) {
        name = n;
        age = a;
    }

    // Method to display details
    void display() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

public class ConstructorExample {
    public static void main(String[] args) {

        // Creating object using new keyword
        Student s1 = new Student("Sangmesh", 21);

        // Calling method using object
        s1.display();
    }
}
