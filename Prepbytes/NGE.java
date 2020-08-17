package Prepbytes;
import java.io.*;
import java.util.*;
public class NGE {
    public static void main(String[] args)throws IOException {
        BufferedReader x=new BufferedReader(new InputStreamReader(System.in));
        int T=Integer.parseInt(x.readLine());
        for(int i1=0; i1<T; i1++)
        {
            int size=Integer.parseInt(x.readLine());
            String input[]=(x.readLine()).split(" ");
            Stack<Integer> s=new Stack<Integer>();
            for(int i=0; i<size; i++)
            {
                s.push(Integer.parseInt(input[i]));
            }
            int max=0;
            while(s.size()!=0)
            {
                int temp=s.pop();
                
            }
        }
    }
}