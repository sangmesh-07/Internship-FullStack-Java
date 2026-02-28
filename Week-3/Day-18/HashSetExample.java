import java.util.HashSet;

public class HashSetExample {
    public static void main(String[] args) {

        // Creating HashSet
        HashSet<String> fruits = new HashSet<>();

        // Adding elements
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Apple");  // Duplicate will be ignored

        // Display elements
        System.out.println("HashSet: " + fruits);

        // Check element
        System.out.println("Contains Mango? " + fruits.contains("Mango"));
    }
}


/*output
HashSet: [Apple, Banana]
Contains Mango? false
 */