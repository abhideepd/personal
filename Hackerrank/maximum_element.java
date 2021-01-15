package Hackerrank;
import java.io.*;
import java.util.*;
public class maximum_element 
{
    public static void main(String []args)throws IOException
    {
        BufferedReader x=new BufferedReader(new InputStreamReader(System.in));
        int N=Integer.parseInt(x.readLine());
        int max=Integer.MIN_VALUE;
        Stack<Integer> s=new Stack<Integer>();
        while(N-->0)
        {
            String input[]=(x.readLine()).split(" ");
            int type=Integer.parseInt(input[0]);
            if(type==1)
            {
                if(s.size()>0)
                max=s.peek();
                else
                max=Integer.MIN_VALUE;

                int no=Integer.parseInt(input[1]);

                if(max<no)
                max=no;
                
                s.push(no);
                s.push(max);
                //System.out.println("MAX: "+max+" "+s);
            }
            else if(type==2)
            {
                s.pop();
                s.pop();
            }
            else if(type==3)
            {
                System.out.println(s.peek());
            }
        }
    }
}
