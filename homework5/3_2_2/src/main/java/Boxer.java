public class Boxer {
/*
"2. Implement the method fight() depending on weight, strength and age of the boxer:
You should write dependency by yourself. The method should return true or false if our boxer won or lost.
1) if ourBoxer.fight(anotherBoxer) returns true, then anotherBoxer.fight(outBoxer) should return false;
*/
    public int age;
    public int weight;
    public int strength;

    public Boxer(int age, int weight, int strength) {
        this.age = age;
        this.weight = weight;
        this.strength = strength;
    }

    public boolean fight(Boxer anotherBoxer) {
        int count=0;
        boolean a=false;

        if (this.age > anotherBoxer.age) {count++;}
        // if (this.age == anotherBoxer.age) {first++;second++;}
        if (this.weight > anotherBoxer.weight) {count++;}
        // if (this.weight == anotherBoxer.weight) {first++;second++;}
        if (this.strength > anotherBoxer.strength) {count++;}
        // if (this.strength == anotherBoxer.strength) {first++;second++;}
//        if (first <= second) {a=false;}  else {a=true;}
        if (count>1) { a = true;}
        return a;
    }



    public static void main(String[] args) {
        Boxer boxer1 = new Boxer(35, 170, 88);
        Boxer boxer2 = new Boxer(39, 173, 87);
        System.out.println(boxer1.fight(boxer2));
    }
}

