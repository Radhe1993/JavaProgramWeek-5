package homework;
//8. Use a HashSet that stores Integer Objects. Store the number 4, 7 and 8 to Sets.
//Show which numbers between 1 and 10 are in the set. (Hint: use for loop and if
//else)

import java.util.HashSet;

public class HashSet8
{
    public static void main(String[] args)
    {
        HashSet<Integer> set = new HashSet<>();
        set.add(1);
        set.add(2);
        set.add(3);
        set.add(4);
        set.add(5);
        set.add(6);
        set.add(7);
        set.add(8);
        set.add(9);
        set.add(10);
        System.out.println(set);
        for(int a :set)
        {
            if(a==4)
            {
                System.out.println(a);
                
            }
            else if(a==7)
            {
                System.out.println(a);
            }
            else if(a==8)
            {
                System.out.println(a);
            }
            else {
                System.out.println("Not valid");
            }
        }
    }
}
