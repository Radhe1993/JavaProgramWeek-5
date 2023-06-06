package homework;
//2. Rewrite the student mark sheet programme (From java-homework-week3
//programmes) using if else and while loop.

import java.util.Scanner;

public class StudentMarkSheet2
{
    int rollNo,math,science,english,total;
    String name,result;
    double percentage;
    public void getdata()
    {
        Scanner ob = new Scanner(System.in);
        System.out.print("Student Name = ");
        name = ob.nextLine();
        System.out.print("Student RollNo = ");
        rollNo = ob.nextInt();
        System.out.print("Math = ");
        math = ob.nextInt();
        System.out.print("Science = ");
        science = ob.nextInt();
        System.out.print("English= ");
        english = ob.nextInt();

    }
    public void result()
    {
        total = math+science+english;
        System.out.println("Total = "+total);
        percentage = total/3;

        while (percentage>100)
        {
            System.out.println("Invalid result");
        }
        if(percentage>=80)
        {
            System.out.println("Pass");
            System.out.println("A++");
        }
        else if(percentage>=60)
        {
            System.out.println("Pass");
            System.out.println("A");
        }
        else if(percentage>=50)
        {
            System.out.println("pass");
            System.out.println("B");
        }
        else if (percentage>=35)
        {
            System.out.println("pass");
            System.out.println("C");
        }
        else
        {
            System.out.println("Fail");
        }
    }

    public static void main(String[] args)
    {
        StudentMarkSheet2 obj = new StudentMarkSheet2();
        obj.getdata();
        obj.result();

    }

}
