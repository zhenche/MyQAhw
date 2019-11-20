import java.util.ArrayList;

public class Numer {

    private int num;

    public Numer(int num) {
        this.num = num;
    }

    public static void main(String[] args) {

        ArrayList<Integer> nums = new ArrayList<Integer>();
        Numer num = new Numer();

        nums.add(1);

        int lenArr = cats.size();

//        Cat[] catsArray = cats.toArray(new Cat[0]);
//        String str;

        int max = 0;
        for (int i=0; i<lenArr; i++) {
//            if (i+1>=lenArr) break;
//            int len1 = catsArray[i].toString().length();
//            max = Math.max(max,catsArray[i].toString().length());
////            System.out.println(max);
        }

        for (int i=0; i<lenArr; i++) {
            if (max==catsArray[i].toString().length()) {
                System.out.println(catsArray[i].toString());
            }
        }
    }

    @Override
    public String toString() {
        return name;
    }
}
