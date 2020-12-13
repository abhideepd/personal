package Project_Euler;
import java.util.*;
public class Problem2 
{
    public static void main(String []args)
    {
        int limit=4000000;
        ArrayList<Integer> arr=new ArrayList<Integer>();
        int a=0;
        int b=1;
        long sum=0;
        while(a+b<=limit)
        {
            int temp=a+b;
            if(temp%2==0)
            sum=sum+temp;
            a=b;
            b=temp;
        }
        System.out.println(sum);
    }    
}
