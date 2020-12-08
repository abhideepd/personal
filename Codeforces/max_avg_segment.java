package Codeforces;
import java.io.*;
public class max_avg_segment {
    static int n;
    static int d;
    static int arr[];
    static int sum_arr[];
    public static void main(String args[])throws IOException
    {
        BufferedReader x=new BufferedReader(new InputStreamReader(System.in));
        String n_d[]=(x.readLine()).split(" ");
        n=Integer.parseInt(n_d[0]);
        d=Integer.parseInt(n_d[1]);
        arr=new int[n];
        sum_arr=new int[n];
    }
}
