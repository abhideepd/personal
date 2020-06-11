package Codechef;
import java.io.*;
public class May_Cookoff_Friendship {
    public static void main(String[] args)throws IOException {
        BufferedReader x=new BufferedReader(new InputStreamReader(System.in));
        int T=Integer.parseInt(x.readLine());

        for(int i1=0; i1<T; i1++)
        {
            String input=x.readLine();
            if(input.length()==2)
            {
                System.out.println(2);
                continue;
            }
            int count=0;
            int size=input.length();
            //convert characters tot upper case
            input=input.toUpperCase();
           //convert string to hash
           int arr[]=new int[size];
           for(int i=0; i<input.length(); i++)
           {
               arr[i]=(int)input.charAt(i);
           }
           //System.out.println((int)input.charAt(0));
           long a, b, c, d;
           
           for(int i=2; i<input.length(); i++)
           {
               a=output(arr, i);
               b=   
           }
        }       
    }
    static boolean output(String a)
    {
        String a1=a.substring(0, a.length()/2);
        String b1=a.substring(a.length()/2, a.length());
        System.out.println(a1+" "+b1);
        if(a1.equalsIgnoreCase(b1))
        return true;
        return false;
    }
}