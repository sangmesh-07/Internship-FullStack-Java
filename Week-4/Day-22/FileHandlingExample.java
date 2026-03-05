import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileHandlingExample {
    public static void main(String[] args) {

        try {
            // Create file
            File file = new File("demo.txt");
            if (file.createNewFile()) {
                System.out.println("File created: " + file.getName());
            } else {
                System.out.println("File already exists.");
            }

            // Write data to file
            FileWriter writer = new FileWriter("demo.txt");
            writer.write("Hello, this is Java File Handling practice.");
            writer.close();

            // Read data from file
            FileReader reader = new FileReader("demo.txt");
            int data;

            while ((data = reader.read()) != -1) {
                System.out.print((char) data);
            }

            reader.close();
        }
        catch (IOException e) {
            System.out.println("An error occurred.");
        }
    }
}
