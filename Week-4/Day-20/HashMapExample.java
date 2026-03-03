import java.util.HashMap;

public class HashMapExample {
    public static void main(String[] args) {

        // Creating HashMap
        HashMap<Integer, String> students = new HashMap<>();

        // Adding key-value pairs
        students.put(1, "Sangmesh");
        students.put(2, "pankaj");
        students.put(3, "Niteesh");

        // Display full map
        System.out.println("Student Map: " + students);

        // Retrieve value using key
        System.out.println("Student with ID 2: " + students.get(2));
    }
}

/*output
Student Map: {1=Sangmesh, 2=pankaj, 3=Niteesh}
Student with ID 2: pankaj
*/