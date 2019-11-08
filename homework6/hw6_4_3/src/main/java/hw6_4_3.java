import java.util.HashMap;
import java.util.Map;
public class hw6_4_3 {

        public static void main(String[] args) {

            HashMap<String, Integer> vehicles = new HashMap<String, Integer>();

            vehicles.put("BMW", 5);
            for(Map.Entry<String, Integer> entry: vehicles.entrySet())
                System.out.println(entry.getKey() + " - " + entry.getValue());
        }
}
