package homework_week_9;

import java.util.ArrayList;

/**
 * Write a Java program to retrieve an element (at a specified index) from a given
 * array list
 */
public class Programme_6_Retrive_Element_ArrayList {

    public static void main(String[] args) {

        //caliing method
        retriveElementFromArrayList();
    }

    //method to retrive an element
    public static void retriveElementFromArrayList() {

        //creating list
        ArrayList<String> sevenSister = new ArrayList<>();
        //adding elements to list
        sevenSister.add("Haven Brow");
        sevenSister.add("Short Brow");
        sevenSister.add("Rough Brow");
        sevenSister.add("Brass Point");
        sevenSister.add("Flagstaff Point");
        sevenSister.add("Flat Hill");
        sevenSister.add("Baily's Hill");
        sevenSister.add("Went  Hill Brow");

        System.out.println(sevenSister.get(1));
    }
}
