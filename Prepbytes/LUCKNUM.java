package Prepbytes;
import java.io.*;
public class LUCKNUM {
    public static void main(String[] args)throws IOException {
        BufferedReader x=new BufferedReader(new InputStreamReader(System.in));
        int N=Integer.parseInt(x.readLine());
        
        if(N%7==0)
        {
            int temp=N/7;
            while(temp-->0)
            System.out.print(7);
        }
        else if(N%4==0)
        {
            int temp=N/4;
            while(temp-->0)
            System.out.print(4);
        }
        else{
            int seven=N/7;
            int four=(N%7)/4;
            if((N%7)%4!=0)
            System.out.println(-1);
            else{
                while(four-->0)
                System.out.print(4);

                while(seven-->0)
                System.out.print(7);
            }
        }        
    }
}