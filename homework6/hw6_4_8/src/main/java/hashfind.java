import java.util.HashMap;
import java.util.Map;

public class hashfind {

        public static void main(String[] args) {

            HashMap<String, String> myHashMap = new HashMap<>();

            myHashMap.put("watermelon", "berry");
            myHashMap.put("banana", "fruit");
            myHashMap.put("cherry", "berry");
            myHashMap.put("pineapple", "fruit");
            myHashMap.put("melon", "vegetable");
            myHashMap.put("cranberry", "berry");
            myHashMap.put("iris", "flower");
            myHashMap.put(" potato", "vegetable");
            myHashMap.put("carrot", "vegetable");

            for(Map.Entry<String, String> entry: myHashMap.entrySet()) {
                if (myHashMap.get("vegetable") == String.valueOf(true)) {
                    System.out.printf(myHashMap.getValue().getName());}
                else {
                    System.out.println("nah");
                }
            }

        }
}
    
    

