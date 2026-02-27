class Student {

    // Private data members (data hiding)
    private String name;
    private int age;

    // Setter method
    public void setName(String name) {
        this.name = name;
    }

    // Getter method
    public String getName() {
        return name;
    }

    // Setter method
    public void setAge(int age) {
        if (age > 0) {   // validation
            this.age = age;
        }
    }

    // Getter method
    public int getAge() {
        return age;
    }
}

public class EncapsulationExample {
    public static void main(String[] args) {

        Student s = new Student();

        // Setting values using setters
        s.setName("Sangmesh");
        s.setAge(21);

        // Getting values using getters
        System.out.println("Name: " + s.getName());
        System.out.println("Age: " + s.getAge());
    }
}
