package homework_week_9;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Write a Java program to reverse an array of integer values.
 */
public class Programme_3_Reverse_An_Arrary {

    //main method
    public static void main(String[] args) {
        //declaration of scanner
        Scanner s1 = new Scanner(System.in);
        System.out.println("Enter size of the Array : ");
        int size = s1.nextInt();

        int[] array = new int[size];
        System.out.println("Enter " + size + " elements : ");
        for (int i = 0; i < size; i++) {
            array[i] = s1.nextInt();
        }

        System.out.println(Arrays.toString(reverseArray(array)));
//        System.out.println("Reversed array : ");
//        for(int num:array){
//            System.out.println(num+" ");
//        }

        s1.close();
    }

    public static int[] reverseArray(int array[]) {
        int endIndex = array.length - 1;

        for (int i = 0; i <= endIndex; i++) {
            int temp = array[i];
            array[i] = array[endIndex];
            array[endIndex] = temp;
            endIndex--;
        }
        return array;
    }
}
