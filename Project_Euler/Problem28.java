package Project_Euler;
import java.io.*;
import java.util.*;
public class Problem28 
{
    public static void main(String []args)throws IOException
    {
        long sum=1, prev=1;;
        int k=0, diff=2;
        for(int i=3; i<=1001; i+=2)
        {
            prev=prev+diff;
            sum=sum+(prev)+(prev+diff)+(prev+2*diff)+(prev+3*diff);
            //System.out.println((prev)+" "+(prev+diff)+" "+(prev+2*diff)+" "+(prev+3*diff));
            prev=prev+3*diff;
            diff=diff+2;
        }
        System.out.println(sum);
    }
}
