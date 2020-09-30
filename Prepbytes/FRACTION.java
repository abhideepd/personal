package Prepbytes;
import java.io.*;
import java.util.*;
public class FRACTION {
    static ArrayList<Long> answer=new ArrayList<Long>();
    public static void main(String []args)throws IOException
    {
        BufferedReader x=new BufferedReader(new InputStreamReader(System.in));
        int t=Integer.parseInt(x.readLine());
        for(int i1=0; i1<t; i1++)
        {
            String input[]=(x.readLine()).split(" ");
            long N=Long.parseLong(input[0]);
            Long D=Long.parseLong(input[1]);
            //long temp=gcd(N, D);
            //N=N/temp;
            //D=D/temp;
            
            /*if(N<D)
            {
                ans(N, D);
            }
            else
            {
                //answer.add(N/D);
                if(D==1)
                {
                    //System.out.print("1/"+N);
                }
                else
                {
                    //System.out.print("1/"+(N/D)+" ");
                    ans(N%D, D);
                }
            }*/
            //System.out.println(answer);
            //print_ans();
            ans(N, D);
            System.out.println();
        }
    }
    static void ans(long a, long b)
    {

        if(a==0||b==0)
        return;

        if(a%b==0)
        {
            System.out.print("1/"+a/b);
            return;
        }

        if(b%a==0)
        {
            System.out.print(b/a);
            return;
        }

        if(a>b)
        {
            System.out.print("1/"+a/b+" ");
            ans(a%b, b);
            return;
        }

        long n=b/a+1;
        System.out.print(n+" ");
        ans((a*n-b), b*n);
    }
    static void print_ans()
    {
        for(int i=0; i<answer.size(); i++)
        System.out.print(answer.get(i)+" ");

        System.out.println();
    }
    public static long gcd(Long a, Long b)
    {
        if(a==0)
        return b;
        return gcd(b%a, a);
    }
}
