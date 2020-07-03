package Codeforces;
import java.io.*;
public class ProblemA1371 {
    public static void main(String[] args)throws IOException {
        BufferedReader x=new BufferedReader(new InputStreamReader(System.in));
        int T=Integer.parseInt(x.readLine());
        for(int i=0;i<T; i++)
        {
            int input=Integer.parseInt(x.readLine());
            System.out.println((input+(input%2))/2);
        }
    }
}