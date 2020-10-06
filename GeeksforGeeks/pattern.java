package GeeksforGeeks;
import java.io.*;
import java.util.*;
public class pattern {
    public static void main(String []args)throws IOException
    {
        BufferedReader x=new BufferedReader(new InputStreamReader(System.in));
        int t=Integer.parseInt(x.readLine());
        for(int i1=0; i1<t; i1++)
        {
            int n=Integer.parseInt(x.readLine());
            function(n, 0, n, -5);
            System.out.println();
        }
    }
    static void function(int n, int flag, int n1, int k)
    {
        System.out.print(n1+" ");
        if((flag!=0)&&(n==n1))
        return;
        if((flag==0)&&(n1<=0))
        {
            k=5;
            flag=1;
        }
        function(n, flag, n1+k, k);
    }
}