package homework_week_9;

import java.util.HashMap;

/**
 * Create a HashMap object called people that will store String keys and Integer
 * values: And use for each loop to iterate the value from Map.
 */
public class Programme_9_HashMap {

    public static void main(String[] args) {

        hashmapMethod();
    }

    //method to create hashmap and to print it using for each loop
    public static void hashmapMethod() {

        HashMap<String, Integer> people = new HashMap<>();
        people.put("Jhon", 32);
        people.put("Steve", 30);
        people.put("Angie", 33);

        for (Integer value : people.values()) {
            System.out.println(value);
        }
    }
}
