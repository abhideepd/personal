package Prepbytes;
import java.io.*;
public class STRONE {
    public static void main(String[] args)throws IOException {
        BufferedReader x=new BufferedReader(new InputStreamReader(System.in));
        int T=Integer.parseInt(x.readLine());
        for(int i1=0; i1<T; i1++)
        {
            int N=Integer.parseInt(x.readLine());
            String input=(x.readLine());
            //int arr[]=new int[N];
            long c=0;
            for(int i=0; i<input.length(); i++)
            {
                //arr[i]=Integer.parseInt(input[i]);
                if((input.charAt(i)+"").equals("1"))
                c=c+1;
            }
            long result=((c+1)*c)/2;
            System.out.println(result);
        }
    }
}