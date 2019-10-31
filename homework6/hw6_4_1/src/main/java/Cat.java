import java.util.ArrayList;

public class Cat {

    private String name;

    private Cat(String name) {
        this.name = name;
    }

    public static void main(String[] args) {

        ArrayList<Cat> cats = new ArrayList<>();
        Cat thomas = new Cat("Cat_Thomas");
        Cat behemoth = new Cat("Cat_Begemoth");
        Cat philipp = new Cat("Cat_Fillipp");
        Cat pushok = new Cat("Cat_Pushok");

        cats.add(thomas);
        cats.add(behemoth);
        cats.add(philipp);
        cats.add(pushok);

//        int thomasIndex = cats.indexOf(thomas);
        int len = cats.size();
        System.out.println(len);
        for (Cat cat : cats) {
            System.out.println(cat);
        }
    }
}
