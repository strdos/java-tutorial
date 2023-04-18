package JavaTutorial;

public class NumberTriangle {
    public static void main(String[] args) {
        printNumTriangle();
        printReversedNumTriangle();
        printResetReversedNumTriangle();
    }
    private static void printNumTriangle() {

        int numRows = 4;
        int counter = 1;

        for (int i = 0; i <= numRows; i++) {
            for (int j = 1; j <= numRows - i; j++) {
                System.out.print(counter + " ");
                counter++;
            }
            System.out.println();
        }
    }
    private static void printReversedNumTriangle() {
        int numRows = 4;
        int counter = 1;

        for (int i = 1; i <= numRows; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(counter + " ");
                counter++;
            }
            System.out.println();
        }
    }
    private static void printResetReversedNumTriangle() {
        int numRows = 4;

        for (int i = 1; i <= numRows; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}
/*expected output:
1 2 3 4
5 6 7
8 9
10
*/

/* Reversed expected output:
1
2 3
4 5 6
7 8 9 10
 */

/* Reset reversed expected output:
1
1 2
1 2 3
1 2 3 4
 */
