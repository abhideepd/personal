package Hackerearth;
import java.io.*;
import java.util.*;
public class encrypred2 {
    public static void main(String []args)throws IOException
    {
        BufferedReader x=new BufferedReader(new InputStreamReader(System.in));
        int t=Integer.parseInt(x.readLine());
        for(int i1=0; i1<t; i1++)
        {
            int size=Integer.parseInt(x.readLine());
            String input=x.readLine();
            answer(input, 0, input.length()-1);
            System.out.println();
        }
    }
    static void answer(String a, int i, int j)
    {
        if(i==j)
        {
            System.out.print(a.charAt(i));
            return;
        }
        if((j-i)==1)
        {
            System.out.print(a.charAt(i));
            answer(a, j, j);
            return;
        }
        int mid=((i+j)/2);
        System.out.print(a.charAt(mid));        
        answer(a, mid+1, j);
        answer(a, i, mid-1);
    }
}
