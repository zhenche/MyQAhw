public class hw4_3_3_5 {

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
        }
        else {
            return Math.min(c,d);
        }

    }

    public static int min(int a, int b) {

        return Math.min(a,b);

    }

}
