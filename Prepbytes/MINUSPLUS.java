package Prepbytes;
import java.io.*;
public class MINUSPLUS {
    public static void main(String[] args)throws IOException {
        BufferedReader x=new BufferedReader(new InputStreamReader(System.in));
        int T=Integer.parseInt(x.readLine());
        for(int i1=0; i1<T; i1++)
        {
            String s=x.readLine();
            String t=x.readLine();
            int s1=0;
            int t1=0;
            for(int i=0; i<s.length(); i++)
            {
                if(s.charAt(i)=='-')
                ++s1;
                else
                s1+=2;
            }
            for(int i=0; i<t.length(); i++)
            {
                if(t.charAt(i)=='-')
                ++t1;
                else
                t1+=2;
            }
            //System.out.println(s1+" "+t1);
            if(s1==t1)
            System.out.println("YES");
            else
            System.out.println("NO");
        }
    }
}