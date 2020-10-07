package GeeksforGeeks;
import java.io.*;
import java.util.*;
public class strng {
    public static void main(String []args)throws IOException
    {
        BufferedReader x=new BufferedReader(new InputStreamReader(System.in));
        int t=Integer.parseInt(x.readLine().trim());
        for(int i1=0; i1<t; i1++)
        {
            String input=x.readLine().trim();
            input=input.toLowerCase();
            input=input+"_";
            Stack<Character> s=new Stack<Character>();
            s.push(input.charAt(0));
            String answer="";
            for(int i=1; i<input.length(); i++)
            {
                if(s.peek()!=input.charAt(i))
                {
                    answer=answer+s.size()+s.pop();
                    s=new Stack<Character>();
                    s.push(input.charAt(i));
                }
                else
                s.push(input.charAt(i));
            }
            System.out.println(answer);
        }
    }
}
