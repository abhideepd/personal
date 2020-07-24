package Prepbytes;
import java.io.*;
import java.util.*;
public class AMANSTR {
    public static void main(String[] args)throws IOException {
        BufferedReader x=new BufferedReader(new InputStreamReader(System.in));
        int T=Integer.parseInt(x.readLine());
        for(int i1=0; i1<T; i1++)
        {
            String input=x.readLine();
            int result=0, c=0;
            for(int i=0; i<input.length()-3; i++)
            {
                int l=0, r=0;
                //System.out.println(i);
                if((input.charAt(i)=='a')&&(input.charAt(i+1)=='m')&&(input.charAt(i+2)=='a')&&(input.charAt(i+3)=='n'))
                {
                    l=i;
                    i=i+3;
                    r=input.length()-i-1;
                    result=result+l+r+l*r;
                    c=c+1;
                    //System.out.println(l+" "+r);
                }
            }
            System.out.println(result);
        }
    }
}