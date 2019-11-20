import java.util.HashMap; import java.util.Iterator; import java.util.Map;

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
            String vegetals = "vegetable";

            processMap(myHashMap);

        for (Map.Entry<String, String> entry : myHashMap.entrySet()) {
            String key = entry.getKey();
            String value = entry.getValue();
            if (value == vegetals) {
                System.out.println("Found: " + entry.getKey() + " = " + entry.getValue());
            }
        }
    }

    public static void processMap(Map mp) {
        Iterator it = mp.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry pair = (Map.Entry)it.next();
            if (pair.getValue() == "vegetable") {
                System.out.println("Found: " + pair.getKey() + " = " + pair.getValue());
            }
            it.remove(); // дабы не было ConcurrentModificationException
        }
    }
}
    
    

