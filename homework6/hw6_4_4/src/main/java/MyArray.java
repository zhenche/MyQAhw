public class MyArray {

    public static void main(String[] args) {
        int[] myArray = new int[]{1,6,7,4,3,7,8,9,2,5,6,3,2,3,4};
        for (int i=0; i<myArray.length; i++) {
            System.out.print(myArray[i] + " ");
        }
        System.out.println("count of elements = " + myArray.length);
    }
}
