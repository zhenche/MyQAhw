import java.util.ArrayList;

class Main {

    public static void main(String[] args) {

//        For (int i=0; i<ArreyList.length){
//            printList(transformIntToChar(ArrayList[i]));
//            i++;
        printList(transformIntToChar(72,101,108,108,111,32,119,111,114,108,100));

    }

    private static ArrayList<Character> transformIntToChar(int... values) {
        ArrayList<Character> buffer = new ArrayList<>();
        for (int i: values) {
            buffer.add(((char) i));
        }
        return buffer;
    }

    private static void printList(ArrayList<Character> characters) {
        for (char c: characters) {
            System.out.print(c);
        }
    }

}