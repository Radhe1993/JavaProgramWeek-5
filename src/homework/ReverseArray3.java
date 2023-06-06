package homework;
//3. Write a Java program to reverse an array of integer values.

import java.util.Scanner;

public class ReverseArray3 {
    public static void reverse() {
        int i, n;
        int a[] = new int[10];
        Scanner ob = new Scanner(System.in);
        System.out.print("Enter the n = ");
        n = ob.nextInt();
        for (i = 0; i <= n; i++)
        {
            System.out.print("a[" + i + "] = ");
            a[i] = ob.nextInt();
        }

        for (i = n; i >=0; i--) {
            {
                System.out.println("reverse" + a[i]);
            }

        }
    }

        public static void main (String[]args)
        {
            reverse();
        }
    }

