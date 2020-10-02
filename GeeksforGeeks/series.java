package GeeksforGeeks;
import java.util.*;
import java.lang.*;
import java.io.*;

public class series {
    public static void main(String []args)throws IOException
    {
        BufferedReader x=new BufferedReader(new InputStreamReader(System.in));
        int t=Integer.parseInt(x.readLine());

        for(int i1=0; i1<t; i1++)
        {
            int a=Integer.parseInt(x.readLine());
            shitshow(0, 1, a);
            System.out.println();
        }
    }
    static void shitshow(long n1, long n2, long i)
    {
        if(i==0)
        return;

        System.out.print(n1+" ");
        shitshow(n2, n1*n1-n2, i-1);
    }
}