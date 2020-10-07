package GeeksforGeeks;
import java.io.*;
import java.util.*;
public class kelements {
    static Stack<Integer> s;
    static int k;
    public static void main(String []args)throws IOException
    {
        BufferedReader x=new BufferedReader(new InputStreamReader(System.in));
        int t=Integer.parseInt(x.readLine());
        for(int i1=0; i1<t; i1++)
        {
            int size=Integer.parseInt(x.readLine());
            String input[]=(x.readLine()).split(" ");
            k=Integer.parseInt(x.readLine());
            s=new Stack<Integer>();
            
            for(int i=0; i<input.length; i++)
            {
                int temp=Integer.parseInt(input[i]);
                if(s.size()<k)
                {
                    s.push(temp);
                }
                else
                {
                    while((!s.isEmpty())&&(s.peek()<temp))
                    s.pop();
                    s.push(temp);
                }
            }
            String answer="";
            while(s.size()!=0)
            answer=s.pop()+" "+answer;
            System.out.println(answer);
        }
    }
}
