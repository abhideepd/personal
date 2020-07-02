package Practice;
import java.io.*;
import java.util.*;
public class test3 {
    public static void main(String[] args)throws IOException {
        BufferedReader x=new BufferedReader(new InputStreamReader(System.in));
        //int a=Integer.MAX_VALUE/1000;
        int a=1000001;
        int arr[]=new int[a];
  
        ArrayList<Integer> sieve=new ArrayList<Integer>();
        sieve.add(0);

        //Chutiya no. --> 18294

        for(int i=2; i<a; i++)
        {
            /*if(sieve.size()==18290)
            System.out.println("xyz: "+i);

            if(sieve.size()==75001)
            break;*/
            if(arr[i]==0)
            {
                sieve.add(i);
                for(int i1=i*i; i1<a; i1+=i)
                {
                    arr[i1]=1;
                }
            }
        }
        System.out.println(sieve.size());

        /*int T=Integer.parseInt(x.readLine());
        for(int i1=0; i1<T; i1++)
        {
            int N=Integer.parseInt(x.readLine());
            System.out.println(sieve.get(N));
        }*/
        //System.out.println(sieve.get(1)+" "+sieve.get(10)+" "+sieve.get(100)+" "+sieve.get(500)+" "+sieve.get(1000)+" "+sieve.get(10000)+" "+sieve.get(15000)+" "+sieve.get(20000)+" "+sieve.get(50000)+" "+sieve.get(70000));
        //System.out.println(sieve.get(18293));
        //System.out.println(sieve.get(18294));
        System.out.println(sieve.get(75000));
    }
}