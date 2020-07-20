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
            int result=0;
            for(int i=0; i<input.length()-4; i++)
            {
                int l=0, r=0;
                if((input.charAt(i)=='a')&&(input.charAt(i+1)=='m')&&(input.charAt(i+2)=='a')&&(input.charAt(i+3)=='n'))
                {
                    l=i+1;
                    r=(input.length()-1)-(i+3)+1;
                    result=result+(l*r);
                    System.out.println(l+" "+r+" "+result);
                    i=i+3;
                }
            }
            System.out.println(result);
        }
    }
}