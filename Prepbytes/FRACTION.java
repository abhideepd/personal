package Prepbytes;
import java.io.*;
import java.util.*;
public class FRACTION {
    public static void main(String []args)throws IOException
    {
        BufferedReader x=new BufferedReader(new InputStreamReader(System.in));
        int t=Integer.parseInt(x.readLine());
        for(int i1=0; i1<t; i1++)
        {
            String input[]=(x.readLine()).split(" ");
            int N=Integer.parseInt(input[0]);
            int D=Integer.parseInt(input[1]);
            if(N<D)
            {
                int k=2;
                int c=N, a=D, b=k;
                ArrayList<Integer> ans=new ArrayList<Integer>();
                while(c!=1)
                {
                    System.out.println(a+" "+b+" "+c);
                    c=b*c-a;
                    a=a*b;
                    ans.add(b);
                    ++b;
                }
                ans.add(a);
                print_ans(ans);
            }
            else if(N==D)
            {
                System.out.println(1);
            }
        }
    }
    static void print_ans(ArrayList<Integer> arr)
    {
        while(arr.size()!=0)
        {
            System.out.print(arr.remove(0)+" ");
        }
        System.out.println();
    }
}
