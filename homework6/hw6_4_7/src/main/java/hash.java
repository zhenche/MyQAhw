import java.util.HashMap;
import java.util.Map;

public class hash {

    public static void main(String[] args) {

        HashMap<String, String> myHashMap = new HashMap<String, String>();

        myHashMap.put("watermelon", "berry");
        myHashMap.put("banana", "fruit");
        myHashMap.put("cherry", "berry");
        myHashMap.put("pineapple", "fruit");
        myHashMap.put("melon", "vegetable");
        myHashMap.put("cranberry", "berry");
        myHashMap.put("iris", "flower");
        myHashMap.put(" potato", "vegetable");
        myHashMap.put("carrot", "vegetable");

        for(Map.Entry<String, String> entry: myHashMap.entrySet())
            System.out.println(entry.getKey() + " - " + entry.getValue());

    }
}
