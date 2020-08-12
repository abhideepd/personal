package Prepbytes;
import java.io.*;
/**
 * LEAP
 */
public class LEAP {

    public static void main(String[] args)throws IOException {
        BufferedReader x=new BufferedReader(new InputStreamReader(System.in));
        int T=Integer.parseInt(x.readLine());
        for(int i1=0; i1<T; i1++)
        {
            int year=Integer.parseInt(x.readLine());
            if(year%4==0)
            {
                if((year%100==0))
                {
                    if(year%400==0)
                    System.out.println("Yes");
                    else
                    System.out.println("No");
                }
                else{
                    System.out.println("Yes");
                }
            }
            else
            System.out.println("No");
        }
    }
}