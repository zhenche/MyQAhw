public class Human {
/*
"1. Create a class ""Human"". A human should have the following attributes:
weight, age, first name, last name, height."
 */
    int weight, age, height;
    String fname, lname;


    public Human(String fname, String lname, int weight, int age, int height) {

        this.fname = fname;
        this.lname = lname;
        this.weight = weight;
        this.age = age;
        this.height = height;

    }

    public static void main(String[] args) {
        Human man = new Human("Вася", "Пупкин", 70, 35, 170);
        System.out.println("ФИО:  " + man.lname + " " + man.fname);
        System.out.println("Основные данные: ");
        System.out.println("Вес: " + man.weight + " Рост: " + man.height + " Возраст: " + man.age);
    }
}
