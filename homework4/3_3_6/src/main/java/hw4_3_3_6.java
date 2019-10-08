public class hw4_3_3_6 {
/*
6. Write a method named getEvenDigitSum with one parameter
of the type "int". The method should return the sum of even
digits within the number. If the number is negative, method should return -1;
 */
    public static void main(String[] args) {
    int number=3467;
    System.out.println(getEvenDigitSum(number));
    }

    public static int getEvenDigitSum(int a) {
        int a1, a2, a3, a4, even, summ = 0, i;
        a1 = a / 1000;
        a2 = (a - a1 * 1000 ) / 100;
        a3 = (a - (a1 * 1000) - (a2 * 100)) / 10;
        a4 = a - (a1 * 1000) - (a2 * 100) - (a3 * 10);
        int[] Array = {3, 4, 6, 7};
        System.out.println(a);
        System.out.println("a1="+ a1 + " a2=" + a2 + " a3=" + a3 + " a4=" + a4);
        for (i = 0; i < 4; i++) {
            even = Array[i];
            if (even % 2 == 0) {
                summ = summ + Array[i];
            } else {
                if (summ < 0) return -1;
            }
        }
        return summ;
    }
}
