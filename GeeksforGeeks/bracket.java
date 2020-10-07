package GeeksforGeeks;
import java.io.*;
import java.util.*;
public class bracket {
    public static void main(String []args)throws IOException
    {
        BufferedReader x=new BufferedReader(new InputStreamReader(System.in));
        int t=Integer.parseInt(x.readLine());
        for(int i1=0; i1<t; i1++)
        {
            String input=x.readLine();
            if(input.length()%2==1)
            System.out.println(-1);
            else
            {
                Stack<Character> s=new Stack<Character>();

                for(int i=0; i<input.length(); i++)
                {
                    char temp=input.charAt(i);
                    if(temp=='{')
                    s.push(temp);
                    else
                    {
                        if((!s.isEmpty())&&(s.peek()=='{'))
                        s.pop();
                        else
                        s.push(temp);
                    }
                }
                int ans=0;
                while(s.size()!=0)
                {
                    char a=s.pop();
                    char b=s.pop();
                    if((a=='{')&&(b=='{'))
                    ++ans;
                    else if((a=='}')&&(b=='}'))
                    ++ans;
                    else
                    ans+=2;
                }
                System.out.println(ans);
            }
        }
    }
}
