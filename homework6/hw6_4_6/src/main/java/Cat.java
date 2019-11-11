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
        Cat philipp = new Cat("Филипп");
        Cat pushok = new Cat("Пушок");
        Cat pushisha = new Cat("Пуш");
        Cat durka = new Cat("Дурка");
        Cat murka = new Cat("Мурка");
        Cat shurka = new Cat("Шурка");
        Cat churka = new Cat("Чурка");
        Cat bzdurka = new Cat("Бздюрка");

        cats.add(thomas);
        cats.add(behemoth);
        cats.add(philipp);
        cats.add(pushok);
        cats.add(pushisha);
        cats.add(durka);
        cats.add(murka);
        cats.add(shurka);
        cats.add(churka);
        cats.add(bzdurka);

        int lenArr = cats.size();
//        System.out.println(cats.size());

//        System.out.println(cats.toString());

        Cat[] catsArray = cats.toArray(new Cat[0]);
        String str;
//        Math.max(str.toString.length());
        int max = 0;
        for (int i=0; i<lenArr; i++) {
            if (i+1>=lenArr) break;
            int len1 = catsArray[i].toString().length();
            max = Math.max(max,catsArray[i].toString().length());
//            System.out.println(max);
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
