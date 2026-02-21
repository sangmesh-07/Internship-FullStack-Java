public class LargestNumbers {
    public static void main(String[] args) {
        int a = 10, b = 25, c = 15;

        if (a > b && a > c) {
            System.out.println("A is the largest number");
        } else if (b > a && b > c) {
            System.out.println("B is the largest number");
        } else {
            System.out.println("C is the largest number");
        }
    }
}
