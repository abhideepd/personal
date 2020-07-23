package Prepbytes;
import java.io.*;
import java.util.*;
public class MAXDIV {
    public static void main(String[] args)throws IOException {
        BufferedReader x=new BufferedReader(new InputStreamReader(System.in));
        String input1[]=(x.readLine()).split(" ");
        int a=Integer.parseInt(input1[0]);
        int b=Integer.parseInt(input1[1]);
        ArrayList<Integer> fact=new ArrayList<Integer>();
        int q=Integer.parseInt(x.readLine());
        for(int i=0; i<q; i++)
        {
            String input2[]=(x.readLine()).split(" ");
            int low=Integer.parseInt(input2[0]);
            int high=Integer.parseInt(input2[1]);

            System.out.println(outsource(a, b, low, high));
        }
    }
    static int outsource(int a, int b, int low, int high)
    {
        return 0;
    }
}