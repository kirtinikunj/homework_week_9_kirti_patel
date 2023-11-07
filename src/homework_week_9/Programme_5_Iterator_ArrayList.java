package homework_week_9;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * Write a Java program to iterate through all elements in an array list using
 * Iterater.
 */
public class Programme_5_Iterator_ArrayList {

    public static void main(String[] args) {

        //calling static method
        iteratorMethod();
    }

    //method to iterate through all elements using iterartor
    public static void iteratorMethod() {

        //array list
        ArrayList<String> saptRishi = new ArrayList<>();
        //adding elements to list
        saptRishi.add("Mareechi");
        saptRishi.add("Vashishth");
        saptRishi.add("Angiras");
        saptRishi.add("Atri");
        saptRishi.add("Pulastya");
        saptRishi.add("Pulah");
        saptRishi.add("Kratu");

        //printing arraylist
        System.out.println("The name of Sapt Rishis are : "+saptRishi);

        //asssing iterater within while loop function
        Iterator<String> iteration = saptRishi.iterator();
        while (iteration.hasNext()) {
            System.out.print(iteration.next());
            System.out.print(", ");
        }
    }
}
