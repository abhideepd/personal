package Prepbytes;
import java.util.*;
import java.io.*;
public class BINQUE {
    public static void main(String[] args)throws IOException {
        BufferedReader x=new BufferedReader(new InputStreamReader(System.in));
        int T=Integer.parseInt(x.readLine());
        for(int i1=0; i1<T; i1++)
        {
            int input=Integer.parseInt(x.readLine());
            beberexa(input);
            System.out.println();
        }
    }
    static void beberexa(int n)
    {
        Queue<String> q=new LinkedList<String>();
        q.add("1");
        while(n-->0)
        {
            String temp=q.remove();
            System.out.print(temp+" ");
            q.add(temp+"0");
            q.add(temp+"1");
        }
    }
}