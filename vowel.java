//Check Vowel or Consonant
import java.lang.*;
import java.util.Scanner;
public class vowel
{
    public static void main(String args[])
    {
        Scanner ch=new Scanner(System.in);

        System.out.println("Enter a character=");
        String chr=ch.next().toLowerCase();

        if(chr.equals("a") || chr.equals("e") || chr.equals("i") || chr.equals("o") || chr.equals("u"))
        {
            System.out.println("Enter character is vowel");
        }
        else
        {
            System.out.println("Enter character is Consonant");
        }
    }
}