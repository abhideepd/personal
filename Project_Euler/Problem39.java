package Project_Euler;
import java.io.*;
import java.util.*;
public class Problem39 
{
    public static void main(String []args)throws IOException
    {
        long no_of_vals=0;
        long p_value=0;
        for(long p=120; p<=120; p++)
        {
            long temp=0;
            for(long i=1; i<50; i++)
            {
                for(long j=i; j<50; j++)
                {
                    long sum=(i*i)+(j*j);
                    
                    System.out.println("sum: "+sum+" i:"+i+" j:"+j);
                    
                    if(sum>p*p)
                    break;

                    if(sum==p*p)
                    {
                        ++temp;
                        break;
                    }
                }
            }
            System.out.println(p+" "+temp);
            if(temp>no_of_vals)
            {
                p_value=p;
                no_of_vals=temp;
            }
        }
        System.out.println(p_value+" "+no_of_vals);
    }
}
