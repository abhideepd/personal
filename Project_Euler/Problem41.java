package Project_Euler;
import java.io.*;
import java.util.*;
public class Problem41 
{
    static ArrayList<Integer> arr=new ArrayList<Integer>();
    static int no_arr[]={1, 2, 3, 4, 5, 6, 7};
    static boolean choice[];
    static int s=0;
    static int n;
    public static void main(String []args)throws IOException
    {
        //testing1();
        n=no_arr.length;
        choice=new boolean[n];
        generate_permutation();
        Collections.sort(arr, Collections.reverseOrder());
        //System.out.println(arr);
        generate_prime();
    }
    static void testing1()
    {
        System.out.println(prime(23));
        System.out.println(prime(3797));
        System.exit(0);
    }
    static void generate_prime()
    {
        for(int i:arr)
        {
            if(prime(i))
            {
                //System.out.print("dd");
                System.out.println(i);
                break;
            }
        }
    }
    static boolean prime(int x)
    {
        for(int i=2; i<=(int)Math.sqrt(x)+1; i++)
        {
            if(x%i==0)
            return false;
        }
        return true;
    }
    static void generate_permutation()
    {
        if(length(s)==n)
        {
            arr.add(s);
        }
        else
        {
            for(int i=0; i<n; i++)
            {
                if(choice[i]==true)
                continue;
                choice[i]=true;
                int temp=s;
                s=s*10+no_arr[i];
                generate_permutation();
                s=temp;
                choice[i]=false;
                //func(i+1);
            }
        }
    }
    static int length(int x)
    {
        int ans=0;
        while(x!=0)
        {
            ++ans;
            x=x/10;
        }
        return ans;
    }
}
