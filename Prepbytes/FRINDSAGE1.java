package Prepbytes;
import java.util.*;
import java.io.*;
public class FRINDSAGE1 {
    public static void main(String[] args)throws IOException {
        BufferedReader x=new BufferedReader (new InputStreamReader(System.in));
        int studs=Integer.parseInt(x.readLine());
        String input[]=(x.readLine()).split(" ");
        int arr[]=new int[studs];
        for(int i=0; i<studs; i++)
        arr[i]=Integer.parseInt(input[i]);
        Arrays.sort(arr);
        
    }
}