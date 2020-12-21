package Project_Euler;
import java.io.*;
import java.util.*;
public class Problem32 
{
    static int limit=100000;
    public static void main(String []args)throws IOException
    {
        main_function();
        //testing1();
    }
    static void testing1()
    {
        testing1_subfunction(39, 186);
    }
    static void testing1_subfunction(int a, int b)
    {
        System.out.println(func(a, b, a*b));
    }
    static void main_function()
    {
        HashMap<Integer, Integer> hm=new HashMap<Integer, Integer>();
        long sum=0;
        for(int i=1; i<limit; i++)
        {
            for(int j=1; j<limit; j++)
            {
                int temp_prod=i*j;
                
                if(temp_prod>=987654321)
                break;

                if((func(i, j, temp_prod))&&(!hm.containsKey(temp_prod)))
                {
                    hm.put(temp_prod, 0);
                    System.out.println(i+" "+j+" "+temp_prod);
                    sum=sum+temp_prod;
                }
            }
        }
        System.out.println("Answer: "+sum);
    }
    static boolean func(int a, int b, int c)
    {
        boolean no[]=new boolean[9];     

        if((no_placement(no, a))&&(no_placement(no, b))&&(no_placement(no, c))&&(final_check(no)))
        return true;
        return false;
       
    }
    static boolean final_check(boolean []no)
    {
        for(boolean i:no)
        {
            if(i==false)
            {
                //System.out.println("Gotcha");
                return false;
            }
        }
        return true;
    }
    static boolean no_placement(boolean []no, int a)
    {
        while(a!=0)
        {
            int temp=a%10;

            if(temp==0)
            {
                ///*testing*/ System.out.println(temp+" "+a);
                return false;
            }

            if(no[temp-1]==true)
            {
                ///*testing*/ System.out.println(temp+" "+a);
                return false;
            }

            no[temp-1]=true;
            a=a/10;
        }
        return true;
    }
}
