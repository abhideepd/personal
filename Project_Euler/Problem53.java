package Project_Euler;
import java.io.*;
import java.util.*;
public class Problem53 
{
    static int limit=1000000;
    public static void main(String []args)throws IOException
    {
        func();
        //testing1();
    } 
    static void testing1()
    {
        int n=23, r=10;
        System.out.println(calculate_combination(generate_n(n), generate_r(r), generate_n_minus_r(n-r)));
    }
    static void func()
    {
        int ans=0;
        for(int n=1; n<=100; n++)
        {
            for(int r=0; r<=n; r++)
            {
                //System.out.println(n+" "+r);
                ArrayList<Integer> numerator=generate_n(n);
                ArrayList<Integer> denominator_1=generate_r(r);
                ArrayList<Integer> denominator_2=generate_n_minus_r(n-r);
                if(calculate_combination(numerator, denominator_1, denominator_2))
                {
                    //System.out.println(n+" "+r);
                    ++ans;
                }
            }
        }
        System.out.println("Answer: "+ans);
    }
    static boolean calculate_combination(ArrayList<Integer> numerator, ArrayList<Integer> denominator, ArrayList<Integer> n_minus_r_fact)
    {
        denominator.addAll(n_minus_r_fact);
        //System.out.println(numerator+" "+denominator);
        for(int i=0; i<denominator.size(); i++)
        {
            if(numerator.indexOf(denominator.get(i))!=-1)
            {
               numerator.remove(numerator.indexOf(denominator.get(i))); 
               denominator.remove(i);
            }
        }       
        //System.out.println(numerator+" "+denominator);
        long prod=1;

        //while(denominator.indexOf(0)!=-1)
        //denominator.set(denominator.indexOf(0), 1);
        
        while(numerator.size()>0)
        {
            if((prod>limit)&&(denominator.size()==0))
            break;
            prod=prod*numerator.get(0);
            numerator.remove(0);
            //int temp=0;
            while((denominator.size()>0)&&(prod%denominator.get(0)==0))
            {
                prod=prod/denominator.get(0);
                denominator.remove(0);
            }
        }
        /*while(numerator.size()>0)
        {
            int temp=numerator.get(0);
            numerator.remove(0);
            prod=prod*temp;

            if((denominator.size()==0)&&(prod>limit))
            break;

            if((denominator.size()!=0)&&(prod>denominator.get(0)))
            {
                prod=prod/denominator.remove(0);
            }
        }*/
        //System.out.println(prod+" "+numerator+" "+denominator);
        if(prod>limit)
        return true;
        return false;
    }
    static ArrayList<Integer> generate_n(int n)
    {
        return generate_factorial(n);
    }
    static ArrayList<Integer> generate_r(int r)
    {
        return generate_factorial(r);
    }
    static ArrayList<Integer> generate_n_minus_r(int n_r)
    {
        return generate_factorial(n_r);
    }
    static ArrayList<Integer> generate_factorial(int n)
    {
        ArrayList<Integer> arr=new ArrayList<Integer>();
        for(int i=2; i<=n; i++)
        arr.add(i);
        return arr;
    }
}
