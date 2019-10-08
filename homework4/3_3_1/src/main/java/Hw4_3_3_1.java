public class Hw4_3_3_1 {
/*     "1. Print numbers from 10 to 20 using all known cycles. "  */
    public static void main(String[] args) {

//  Раздел для цикла for (со счётчиком) ------------------------------------------
       for (int i=10;i<=20;i++) {
           System.out.print(i + " ");
               };
System.out.println();

//  Раздел для цмкла while (с предусловием) --------------------------------------
        int count = 20;
        while (count >= 10) {
            System.out.print(count + " ");
            count --;         }
System.out.println();

//  Раздел для for each ----------------------------------------------------------
int[] num10to20 = {10,11,12,13,14,15,16,17,18,19,20};
for(int num : num10to20) {
    System.out.print("num = " + num + "  "); }
//  -----------------------------
System.out.println();
// ------------------------------

//  Раздел для цикла do..while (с постусловием) ---------------------------------
int count2=10;
do {
    System.out.print(count2 + " ");
    count2++;
    } while(count2<=20);     }
}
