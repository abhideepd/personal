package Prepbytes;
import java.io.*;
public class PATTERN4 {
    public static void main(String[] args)throws IOException {
        BufferedReader x=new BufferedReader(new InputStreamReader(System.in));
        String a=x.readLine();

        for(int i=1; i<=5; i++)
        {
            //blank space
            for(int j=1; j<=(5-i); j++)
            System.out.print("  ");
            
            int n=(2*(i-1))+1;

            for(int j=i; j<=n; j++)
            System.out.print(j+" ");

            for(int j=n-1; j>=i; j--)
            System.out.print(j+" ");

            System.out.println(" ");
        }
    }
}