package Prepbytes;
import java.io.*;
import java.util.*;
public class MOMASS {
public static void main(String[] args)throws IOException {
    BufferedReader x=new BufferedReader(new InputStreamReader(System.in));
    String input=x.readLine();
    input=input+"-";
    int sum=0;
    int c=0;
    char perv=input.charAt(0);
    for(int i=1; i<input.length(); i++)
    {
        if((input.charAt(i)=='C')||(input.charAt(i)=='H')||(input.charAt(i)=='O')||(input.charAt(i)=='-'))
        {
            if(perv=='C')
            {
                if(c==0)
                sum=sum+12;
                else
                sum=sum+12*c;
            }
            else if(perv=='H')
            {
                if(c==0)
                sum=sum+1;
                else
                sum=sum+1*c;
            }
            else if(perv=='O')
            {
                if(c==0)
                sum=sum+16;
                else
                sum=sum+16*c;
            }
            perv=input.charAt(i);
            c=0;
        }
        else if((input.charAt(i)!='(')&&(input.charAt(i)!=')'))
        {
            c=c*10+Integer.parseInt(input.charAt(i)+"");
        }
    }
    System.out.println(sum);
}    
}