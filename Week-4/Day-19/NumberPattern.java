public class NumberPattern {
    public static void main(String[] args) {

        for (int i = 1; i <= 5; i++) {          // Controls rows
            for (int j = 1; j <= i; j++) {      // Controls numbers
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}
 /* output:

1 
1 2 
1 2 3 
1 2 3 4 
1 2 3 4 5 

*/