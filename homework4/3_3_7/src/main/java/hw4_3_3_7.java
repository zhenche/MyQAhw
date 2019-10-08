public class hw4_3_3_7 {
/*
"7. Write a method named getGreatestCommonDivisor with two parameters of type int named first and second.
If one of the parameters is < 10, method should return -1 to indicate an invalid value.
The method should return the greatest common divisor of two numbers."
 */
    public static void main(String[] args) {
    int first=25,second=75;
        System.out.println(getGreatestCommonDivisor(first,second));
        first=4;
        System.out.println(getGreatestCommonDivisor(first,second));
    }
    public static int getGreatestCommonDivisor(int a, int b) {
    int m=0;
    if (a<10 | b<10) {
        m= -1;
        } else {
        for (int i=10;i<=100;i++) {
        if ((a % i == 0) && (b % i == 0)) {
            m = i;
            return m;
        } else {
            m = 0;
        }
    }
    }

    return m;
    }


}
