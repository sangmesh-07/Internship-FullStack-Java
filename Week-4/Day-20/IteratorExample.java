
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class IteratorExample {

    public static void main(String[] args) {
        HashMap<Integer, String> students = new HashMap<>();
        students.put(1, "Sangmesh");
        students.put(2, "Rahul");
        students.put(3, "Anjali");

        // Using Iterator
        Iterator<Map.Entry<Integer, String>> iterator = students.entrySet().iterator();

        while (iterator.hasNext()) {
            Map.Entry<Integer, String> entry = iterator.next();
            System.out.println("ID: " + entry.getKey() + ", Name: " + entry.getValue());
        }
    }
}
