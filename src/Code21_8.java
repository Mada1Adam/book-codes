import java.util.*;

public class Code21_8 {
    public static void main(String[] args) {
        Map<String, Integer> hashMap = new HashMap<>(); //making map
        hashMap.put("Smith", 30); //adding to map
        hashMap.put("Anderson", 31);
        hashMap.put("Lewis", 29);
        hashMap.put("Cook", 29);

        System.out.println("Display entries in HashMp"); //printing map
        System.out.println(hashMap + "\n");

        Map<String, Integer> treeMap = new TreeMap<>(hashMap); //making treeMap
        System.out.println("Display entries in ascending order of key");
        System.out.println(treeMap);

        Map<String, Integer> linkedHashMap = new LinkedHashMap<>(16, 0.75f, true);

        linkedHashMap.put("Smith", 30);
        linkedHashMap.put("Anderson", 31);
        linkedHashMap.put("Lewis", 29);
        linkedHashMap.put("Cook", 29);

        System.out.println("\nthe age for " + "Lewis is " + linkedHashMap.get("Lewis"));
        System.out.println("Display entries in LinkedHashMap ");
        System.out.println(linkedHashMap);

        System.out.println("\n Names and ages are");
        treeMap.forEach(
                (name, age) -> System.out.println(name + ": " + age));
    }
}
