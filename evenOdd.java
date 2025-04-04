
import java.lang.*;
import java.util.Scanner;
public class evenOdd
{
    public static void main(String args[])
    {
        Scanner in =new Scanner(System.in);
        System.out.println("Input Number;");
        int input =in.nextInt();

        if(input>0)
        {
            System.out.println("Enter number is positive");
        }
        else if(input<0)
        {
            System.out.println("Enter number is negative");
        }
        else
        {
            System.out.println("Enter number is zero");
        }
    }
}