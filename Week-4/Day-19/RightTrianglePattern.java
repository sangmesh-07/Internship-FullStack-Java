public class RightTrianglePattern {
    public static void main(String[] args) {

        for (int i = 1; i <= 5; i++) {          // Controls rows
            for (int j = 1; j <= i; j++) {      // Controls columns
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
/* output:

* 
* * 
* * * 
* * * * 
* * * * * 

*/
