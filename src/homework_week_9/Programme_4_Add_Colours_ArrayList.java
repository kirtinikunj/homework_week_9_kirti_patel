package homework_week_9;

import java.util.ArrayList;

/**
 * Write a Java program to create a new array list, add some colours (string) and
 * printout the collection using for each loop.
 */
public class Programme_4_Add_Colours_ArrayList {

    public static void main(String[] args) {

        //calling static method
        addColoursToArrayList();
    }

    //method to add colours to array list
    public static void addColoursToArrayList() {

        //creating array list
        ArrayList<String> colourList = new ArrayList<>();
        //adding colours to list
        colourList.add("Red");
        colourList.add("Orange");
        colourList.add("Yellow");
        colourList.add("Green");
        colourList.add("Blue");
        colourList.add("Indigo");
        colourList.add("Violet");

        //printing the collection using for each loop
        for (String colour : colourList) {
            System.out.println(colour + " ");
        }
    }
}
