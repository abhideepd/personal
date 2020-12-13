package Project_Euler;
import java.util.*;
public class Problem10 
{
    public static void main(String []args)
    {
        int a=2000000;
        boolean arr[]=new boolean[a+1];

        for(int i=2; i<=a; i++)
        {
            int j=1;
            while(++j*i<=a)
            arr[j*i]=true;
        }

        /*int ans=0;
        int counter=0;
        int i=2;
        int lim=10000;
        while(counter<=lim)
        {
            if(arr[i]==false)
            {
                ans=i;
                ++counter;
                System.out.println(counter+" "+ans);
                //break;
            }
            ++i;
        }
        System.out.println(ans);    
        */
        long sum=0;
        for(int i=2; i<=a; i++)
        {
            if(arr[i]==false)
            sum=sum+i;
        }
        System.out.println(sum);
    }    
}
