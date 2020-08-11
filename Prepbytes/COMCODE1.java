package Prepbytes;
import java.io.*;
import java.util.*;
public class COMCODE1 {
    public static void main(String[] args)throws IOException {
        BufferedReader x=new BufferedReader(new InputStreamReader(System.in));
        int T=Integer.parseInt(x.readLine());
        for(int i1=0; i1<T; i1++)
        {
            int size=Integer.parseInt(x.readLine());
            String input=x.readLine();
            int ans=0, temp_ans=0;
            Stack<String> s=new Stack<String>();
            for(int i=0; i<input.length(); i++)
            {
                char temp=input.charAt(i);
                if(temp=='<')
                s.push(temp+"");
                else{                 
                    if((s.size()!=0))
                    {
                        s.pop();
                        temp_ans+=2;
                    }
                    else{
                        if(temp_ans>ans)
                        ans=temp_ans;
                        temp_ans=0;
                    }
                }
            }
            System.out.println(temp_ans>ans?temp_ans:ans);
        }
    }
}