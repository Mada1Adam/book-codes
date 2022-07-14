import java.util.*;

public class Code21_3 {
    public static void main(String[] args) {
        Set<String> set = new LinkedHashSet<>(); //creating set

        set.add("London"); //adding to set
        set.add("Paris");
        set.add("New York");
        set.add("San Francisco");
        set.add("Beijing");
        set.add("New York");

        System.out.println(set);

        set.forEach(e -> System.out.println(e.toLowerCase() + " "));
    }
}
