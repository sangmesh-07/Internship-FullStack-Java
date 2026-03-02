public class AlphabetPattern {
    public static void main(String[] args) {

        for (char i = 'A'; i <= 'E'; i++) {      // Controls rows
            for (char j = 'A'; j <= i; j++) {    // Controls columns
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}
 /* output:

A 
A B 
A B C 
A B C D 
A B C D E 

*/