public class hw4_3_3_3 {
/*
3. Fill the array with numbers from 100 to 0.
 */

    public static void main(String[] args) {
        int[] Array = new int[101];
        int i=100;
        while (i >= 0) {
        Array[i] = i;
        System.out.print(Array[i]+ " ");
        i--;
        }
        }
}
