import java.io.FileOutputStream;
import java.io.IOException;

public class FileWriteExample {
    public static void main(String[] args) {

        try {
            FileOutputStream fos = new FileOutputStream("output.txt");
            String text = "Hello Java I/O Streams";

            fos.write(text.getBytes());
            fos.close();

            System.out.println("Data written to file successfully.");
        }
        catch (IOException e) {
            System.out.println("Error writing file.");
        }
    }
}
