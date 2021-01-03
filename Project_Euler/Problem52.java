package Project_Euler;
import java.io.*;
import java.util.*;
public class Problem52 
{
    static long limit=1000000;
    public static void main(String []args)throws IOException
    {
        //testing1();
        main_function();
    }
    static void testing1()
    {
        System.out.println(check(1, 1*2));
    }
    static void main_function()
    {
        for(long i=1; i<=limit; i++)
        {
            if( (check(2*i, 3*i)) && (check(3*i, 4*i)) && (check(4*i, 5*i)) && (check(5*i, 6*i)) )
            {
                System.out.println("Answer: "+i);
                break;
            }
        }
    }
    static boolean check(long a, long b)
    {
        int a_digit[]=new int[10];
        int b_digit[]=new int[10];

        while(a!=0)
        {
            int temp=(int)a%10;
            a_digit[temp]=a_digit[temp]+1;
            a=a/10;
        }
        while(b!=0)
        {
            int temp=(int) b%10;
            b_digit[temp]=b_digit[temp]+1;
            b=b/10;
        }
        for(int i=0; i<10; i++)
        {
            if(a_digit[i]!=b_digit[i])
            return false;
        }
        return true;
    }
}
