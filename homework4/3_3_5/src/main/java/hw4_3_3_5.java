public class hw4_3_3_5 {
/*
"5. Write a function which calculates and returns the minimum of 4 arguments.
public static void main(String[] args) {
        // write your code here
}

public static int min(int a, int b, int c, int d) {
}

public static int min(int a, int b) {
}"
 */
    public static void main(String[] args) {
        int a=10;
        int b=18;
        int c=4;
        int d=7;
    System.out.println(min(a,b,c,d));
    }

    public static int min(int a, int b, int c, int d) {
        if ((min(a,b)<=c) && (min(a,b)<=d)) {
            return min(a,b);
        } else {
            return Math.min(c,d);
        }
    }

    public static int min(int a, int b) {
        return Math.min(a,b);
    }
}
