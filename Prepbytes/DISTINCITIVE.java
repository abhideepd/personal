package Prepbytes;
import java.io.*;
public class DISTINCITIVE {
    public static void main(String[] args)throws IOException {
        BufferedReader x=new BufferedReader(new InputStreamReader(System.in));
        int T=Integer.parseInt(x.readLine());
        for(int i1=0; i1<T; i1++)
        {
            String input=x.readLine();
            int ch[]=new int[26];
            for(int i=0; i<input.length(); i++)
            {
                int temp=input.charAt(i);
                ch[temp-97]=ch[temp-97]+1;
            }
            System.out.println(ans(ch, input));
        }
    }
    static int ans(int []ch, String inp)
    {
        for(int i=0; i<inp.length(); i++)
        {
            if(ch[inp.charAt(i)-97]==1)
            return i;
        }
        return -1;
    }
}