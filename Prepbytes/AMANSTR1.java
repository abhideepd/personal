package Prepbytes;
import java.io.*;
public class AMANSTR1 {
    public static void main(String[] args)throws IOException {
        BufferedReader x=new BufferedReader(new InputStreamReader(System.in));
        int T=Integer.parseInt(x.readLine());
        for(int i1=0; i1<T; i1++)
        {
            String input=x.readLine();
            int aman_count=0;
            int result=0;
            int L=0;
            for(int i=0; i<input.length()-3; i++)
            {
                if(input.substring(i, i+4).equals("aman"))
                {
                    //System.out.println("xyz");
                    ++aman_count;
                    L=i-L;
                    int R=(input.length()-1)-(i+3);
                    result=result+L+R+(L*R);
                    L=i+1;
                }
            }
            System.out.println(result+aman_count);
        }
    }
}