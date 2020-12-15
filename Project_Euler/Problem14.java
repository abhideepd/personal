package Project_Euler;
import java.io.*;
public class Problem14 
{
    static int ans=1;
    public static void main(String []args)throws IOException
    {

        //--    FIND THE LONGEST CHAIN UNDER 1 million

        int limit=0, max=0, max_i=0;

        //test();

        /*Actual*/  limit=1000000;

        //int arr[]=new int[limit];
        //arr[1]=1;
        
        ///*Testing*/ limit=100;

        for(int i=1; i<limit; i++)
        {
            func(i);
            if(ans>max)
            {
                max=ans;
                max_i=i;
            }
            System.out.println(i+" "+ans);
        }
        System.out.println("ANSWER:- "+max_i+" "+max);
    }   
    static void test()
    {
        //testing(113381);
        testing(113383);
        //testing(113382);
        System.exit(0);
    }
    static void testing(int i)
    {
        //int i=113382;
        func(i);
        System.out.println(i+" "+ans);
        
    }
    static void func(long s)
    {
        ans=1;
        while(s!=1L)
        {
            //time();
            //System.out.println(s);
            if(s%2L==0L)
            s=s/2L;
            else
            s=3L*s+1L;
            ++ans;
        }
    } 
    static void time()
    {
        for(long i=0; i<Long.MAX_VALUE/10000000000L; i++)
        {
            /*for(long j=0; j<Long.MAX_VALUE; j++)
            {
               /* for(int k=0; k<0; k++)
                {
                    
                }
            }*/
        }
    }
}
