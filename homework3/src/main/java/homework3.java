public class homework3 {

    public static void main(String[] args) {

        // Блок переменніх для 2-го пункта задания
    boolean bool;
    byte byt;
    char ch;
    short sh;
    int integ;
    long lg;
    float f;
    double dl;
    // Блок переменных для вычисления площади прямоугольника
        int high=20;
        int width=10;
        int square;
//-----------------------------------------------------------------------------
// Блок вывода 5 раз одной и той же строки без помощи циклов и с помощью

        System.out.println("My String");
        System.out.println("My String");
        System.out.println("My String");
        System.out.println("My String");
        System.out.println("My String");

               int counter = 0;
            do {
                System.out.println("My string by cycle do");
                counter++;
            } while (counter < 5);

        counter = 0;

        while (counter < 5) {
            System.out.println("My string by cycle while");
            counter++;
        }

        for (int i = 1; i <= 5; i++) {
           System.out.println(i + "   My string by cycle for");
        }
//----------------------------------------------------------------------------
// Блок инициализации переменных и вывод из в терминал
        bool=false;
        byt=7;
        ch='a';
        sh=234;
        integ=12345;
        lg=123L;
        f=9.142e20f;
        dl=9.118e300d;
        System.out.println(bool);
        System.out.println(byt);
        System.out.println(ch);
        System.out.println(sh);
        System.out.println(integ);
        System.out.println(lg);
        System.out.println(f);
        System.out.println(dl);
//--------------------------------------------------
// Блок вычисления площади прямоугольника
        square=high*width;
        System.out.println(square);

//блок для пункта 4 - коррекция программы
        float a = 5;
        float b = 10;
        float result = a / b;
        System.out.println(result);


        //-------------------------------
        //Блок 5-го задания по исправлению кода
        int a5 = 1;
        int b5 = 3;
        int c5 = 9;
        int d5 = 27;
        int result5 = - a5 * b5 + c5 + d5;

            System.out.println(result5);
            //--------------------------------------------
        // Блок 6-го задания
 //       String s = ""Java"";
//        System.out.println("Happy");
//        System.out.println("Java Learning");
//        System.out.println(""programming"");
       System.out.print("Happy Java");
//        System.out.println(""weekend"");
//        System.out.println(s);
//        System.out.print(""Python "");
        System.out.print(" ");
       System.out.print("Learning");
//----------------------------
// Блок 7-го задания
                int a7 = 10;
                int b7 = 15;
                double c7 = b7 + 38;
//                int d7 = a7 + 12;
//                double e7 = 12.3;
                String s7 = "s7" + a7;
                String s17 = a7 + "b7";
//              String s27 = "a7";
                String s37 = s17 + "a7";
                String s47 = s37 + "b7";
                System.out.println();
                System.out.println(c7 + s47 + s7);
//-------------------------------------------
// Блок 8-го задания
        ArrayList<Character> str = Arrays.asList('G', 'e', 'e', 'k', 's');

        private static ArrayList<Character> transformIntToChar(int... values) {
            ArrayList<Character> buffer = new ArrayList<>();
            for (int i: values) {
                buffer.add(((char) i));
            }
            return buffer;
        }

        private static void printList(ArrayList<Character> characters) {
            for (char c : characters) {
                System.out.print(c);
            }
        }
    }

// }

}
