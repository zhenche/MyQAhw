import java.util.ArrayList;
import java.util.Arrays;

public class Cat {

    private String name;

    private Cat(String name) {
        this.name = name;
    }

    public static void main(String[] args) {

        ArrayList<Cat> cats = new ArrayList<>();
        Cat thomas = new Cat("Thomas");
        Cat behemoth = new Cat("Begemoth");
        Cat philipp = new Cat("Fillipp");
        Cat pushok = new Cat("Pushok");

        cats.add(thomas);
        cats.add(behemoth);
        cats.add(philipp);
        cats.add(pushok);

//        int thomasIndex = cats.indexOf(thomas);
//        int len = cats.size();
//        System.out.println(len);
//        for (Cat cat : cats) {
//            System.out.println(cat);
//        }

        System.out.println(cats);
        System.out.println(cats.toString());
        System.out.println(Arrays.toString(cats));
    }



    @Owerride
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                '}';
    }
}
