package Prepbytes;
import java.util.*;
import java.io.*;
public class BEACHH {
    public static void main(String[] args)throws IOException {
        BufferedReader x=new BufferedReader(new InputStreamReader(System.in));
        int T=Integer.parseInt(x.readLine());
        for(int i1=0; i1<T; i1++)
        {
            int size=Integer.parseInt(x.readLine());
            String input[]=(x.readLine()).split(" ");
            Stack<Integer> s=new Stack<Integer>();
            for(int i=0; i<input.length; i++)
            {
                s.push(Integer.parseInt(input[i]));
            }
            if(s.size()==1)
            System.out.println(s.pop());
            else{
                int ans=0, prev=s.pop();
                while(s.size()!=0)
                {
                    int temp=s.pop();
                    if(temp==2)
                    {
                        if(s.size()==0)
                        break;
                        prev=s.pop();
                        continue;
                    }
                    if(temp<prev)
                    {
                        if(temp*2>ans)
                        ans=temp*2;
                    }
                    else if(temp>prev)
                    {
                        if(prev*2>ans)
                        ans=prev*2;
                    }
                    else{
                        if(temp*2>ans)
                        ans=temp*2;
                    }
                    prev=temp;
                }
                System.out.println(ans);
            }
        }
    }
}