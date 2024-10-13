import java.util.HashMap;
import java.util.Map;

public class MapDemo {
    public static void main(String[] args) {
        // Creating a HashMap to store key-value pairs
        HashMap<Integer, String> map = new HashMap<>();

        // Adding key-value pairs to the map
        map.put(1, "Apple");
        map.put(2, "Banana");
        map.put(3, "Cherry");

        // Iterating over the map
        System.out.println("Elements in the map:");
        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
        }

        // Removing an element by key
        map.remove(2);

        // Checking if a key exists
        System.out.println("\nMap contains key 2: " + map.containsKey(2));
    }
}
