package Prepbytes;
import java.io.*;
public class YESNO {
    public static void main(String[] args)throws IOException {
        BufferedReader x=new BufferedReader(new InputStreamReader(System.in));
        int T=Integer.parseInt(x.readLine());
        int sum=0;
        int arr[]=new int[T];
        for(int i=0; i<T; i++)
        {
            arr[i]=Integer.parseInt(x.readLine());
            sum=sum+arr[i];
        }
        if(sum==360)
        System.out.println("YES");
        else{
            System.out.println(check(arr, sum));
        }
    }
    static String check(int []arr, int x)
    {
        for(int i=0; i<arr.length; i++)
        {
            if(arr[i]*2==(x))
            return "YES";
        }
        return "NO";
    }
}