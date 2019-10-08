public class Hw4_3_3_11 {
/*
 "11*. Write a program which prints the next figure to the console:
          *
         ***
        *****
       *******
      *********
     ***********"
 */
    public static void main(String[] args) {

    String[] Array = {" "," "," "," "," "," "," "," "," "," "," "};
    int m,n;
    int l = Array.length;

System.out.println(l);
    for (int i=0;i<=l/2;i++) {
        Array[l/2+i] = "*";
        Array[l/2-i] = "*";
            for (int j=0;j<=10;j++) {
            System.out.print(Array[j]);
            }
            System.out.println();
    }

        System.out.println(l/2);
    }
}
