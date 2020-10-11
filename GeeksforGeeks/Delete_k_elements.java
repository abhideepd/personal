package GeeksforGeeks;
import java.io.*;
import java.util.*;
public class Delete_k_elements {
    public static void main(String []args)throws IOException
    {
        BufferedReader x=new BufferedReader(new InputStreamReader(System.in));
        int t=Integer.parseInt(x.readLine());
        for(int i1=0; i1<t; i1++)
        {
            int size=Integer.parseInt(x.readLine());
            String input[]=(x.readLine()).split(" ");
            int k=Integer.parseInt(x.readLine());
            Stack<Integer> s=new Stack<Integer>();
            for(int i=0; i<input.length; i++)
            {
                int temp=Integer.parseInt(input[i]);
                while((!s.isEmpty())&&(s.peek()<temp)&&(k-->0))
                s.pop();    
                s.push(temp);
            }
            //System.out.println(s);
            String ans="";
            while(!s.isEmpty())
            ans=s.pop()+" "+ans;
            System.out.println(ans);
        }
    }
}
