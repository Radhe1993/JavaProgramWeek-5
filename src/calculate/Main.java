package calculate;
import java.util.Scanner;
public class Main
{
    public static void main(String[] args)
    {
        Scanner ob = new Scanner(System.in);
        System.out.print("enter the first number = ");
        int a = ob.nextInt();
        System.out.print("enter the second number = ");
        int b = ob.nextInt();
        System.out.print("enter the Symbol=  ");
        char symbol = ob.next().charAt(0);
        Calculate1 obj = new Calculate1();
        obj.addition(a,b);
        obj.subtraction(a,b);
        obj.multiplication(a,b);
        obj.division(a,b);
        obj.calculateResult(a,b,symbol);
        System.out.println("Whould you like to do more calculate please enter y and n ");
        System.out.print("enter the first number = ");
        int y = ob.nextInt();
        System.out.print("enter the second number = ");
        int n = ob.nextInt();
        System.out.print("enter the Symbol=  ");
        char symbol1 = ob.next().charAt(0);
        obj.addition(y,n);
        obj.subtraction(y,n);
        obj.multiplication(y,n);
        obj.division(y,n);
        obj.calculateResult(y,n,symbol1);

    }
}


