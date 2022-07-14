import jdk.swing.interop.SwingInterOpUtils;

import java.util.*;

public class Code21_1 {
    public static void main(String[] args) {
        Set<String> set = new HashSet<>(); //Creating new HashSet

        set.add("London"); //adding elements to HashSet
        set.add("Paris");
        set.add("New York");
        set.add("San Francisco");
        set.add("Beijing");
        set.add("New York");

        System.out.println(set); //display all elements
        for (String s: set) {
            System.out.println(s.toUpperCase() + " "); //display all elements in upper case
        }
        System.out.println();
        set.forEach(e -> System.out.println(e.toLowerCase() + " ")); //display all elements in lower case
    }
}