package homework;

//10. Write a programme that tells you which line passes through particular stations.
//Just use Zone 1 stations name.

import java.util.*;

public class Station10 {
    public static void main(String[] args) {
        HashMap<String, String> zone1 = new HashMap<>();
        zone1.put("Aldgate", "District Line");
        zone1.put("Aldgate East", "Metropolitan Line");
        zone1.put("Angel", "Northern Line");
        zone1.put("Baker Street", "Metropolitan Line");
        zone1.put("Bank", "Northern Line");
        zone1.put("Barbican", "Metropolitan Line");
        zone1.put("Cannon Street LU", "District Line");
        zone1.put("Earl's Court", "Piccadilly Line");
        zone1.put("Edgware", "Circle Line");
        zone1.put("Euston NR", "Northern Line");
        zone1.put("Farringdon", "Metropolitan Line");
        zone1.put("Knightsbridge","Piccadilly Line" );

        Scanner ob = new Scanner(System.in);
        System.out.println("Enter station name  : ");
        String station = ob.nextLine();

        for (Map.Entry<String, String> entry : zone1.entrySet())
        {
            String lineName = entry.getKey();
            String lineStations = entry.getValue();
            System.out.println(lineStations+""+lineName);

        }

        // Itrate by itrater
        Iterator<Map.Entry<String,String>> carList = zone1.entrySet().iterator();
        while (carList.hasNext())
        {
            System.out.println(carList.next());
        }



       
    }
}

