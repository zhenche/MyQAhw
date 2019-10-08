public class Hw_3_3_9 {
/*
"9. Write a program which prints the next figure to the console:
*
**
***
****
*****
******
*******"
 */

    public static void main(String[] args) {
        String a="*";
        for (int i=1;i<=7;i++) {
            for (int j=1;j<=i;j++) {
                System.out.print(a);
            }
        System.out.println();
        }
    }
}
