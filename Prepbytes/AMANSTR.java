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
            int sum=0, prev=-1, index=0;
            for(int i=0; i<input.length()-3; i++)
            {
                if((input.charAt(i)=='a')&&(input.charAt(i+1)=='m')&&(input.charAt(i+2)=='a')&&(input.charAt(i+3)=='n'))
                {
                    int l=i-(prev+1);
                    int r=input.length()-(i+4);
                    sum=sum+l+r+l*r;
                    prev=i;
                    i=i+3;
                    ++index;
                }
            }
            System.out.println(sum+index);
        }
    }
}