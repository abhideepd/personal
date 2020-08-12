package Prepbytes;
import java.io.*;
public class PATTERN3 {
    public static void main(String[] args)throws IOException {
        BufferedReader x=new BufferedReader(new InputStreamReader(System.in));
        String s=x.readLine();
        for(int i=1; i<=5; i++)
        {
            for(int j=1; j<=5; j++)
            {
                if(j<=i)
                System.out.print(j);
                else
                System.out.print(" ");
            }
            for(int j=5; j>=1; j--)
            {
                if(j<=i)
                System.out.print(j);
                else
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}