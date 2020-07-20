package Prepbytes;
import java.io.*;
import java.util.*;
public class EVLEXP {
    public static void main(String[] args)throws IOException {
        BufferedReader x=new BufferedReader(new InputStreamReader(System.in));
        int N=Integer.parseInt(x.readLine());
        String input[]=(x.readLine()).split(" ");
        Stack<Integer> s=new Stack<Integer>();

        for(int i=0; i<N; i++)
        {
            String temp1=input[i];
            if(temp1.equals("+"))
            {
                int val1=s.pop();
                int val2=s.pop();
                s.push(val2+val1);
            }
            else if(temp1.equals("-"))
            {
                int val1=s.pop();
                int val2=s.pop();
                s.push(val2-val1);
            }
            else if(temp1.equals("*"))
            {
                int val1=s.pop();
                int val2=s.pop();
                s.push(val2*val1);
            }
            else if(temp1.equals("/"))
            {
                int val1=s.pop();
                int val2=s.pop();
                s.push(val2/val1);
            }
            else{
                int temp=Integer.parseInt(temp1);
                s.push(temp);
            }
        }
        System.out.println(s.pop());
    }
}