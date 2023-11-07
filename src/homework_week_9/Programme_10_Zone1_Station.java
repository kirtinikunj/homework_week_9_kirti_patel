package homework_week_9;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * 10. Write a programme that tells you which line passes through particular stations.
 * Just use Zone 1 stations name.
 */
public class Programme_10_Zone1_Station {

    public static void main(String[] args) {

        //declare hashmap
        HashMap<String, String> trainlines = new HashMap<>();
        trainlines.put("Bank", "Central, DLR,Northern, Waterloo, Circle, Piccadilly, District");
        trainlines.put("Green park", "Jubilee,Piccadilly, Victoria, Central, District, Bakerloo, Circle, Metropolitan");
        trainlines.put("Oxford Circus", "Bakerloo, central, Victoria, Nortern, Jubilee, Circle, District");


        Scanner s1 = new Scanner(System.in);
        System.out.println("Enter station name : ");
        String stationName = s1.nextLine();

        for (Map.Entry<String, String> station : trainlines.entrySet()) {
            if (station.getKey().equalsIgnoreCase(stationName)) {
                System.out.println("the tubes running at " + station);
            }
        }
        s1.close();
    }


}
