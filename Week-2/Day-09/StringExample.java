
public class StringExample {

    public static void main(String[] args) {

        String text = "Java Programming";

        // Length of string
        System.out.println("Length: " + text.length());

        // Character at index 5
        System.out.println("Character at index 5: " + text.charAt(5));

        // Convert to uppercase
        System.out.println("Uppercase: " + text.toUpperCase());

        // Extract substring
        System.out.println("Substring (0 to 4): " + text.substring(0, 4));
    }
}
