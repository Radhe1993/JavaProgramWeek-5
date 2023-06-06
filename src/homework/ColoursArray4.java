package homework;

//4. Write a Java program to create a new array list, add some colours (string) and
//printout the collection using for each loop

import java.util.ArrayList;

public class ColoursArray4
{
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList();

        list.add("Red");
        list.add("Orange");
        list.add("Yellow");
        list.add("Green");
        list.add("Pink");
        list.add("White");
        list.add("Black");
        list.add("blue");

        for (int i=0; i<= list.size(); i++)
        {
            System.out.println(list.get(i));
        }
    }
}
