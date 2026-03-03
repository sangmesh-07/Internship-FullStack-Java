
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class IteratorExample {

    public static void main(String[] args) {

        HashMap<Integer, String> students = new HashMap<>();
        students.put(1, "Sangmesh");
        students.put(2, "Niteesh");
        students.put(3, "Pankaj");

        // Using Iterator
        Iterator<Map.Entry<Integer, String>> iterator = students.entrySet().iterator();

        while (iterator.hasNext()) {
            Map.Entry<Integer, String> entry = iterator.next();
            System.out.println("ID: " + entry.getKey() + ", Name: " + entry.getValue());
        }
    }
}
/*output
ID: 1, Name: Sangmesh
ID: 2, Name: Niteesh
ID: 3, Name: Pankaj
*/  