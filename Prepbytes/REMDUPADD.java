package Prepbytes;
import java.io.*;
import java.util.*;
public class REMDUPADD {
    public static void main(String[] args)throws IOException {
        BufferedReader x=new BufferedReader(new InputStreamReader(System.in));
        int T=Integer.parseInt(x.readLine());
        for(int i1=0; i1<T; i1++)
        {
            String input=x.readLine();
            Stack<String> s=new Stack<String>();
            s.push(input.charAt(0)+"");
            for(int i=1; i<input.length(); i++)
            {
                String temp=input.charAt(i)+"";
                if(s.size()==0)
                s.push(temp);
                else if(temp.equals(s.peek()))
                s.pop();
                else
                s.push(temp);
            }
            String output="";
            while(s.size()!=0)
            output=s.pop()+output;
            System.out.println(output);
        }
    }
}