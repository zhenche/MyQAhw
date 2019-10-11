public class Dog {
/*
"3. Create a class Dog. The dog should have a name and an age (private). Create getters and setter for all the fields." 1) When you will be creating setters - keep in mind that fields shouldn't be empty and age can't be less of equals to zero.
 */
private String name; private int age;

    public Dog(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Dog() {     }

    public static void main(String[] args) {
Dog sobaka = new Dog("jack",10);
String sobakaName = sobaka.getName();
int sobakaAge = sobaka.getAge();
        System.out.println("Имя собаки: " + sobakaName);
        System.out.println("Возраст собаки: " + sobakaAge);
    }

public String getName() {
    return name;
}

public void setName(String name) {
    this.name = name;
}
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
