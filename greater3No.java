// Find Greatest Among Three Numbers;
import java.lang.*;
import java.util.Scanner;
public class greater3No
{
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);

        System.out.println("Enter 1St num=");
        int num1 =in.nextInt();

        System.out.println("Enter 2nd num=");
        int num2 =in.nextInt();
    
        System.out.println("Enter 3rd num=");
        int num3 =in.nextInt();

        if((num1>num2)&&(num1>num3))
        {
            System.out.println("Num1 is greater ");
        }
        else if((num2>num1)&&(num2>num3))
        {
            System.out.println("Num2 is greater ");
        }
        else
        {
            System.out.println("Num3 is greater ");
        }
    
    
    }
}