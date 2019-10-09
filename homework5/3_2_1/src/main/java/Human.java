public class Human {
/*
"1. Create a class ""Human"". A human should have the following attributes:
weight, age, first name, last name, height."
 */
    int weight, age, height;
    String fname, lname;


    public static void main(String[] args) {
        Human man = new Human();
        man.weight = 70;
        man.age = 35;
        man.height=170;
        man.fname="Vasya";
        man.lname="Pupkin";
        System.out.println("ФИО:  " + man.lname + " " + man.fname);
        System.out.println("Основные данные: ");
        System.out.println("Вес: " + man.weight + " Рост: " + man.height + " Возраст: " + man.age);
    }
}
