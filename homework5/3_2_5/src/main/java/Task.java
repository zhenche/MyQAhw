/*"5. Hide all the field and methods which allow to change the inner state of the class(Encapsulation). */
public class Task {

    public static void main(String[] args) {

            Cat barsik = new Cat("Барсик", 5, 4);
            String barsikName = barsik.getName();
            int barsikAge = barsik.getAge();
            int barsikWeight = barsik.getWeight();
         }

    public static class Cat {

        private String name;
        private int age;
        private int weight;

        public Cat(String name, int age, int weight) {
            this.name = name;
            this.age = age;
            this.weight = weight;
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

        public int getWeight() {
            return weight;
        }

        public void setWeight(int age) {
            this.age = weight;
        }
    }
}