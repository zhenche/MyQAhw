import java.util.ArrayList;
import java.util.HashSet;

public class Numer {

    private int num;

    public Numer(int num) {
        this.num = num;
    }

    public static <Num> void main(String[] args) {

        ArrayList<Integer> nums = new ArrayList<Integer>();
//        Numer num = new Numer();
        int a=0;
        for (int i=0; i<100; i++) {
            int z = a + (int) (Math.random()*10);
            nums.add(z);
        }
        System.out.println(nums);

        HashSet<Integer> h = new HashSet<>();

        Object[] numArray = nums.toArray();
        for(int i=0; i<nums.size(); i++) {
        h.add((Integer) numArray[i]);
        }
System.out.println();
        System.out.print(h);
    }
}
