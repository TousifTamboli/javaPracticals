import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class ListDemo {
    public static void main(String[] args) {
        // Creating an ArrayList of String type
        ArrayList<String> list = new ArrayList<>();

        // Adding elements to the list
        list.add("Apple");
        list.add("Banana");
        list.add("Cherry");
        list.add("Banana"); // Duplicate element allowed in List

        // Iterating over the list
        System.out.println("Elements in the list:");
        for (String item : list) {
            System.out.println(item);
        }

        // Removing an element from the list
        list.remove("Banana");

        // Sorting the list
        Collections.sort(list);

        // Displaying sorted list
        System.out.println("\nSorted list:");
        for (String item : list) {
            System.out.println(item);
        }

        // Iterating using an Iterator
        System.out.println("\nIterating using Iterator:");
        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
