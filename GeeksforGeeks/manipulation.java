package GeeksforGeeks;
import java.io.*;
import java.util.*;
public class manipulation {
    public static void main(String []args)throws IOException
    {
        BufferedReader x=new BufferedReader(new InputStreamReader(System.in));
        int t=Integer.parseInt(x.readLine());
        for(int i1=0; i1<t; i1++)
        {
            int size=Integer.parseInt(x.readLine());
            String input[]=(x.readLine()).split(" ");
            Stack<String> s=new Stack<String>();

            for(int i=0; i<input.length; i++)
            {
                String temp=input[i];
                if(s.isEmpty())
                s.push(temp);
                else
                {
                    if(temp.equalsIgnoreCase(s.peek()))
                    s.pop();
                    else
                    s.push(temp);
                }
            }
            System.out.println(s.size());
        }
    }
}
