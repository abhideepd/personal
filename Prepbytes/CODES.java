package Prepbytes;
import java.io.*;
public class CODES {
    public static void main(String[] args)throws IOException {
        BufferedReader x=new BufferedReader(new InputStreamReader(System.in));
        int T=Integer.parseInt(x.readLine());
        for(int i1=0; i1<T; i1++)
        {
            String input=x.readLine();
            int size=input.length();
            int arr[]=new int[26];
            int temp=0;
            for(int i=0; i<input.length(); i++)
            {
                arr[input.charAt(i)-67]=arr[input.charAt(i)-67]+1;
                if((input.charAt(i)!='C')&&(input.charAt(i)!='O')&&(input.charAt(i)!='D')&&(input.charAt(i)!='E'))
                ++temp;
            }
            //System.out.println(temp);
            int c=size/4;
            //System.out.println(c+" "+arr['C'-67]+" "+arr['O'-67]==c+" "+arr['D'-67]==c+" "+arr['E'-67]==67);
            if((arr['C'-67]==c)&&(arr['O'-67]==c)&&(arr['D'-67]==c)&&(arr['E'-67]==c))
            {
                System.out.println(0);
            }
            else{
                //System.out.println(arr['C'-67]+" "+arr['O'-67]+" "+arr['D'-67]+" "+arr['E'-67]);
                temp=temp+Math.abs(arr['C'-67]-c)+Math.abs(arr['O'-67]-c)+Math.abs(arr['D'-67]-c)+Math.abs(arr['E'-67]-c);
                System.out.println(temp/2);
            }
        }
    }
}