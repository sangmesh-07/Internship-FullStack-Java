
import java.util.ArrayList;

public class ArrayListExample {

    public static void main(String[] args) {

        // Creating ArrayList
        ArrayList<String> names = new ArrayList<>();

        // Adding elements
        names.add("Java");
        names.add("Python");
        names.add("Java");  // Duplicate allowed

        // Display elements
        System.out.println("ArrayList: " + names);

        // Remove element
        names.remove("Python");

        // Check element
        System.out.println("Contains Java? " + names.contains("Java"));

        // Iterate using for-each loop
        for (String name : names) {
            System.out.println(name);
        }
    }
}
