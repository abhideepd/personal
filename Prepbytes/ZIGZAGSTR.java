package Prepbytes;
import java.io.*;
import java.util.*;
public class ZIGZAGSTR {
    public static void main(String[] args)throws IOException {
        BufferedReader x=new BufferedReader(new InputStreamReader(System.in));
        int T=Integer.parseInt(x.readLine());
        for(int i1=0; i1<T; i1++)
        {
            String input1[]=(x.readLine()).split(" ");
            String input=x.readLine();
            
            int N=Integer.parseInt(input1[0]);
            int R=Integer.parseInt(input1[1]);
            String output[]=new String[R+1];

            for(int i=0; i<R+1; i++)
            output[i]="";

            int c=1;
            int k=1;
            if(R==1)
            {
                System.out.print(input);
            }
            else{
                for(int i=0; i<N; i++)
                {
                    if(k<=1)
                    c=1;
                    if(k>=R)
                    c=-1;                    
                    output[k]=output[k]+input.charAt(i);                    
                    k=k+c;
                }
                for(int i=1; i<R+1; i++)
                System.out.print(output[i]);
            }
            System.out.println();
        }
    }
}