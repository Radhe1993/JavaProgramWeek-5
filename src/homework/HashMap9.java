package homework;
//Create a HashMap object called people that will store String keys and Integer
//values: And use for each loop to iterate the value from Map

import java.util.HashMap;
import java.util.Iterator;

public class HashMap9
{
    public static void main(String[] args) {
        HashMap<String, Integer> peopleMap = new HashMap<>();
        peopleMap.put("Ram", 1);
        peopleMap.put("Sita", 2);
        peopleMap.put("Krishna", 3);
        peopleMap.put("Radha", 4);
        for (HashMap.Entry<String, Integer> name : peopleMap.entrySet()) {
            System.out.println(name.getKey() + "" + name.getValue());
        }
        //Iterate by iterator
        Iterator<HashMap.Entry<String, Integer>> peopleName = peopleMap.entrySet().iterator();
        while(peopleName.hasNext())
        {
            System.out.println(peopleName.next());
        }
    }

}
