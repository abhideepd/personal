package Prepbytes;
import java.io.*;
public class ARRZIGZAG {
    public static void main(String[] args)throws IOException {
        BufferedReader x=new BufferedReader(new InputStreamReader(System.in));
        int size=Integer.parseInt(x.readLine());
        String input[]=(x.readLine()).split(" ");
        int arr[]=new int[size];
        for(int i=0; i<size; i++)
        {
            arr[i]=Integer.parseInt(input[i]);
        }
        
        int result1=0;
        int result2=0;    
        for(int i=1; i<size; i+=2)
        {
            int prev=arr[i-1];
            int present=arr[i];
            if((i+1)==size)
            {
                if(prev<=present)
                result1=result1+1+(present-prev);
            }
            else{
                int next=arr[i+1];
                int min=prev<=next?prev:next;
                if(min<=present)
                result1=result1+1+(present-min);
            }
        }
        for(int i=0; i<size; i+=2)
        {
            int present=arr[i];
            if(i==0)
            {
                int next=arr[i+1];
                if(next<=present)
                result2=result2+1+(present-next);
            }
            else if((i+1)==size)
            {
                int prev=arr[i-1];
                if(prev<=present)
                result2=result2+1+(present-prev);
            }
            else{
                int prev=arr[i-1];
                int next=arr[i+1];
                int min=prev<=next?prev:next;
                if(min<=present)
                result2=result2+1+(present-min);
            }
        }
        int result=result1<=result2?result1:result2;
        System.out.println(result);
    }
}