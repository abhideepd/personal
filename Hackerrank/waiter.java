package Hackerrank;
import java.io.*;
import java.util.*;
public class waiter 
{
    static ArrayList<Integer> prime_sieve=new ArrayList<Integer>();
    public static void main(String []args)throws IOException
    {
        BufferedReader x=new BufferedReader(new InputStreamReader(System.in));
        sieve();
        String size_and_Q[]=(x.readLine()).split(" ");
        int size=Integer.parseInt(size_and_Q[0]);
        int Q=Integer.parseInt(size_and_Q[1]);
        String input[]=(x.readLine()).split(" ");
        int arr[]=new int[input.length];
        for(int i=0; i<input.length; i++)
        {
            arr[i]=Integer.parseInt(input[i]);
        }
        System.out.println("\nAnswer: ");
        int ans[]=waiter(arr, Q);
        print(ans);
    }
    static void print(int p[])
    {
        for(int i:p)
        System.out.print(i+" ");
        System.out.println();
    }
    static int[] waiter(int[] number, int q) 
    {
        Stack<Integer> A=new Stack<Integer>();
        ArrayList<Stack<Integer>> B=new ArrayList<Stack<Integer>>();
        int ans[]=new int[number.length];

        for(int i:number)
        A.push(i);

        int qq=q; q=0;

        while(q<qq)
        {
            Stack<Integer> temp_A=new Stack<Integer>();
            Stack<Integer> temp_B=new Stack<Integer>();
            while(A.size()!=0)
            {
                if(A.peek()%prime_sieve.get(q)==0)
                temp_B.push(A.pop());
                else
                temp_A.push(A.pop());
            }
            B.add(temp_B);
            A=temp_A;
            ++q;
        }
        int k=0;
        for(int i=0; i<B.size(); i++)
        {
            Stack<Integer> temp_B=B.get(i);
            while(temp_B.size()!=0)
            ans[k++]=temp_B.pop();
        }
        while(A.size()!=0)
        ans[k++]=A.pop();

        return ans;
    }
    static void sieve()
    {
        for(int i=2; i<10000; i++)
        prime_sieve.add(i);

        for(int i=0; i<10000; i++)
        {
            int j=2;
            if(prime_sieve.indexOf(i)!=-1)
            while(i*j<10000)
            {
                if(prime_sieve.indexOf(i*j)!=-1)
                prime_sieve.remove(prime_sieve.indexOf(i*j));
                ++j;
            }
        }
    }
}
