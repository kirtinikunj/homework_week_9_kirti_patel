package homework_week_9;

import java.util.ArrayList;

/**
 * Declare following two arrylist and compare it.
 */
public class Programme_11_Compare_ArrayList {

    public static void main(String[] args) {

        compareTwoArrayList();
    }

    //method to compare two array list
    public static void compareTwoArrayList() {

        //creating first list
        ArrayList<String> c1 = new ArrayList<>();
        c1.add("Red");
        c1.add("Green");
        c1.add("Black");
        c1.add("White");
        c1.add("Pink");

        //creating second list
        ArrayList<String> c2 = new ArrayList<>();
        c2.add("Red");
        c2.add("Green");
        c2.add("Black");
        c2.add("Pink");

        //comparing two lists
        if (c1.equals(c2)) {
            System.out.println("Two lists are equale");
        } else {
            System.out.println("Two lists are not equale");
        }
    }
}
