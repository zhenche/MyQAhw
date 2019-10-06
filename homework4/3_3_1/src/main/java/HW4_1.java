public class HW4_1 {
/*
    Задача вывести на экран
 */

    public static void main(String[] args) {

//  Раздел для цикла for (со счётчиком)

       for (int i=10;i<=20;i++) {
           System.out.println(i);
               };


//  Раздел для цмкла while (с предусловием)
        int count = 20;
        while (count >= 10) {
            System.out.println(count);
            count --;
        }

System.out.println(" ");
//  Раздел для цикла do..while (с постусловием)
int count2=10;
do {

    System.out.println(count2);
    count2++;
    } while(count2<=20);
    }
}
