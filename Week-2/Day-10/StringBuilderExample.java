
public class StringBuilderExample {

    public static void main(String[] args) {

        StringBuilder sb = new StringBuilder("Java");

        sb.append(" Programming");
        sb.insert(4, " FullStack");
        sb.replace(0, 4, "Advanced");

        System.out.println("Final String: " + sb);
    }
}
