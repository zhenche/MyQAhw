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

        System.out.println(cats.toString());
    }

    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                '}';
    }
}
