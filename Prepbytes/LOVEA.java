package Prepbytes;
import java.io.*;
public class LOVEA {
    public static void main(String[] args)throws IOException {
        BufferedReader x=new BufferedReader(new InputStreamReader(System.in));
        int T=Integer.parseInt(x.readLine());
        for(int i1=0; i1<T; i1++)
        {
            String input=x.readLine();
            int size=input.length();
            int a_count=0;
            for(int i=0; i<input.length(); i++)
            {
                if(input.charAt(i)=='a')
                ++a_count;
            }
            if(size>(a_count*2+1))
            System.out.println(a_count*2+1);
            else
            System.out.println(size);
        }
    }
}