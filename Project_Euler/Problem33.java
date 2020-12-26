package Project_Euler;
import java.io.*;
import java.util.*;
public class Problem33
{
    static ArrayList<String> fraction=new ArrayList<String>();
    static ArrayList<String> fraction1=new ArrayList<String>();
    public static void main(String []args)throws IOException
    {
        generate_fraction();
        System.out.println(fraction+" "+fraction.size());
        System.out.println(fraction1+" "+fraction.size());
    }
    static void generate_fraction()
    {
        for(int i=10; i<100; i++)
        {
            if(check_1(i))
            continue;

            for(int j=10; j<100; j++)
            {
                if(i>j)
                continue;

                if(check_1(j))
                continue;

                if(check_2(i, j))
                {
                    int i_first_digit=i/10;
                    int j_last_digit=j%10;
                    if(j_last_digit>i_first_digit)
                    {
                        String temp=i_first_digit+"/"+j_last_digit;
                        if(fraction.indexOf(temp)==-1)
                        {
                            fraction.add(temp);
                            fraction1.add(i+"/"+j);
                        }
                    }
                }
            }
        }
    }
    static boolean check_2(int a, int b)
    {
       int a_last_digit=a%10;
       int b_first_digit=b/10;
       if(a_last_digit==b_first_digit)
       return true;
       return false;
    }
    static boolean check_1(int x)
    {
        if(x%10==0)
        return true;
        if(x%11==0)
        return true;
        return false;
    }
}
