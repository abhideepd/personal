package Prepbytes;
import java.io.*;
import java.util.*;
public class MINNUMSTR {
    public static void main(String[] args)throws IOException {
        BufferedReader x=new BufferedReader(new InputStreamReader(System.in));
        int T=Integer.parseInt(x.readLine());


        String input=x.readLine();
        Stack<Integer> s=new Stack<Integer>();
        int size=input.length();
        for(int i=input.length()+1; i>=0; i--)
        s.push(i);

        for(int i=1; i<size; i++)
        {
            
        }
    }
}