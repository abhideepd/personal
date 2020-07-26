package Prepbytes;
import java.io.*;
import java.util.*;
public class MINS {
    public static void main(String[] args)throws IOException {
        BufferedReader x=new BufferedReader(new InputStreamReader(System.in));
        int T=Integer.parseInt(x.readLine());
        for(int i=0; i<T; i++)
        {
            String input=x.readLine();
            int l=1;
            int r=input.length();
            int ans=-1;
            while(l<=r)
            {
                int m=(l+r)/2;
                //System.out.println(m);
                if(check(input, m))
                {
                    ans=m;
                    r=m-1;
                }
                else{
                    l=m+1;
                }
            }
            System.out.println(ans);    
        }
    }
    static boolean check(String input, int m)
    {
        for(int i=0; i<26; i++)
        {
            char temp=(char)(97+i);
            int last=-1;
            boolean found=true;

            //System.out.println(temp);
            
            for(int i1=0; i1<m; i1++)
            if(temp==input.charAt(i1))
            last=i1;

            if(last==-1)
            continue;

            for(int i1=m; i1<input.length(); i1++)
            {
                if(temp==input.charAt(i1))
                last=i1;

                if(last<=(i1-m))
                {
                    found=false;
                    break;
                }
            }
            if(found==true)
            return true;
        }
        return false;
    }
}