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
        int age[]=new int[121];

        for(int i=0; i<studs; i++)
        {
            age[arr[i]]=age[arr[i]]+1;
        }

        int ans=0;

        for(int i=1; i<=120; i++)
        {
           
        }
        System.out.println(ans);
    }
}