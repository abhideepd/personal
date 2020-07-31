package Prepbytes;
import java.io.*;
/**
 * CHPALIN
 */
public class CHPALIN {
public static void main(String[] args)throws IOException {
    BufferedReader x=new BufferedReader(new InputStreamReader(System.in));
    int T=Integer.parseInt(x.readLine());
    for(int i=0; i<T; i++)
    {
        int input=Integer.parseInt(x.readLine());
        int ans=reverse(input, 0);
        //System.out.println(ans);
        if(ans==input)
        System.out.println("YES");
        else
        System.out.println("NO");
    }
}
 static int reverse(int input, int sum)
 {
     if(input==0)
     return sum;
     return reverse(input/10, sum*10+input%10);
 }   
}