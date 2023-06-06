package homework;
//6. Write a Java program to retrieve an element (at a specified index) from a given
//array list

import java.util.ArrayList;
import java.util.List;

public class Retrieve6
{
    public static void main(String[] args)
    {
        List<String> day = new ArrayList<>();
        day.add("Monday");
        day.add("Tuesday");
        day.add("Wednesday");
        day.add("Thursday");
        day.add("Friday");
        day.add("Saturday");
        day.add("Sunday");
        System.out.println("List of days : ");
        System.out.println(day);
        System.out.println(day.get(3));
        System.out.println(day.get(6));


    }
}
