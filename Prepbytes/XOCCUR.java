package Prepbytes;
import java.io.*;
import java.util.*;
public class XOCCUR {
    public static void main(String[] args)throws IOException {
        
        BufferedReader x=new BufferedReader(new InputStreamReader(System.in));
        //Enter no. of test cases
        int T=Integer.parseInt(x.readLine());

        for(int i1=0; i1<T; i1++)
        {
            int size=Integer.parseInt(x.readLine());
            String input[]=(x.readLine()).split(" ");
            int c=0;          
            
            for(int i=0; i<size; i++)
            {
                if(input[i].equals("x"))
                ++c;
            }
            System.out.println(c);
        }
    }
}