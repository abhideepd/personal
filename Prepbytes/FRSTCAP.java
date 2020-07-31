package Prepbytes;
import java.io.*;
public class FRSTCAP {
    public static void main(String[] args)throws IOException {
        BufferedReader x=new BufferedReader(new InputStreamReader(System.in));
        int T=Integer.parseInt(x.readLine());
        for(int i=0; i<T; i++)
        {
            String input=x.readLine();
            System.out.println(answer(input, 0));
        }
    }
    public static int answer(String input, int i)
    {
        if(i==input.length())
        return -1;

        int temp=(int)input.charAt(i);
        if((temp>=65)&&(temp<=90))
        return i;
        return answer(input, i+1);
    }
}