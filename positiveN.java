import java.lang.*;
import java.util.Scanner;
public class positiveN
{
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter a Number=");
        int num=in.nextInt();

        if(num%2==0)
        {
            System.out.println("Enter number is even");
        }
        else
        {
            System.out.println("Enter number is odd");
        }
    }
}