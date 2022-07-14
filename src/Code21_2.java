public class Code21_2 {
    public static void main(String[] args) {
        java.util.Set<String> set1 = new java.util.HashSet<>(); //creating set1

        set1.add("London"); //adding to set
        set1.add("Paris");
        set1.add("New York");
        set1.add("San Francisco");
        set1.add("Beijing");

        System.out.println("Set1 is " + set1); //printing set1
        System.out.println(set1.size() + " Elements in set1");

        set1.remove("London");
        System.out.println("\nSet1 is " + set1);
        System.out.println(set1.size() + " Elements in set1");

        java.util.Set<String> set2 = new java.util.HashSet<>(); //creating set2

        set2.add("London");
        set2.add("Shanghai");
        set2.add("Paris");

        System.out.println("\nSet2 is " + set2); //printing set2
        System.out.println(set2.size() + " Elements in set2");

        System.out.println("\nIs Taipei in set2? " + set2.contains("Taipei")); //testing set2

        set1.addAll(set2); //adding set2 to set1
        System.out.println("\nAfter adding set2 to set1, set1 is " + set1);

        set1.retainAll(set2); //retaining
        System.out.println("\nAfter retaining common elements in set2 "
                + "and set2, set1 is " + set1);
    }
}
