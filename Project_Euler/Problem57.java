package Project_Euler;
import java.io.*;
import java.util.*;
public class Problem57 
{
    static ArrayList<Long> numerator=new ArrayList<Long>();
    static ArrayList<Long> denominator=new ArrayList<Long>();
    static int limit=1000;
    public static void main(String []args)throws IOException
    {
        //initialize_arraylist();
        //generate_numerator();
        //generate_denominator();
        //System.out.println(numerator+"\n"+denominator);
        //answer();
        final_answer();
    }    
    static void final_answer()
    {
        int ans=0;
        int k=0;
        int x=8;
        int d=3;
        while(k+x<limit)
        {
            ++ans;
            k=k+x;
            d=d*-1;
            System.out.println(x+" "+k);
            x=x+d;
        }
        System.out.println("Answer: "+ans);
    }
    static void answer()
    {
        int ans=0;
        int k=0;
        while(k!=numerator.size())
        {
            if(no_of_digits(numerator.get(k))>no_of_digits(denominator.get(k)))
            {
                System.out.println(k+" : "+numerator.get(k)+"/"+denominator.get(k));
                ++ans;
            }
            ++k;
        }
        System.out.println("Answer: "+ans);
    }
    static int no_of_digits(long a)
    {   
        int digits=0;
        while(a!=0)
        {
            ++digits;
            a=a/10;
        }
        return digits;
    }
    static void generate_numerator()
    {
        int k=2;
        while(numerator.size()-1!=limit)
        {
            numerator.add(numerator.get(k-1)*2+numerator.get(k-2));
            ++k;
        }
    }
    static void generate_denominator()
    {
        int k=2;
        while(denominator.size()-1!=limit)
        {
            denominator.add(denominator.get(k-1)*2+denominator.get(k-2));
            ++k;
        }
    }
    static void initialize_arraylist()
    {
        numerator.add(1L);
        numerator.add(3L);

        denominator.add(1L);
        denominator.add(2L);
    }
}
