
public class JaggedArrayExample {

    public static void main(String[] args) {

        // Declaration of jagged array
        int[][] numbers = new int[3][];

        // Assigning different column sizes to each row
        numbers[0] = new int[2];  // Row 0 has 2 elements
        numbers[1] = new int[3];  // Row 1 has 3 elements
        numbers[2] = new int[1];  // Row 2 has 1 element

        // Initializing values
        numbers[0][0] = 10;
        numbers[0][1] = 20;

        numbers[1][0] = 30;
        numbers[1][1] = 40;
        numbers[1][2] = 50;

        numbers[2][0] = 60;

        // Traversing jagged array
        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers[i].length; j++) {
                System.out.print(numbers[i][j] + " ");
            }
            System.out.println();
        }
    }
}
