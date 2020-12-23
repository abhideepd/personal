package Project_Euler;
import java.io.*;
import java.util.*;
public class Problem33
{
    static ArrayList<Integer> numerator=new ArrayList<Integer>();
    static ArrayList<Integer> denominator=new ArrayList<Integer>();
    public static void main(String []args)throws IOException
    {
        generate_fraction();
    }
    static void generate_fraction()
    {
        for(int i=11; i<100; i++)
        {
            for(int j=i+1; j<100; j++)
            {
                if(check(i, j))
                {
                    numerator.add(i);
                    denominator.add(j);
                }
            }
        }
        System.out.println("Numerator: "+numerator);
        System.out.println("Denominator: "+denominator);
    }
    static boolean check(int a, int b)
    {
        int a_left=a/10;
        int a_right=a%10;
        int b_left=b/10;
        int b_right=b%10;
        
        if(a_right==b_left)
        {
            if(a_left<b_right)
            return true;
        }
        return false;
    }
}
