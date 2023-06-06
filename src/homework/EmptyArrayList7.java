package homework;
//7. Write a Java program to test if an array list is empty or not.

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EmptyArrayList7
{
    public static void main(String[] args)
    {

         List<Integer> lt = new ArrayList<>();
        Scanner obj = new Scanner(System.in);
        System.out.println("value = ");
        int value = obj.nextInt();

        boolean ob = lt.isEmpty();
        if(ob==true)
        {
            System.out.println("Array List is Empty");
        }
        else
        {
            System.out.println("Array List is not Empty");
        }
        // addition of a element to the ArrayList
        lt.add(10);
        lt.add(20);

        // check if the list is empty or not
        ob = lt.isEmpty();
        if(ob==true)
        {
            System.out.println("Array List is Empty");
        }
        else
        {
            System.out.println("Array List is not Empty");
        }
    }
}
