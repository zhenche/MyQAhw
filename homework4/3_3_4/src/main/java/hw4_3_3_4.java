public class hw4_3_3_4 {

/*
4. Given an array of 10 integers.
To display the sum of all its elements except the first and last.
 */

public static void main(String[] args) {
int[] Array = {10,20,32,14,16,19,45,34,15,64};
        int summ = 0;
        for (int i=1;i<=8;i++) {
        summ=summ+Array[i];
        System.out.println("summ = " + summ + ",  " + "i= " + i);
         }
//    System.out.println(summ);
}

}
