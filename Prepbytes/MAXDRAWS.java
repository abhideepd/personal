package Prepbytes;
import java.io.*;
public class MAXDRAWS {
    public static void main(String[] args)throws IOException {
        BufferedReader x=new BufferedReader(new InputStreamReader(System.in));
        int T=Integer.parseInt(x.readLine());
        for(int i=0; i<T; i++)
        {
            int n=Integer.parseInt(x.readLine());
            
            System.out.println(n+1);
        }
    }    
}