package Project_Euler;
import java.io.*;
import java.util.*;
public class Problem49 
{
    static ArrayList<Integer> prime=new ArrayList<Integer>();
    static ArrayList<Integer> arr=new ArrayList<Integer>();

    public static void main(String []args)throws IOException
    {
        generate();
        main_function();
    }    
    static void main_function()
    {
        for(int i=0; i<arr.size(); i++)
        {
            for(int j=arr.size()-1; j>i; j--)
            {
                int i_th=arr.get(i);
                int j_th=arr.get(j);
                int k_th=i_th+((j_th-i_th)/2);
                if(check(i_th, j_th, k_th))
                {
                    System.out.println(i_th+""+k_th+""+j_th);
                }
            }
        }
    }
    static boolean check(int i, int j, int k)
    {
        boolean digit_i[]=new boolean[10];
        boolean digit_j[]=new boolean[10];
        boolean digit_k[]=new boolean[10];
        if(prime.indexOf(i)==-1)
        return false;
        if(prime.indexOf(j)==-1)
        return false;
        if(prime.indexOf(k)==-1)
        return false;
        
        while(i!=0)
        {
            int temp=i%10;
            digit_i[temp]=true;
            i=i/10;
        }
        while(j!=0)
        {
            int temp=j%10;
            digit_j[temp]=true;
            j=j/10;
        }
        while(k!=0)
        {
            int temp=k%10;
            digit_k[temp]=true;
            k=k/10;
        }
        for(int x=0; x<10; x++)
        {
            if((digit_i[x]!=digit_j[x])||(digit_i[x]!=digit_k[x])||(digit_j[x]!=digit_k[x]))
            return false;
        }
        return true;
    }
    static void generate()
    {
        generate_prime();
        System.out.println(arr);
    }
    static void generate_prime()
    {
        for(int i=2; i<10000; i++)
        {
            prime.add(i);
        }
        for(int i=2; i<10000; i++)
        {
            int j=2;
            if(prime.indexOf(i)!=-1)
            {
                while(i*j<10000)
                {
                    if(prime.indexOf(i*j)!=-1)
                    prime.remove(prime.indexOf(i*j));
                    ++j;
                }
            }
        }
        for(int i:prime)
        {
            if(i>1000)
            arr.add(i);
        }
    }
}