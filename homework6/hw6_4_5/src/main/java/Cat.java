import java.util.ArrayList;
import java.util.Arrays;

public class Cat {

    private String name;

    public Cat(String name) {
        this.name = name;
    }

    public static void main(String[] args) {

        ArrayList<Cat> cats = new ArrayList<>();
        Cat thomas = new Cat("Томас");
        Cat behemoth = new Cat("Бегемот");
        Cat philipp = new Cat("Филипп Маркович");
        Cat pushok = new Cat("Пушок");
        Cat pushisha = new Cat("Пуш");

        cats.add(thomas);
        cats.add(behemoth);
        cats.add(philipp);
        cats.add(pushok);
        cats.add(pushisha);

        int len = cats.size();
        System.out.println(cats.size());

        System.out.println(cats.toString());
    }
}
