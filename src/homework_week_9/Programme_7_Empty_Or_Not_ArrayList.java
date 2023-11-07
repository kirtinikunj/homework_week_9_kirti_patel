package homework_week_9;

import java.util.ArrayList;

/**
 * Write a Java program to test if an array list is empty or not.
 */
public class Programme_7_Empty_Or_Not_ArrayList {

    public static void main(String[] args) {

        //calling method
        listIsEmptyOrNot();
    }

    //method to check list is empty or not
    public static void listIsEmptyOrNot() {

        //creating list
        ArrayList<String> naturalSevenWonders = new ArrayList<>();
        //adding element to list
        naturalSevenWonders.add("Northern Lights");
        naturalSevenWonders.add("Great Barrier Reef");
        naturalSevenWonders.add("Grand Canyon");
        naturalSevenWonders.add("Paricutin");
        naturalSevenWonders.add("Victoria Falls");
        naturalSevenWonders.add("Mount Everest");
        naturalSevenWonders.add("Harbor of Rio de Janeiro");

        System.out.print("Seven wonders are : " + naturalSevenWonders);

        System.out.println(" ");
        System.out.println("After removing elements");
        //removing all elements to check it is empty or not
        naturalSevenWonders.removeAll(naturalSevenWonders);
        System.out.println("List is empty or not! : " + naturalSevenWonders.isEmpty());
    }
}
