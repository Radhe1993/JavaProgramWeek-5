package homework;
//5. Write a Java program to iterate through all elements in an array list using
//Iterator

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Iterater5 {
    public static void main(String[] args) {
        List<Integer> ob = new ArrayList();
        ob.add(10);
        ob.add(20);
        ob.add(30);
        ob.add(40);
        ob.add(50);
        Iterator i = ob.iterator();
        System.out.println("Arrey list elements are = ");

        while (i.hasNext()) {
            System.out.println(i.next());
        }
    }
}

