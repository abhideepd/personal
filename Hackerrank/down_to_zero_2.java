package Hackerrank;
import java.io.*;
import java.util.*;
public class down_to_zero_2 
{
    static HashMap<Integer, ArrayList<Integer>> factors_sieve=new HashMap<Integer, ArrayList<Integer>>();
    static boolean prime_sieve[]=new boolean[1000005];
    public static void main(String []args)throws IOException
    {
        //testing1();
        prime_sieve();
        //testing2();
        String file="/home/dRazz3R/Documents/Code/personal/Hackerrank/input.txt";
        BufferedReader x=new BufferedReader(new FileReader(file));
        //BufferedReader x=new BufferedReader(new InputStreamReader(System.in));
        int t=0;
        t=Integer.parseInt(x.readLine());
        while(t-->0)
        {
            int N=Integer.parseInt(x.readLine());
            //System.out.print("Answer: ");
            System.out.println(answer(N));
        }
    }
    static void testing2()
    {
        for(int i=0; i<50; i++)
        {
            System.out.println(i+":"+prime_sieve[i]);
        }
        System.exit(0);
    }
    static void prime_sieve()
    {
        for(int i=2; i<1000005; i++)
        {
            int j=2;
            while(i*j<1000005)
            {
                prime_sieve[i*j]=true;
                ++j;
            }
        }
    }
    static void testing1()
    {
        System.out.println(option_2(0));
        System.out.println(option_2(1));
        System.out.println(option_2(2));
        System.exit(0);
    }
    static int answer(int n)
    {
        int N=n;

        Queue<Integer> q=new LinkedList<Integer>();
        q.add(N);
        int valve=q.peek();
        int tree_height=1;
        while(valve>0)
        {
            int limit=q.size();
            while((valve>0)&&(limit-->0))
            {
                int temp=q.poll();
                int option_1=option_1(temp);
                ArrayList<Integer> option_2=option_2(temp);
                valve=Math.min(option_1, valve);
                q.add(option_1);
                push_into_queue(option_2, q);
            }
            ++tree_height;
        }
        return --tree_height;
    }
    static void push_into_queue(ArrayList<Integer> arr, Queue<Integer> q)
    {
        for(int i:arr)
        q.add(i);
    }
    static int option_1(int N)
    {
        return N-1;
    }
    static ArrayList<Integer> option_2(int N)
    {
        if(factors_sieve.containsKey(N))
        return factors_sieve.get(N);
        
        ArrayList<Integer> factors=new ArrayList<Integer>();

        if(prime_sieve[N]==false)
        return factors;

        for(int i=(int)Math.sqrt(N)+1; i>1; i--)
        {
            if(N%i==0)
            factors.add(Math.max(i, N/i));
        }
        factors_sieve.put(N, factors);
        return factors;
    }
}
