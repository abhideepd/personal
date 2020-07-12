package Prepbytes;
import java.io.*;
public class ENDEQ {
    public static void main(String[] args)throws IOException {
        BufferedReader x=new BufferedReader(new InputStreamReader(System.in));
        int size=Integer.parseInt(x.readLine());
        String input[]=(x.readLine()).split(" ");
        for(int i=0; i<size-1; i++)
        {
            for(int j=0; j<=i; j++)
            {
                System.out.print(input[j]+" ");
            }
            System.out.println();
        }
        for(int i=size-1; i>=0; i--)
        {
            for(int j=size-1-i; j<size; j++)
            {
                System.out.print(input[j]+" ");
            }
            System.out.println();
        }
    }
}