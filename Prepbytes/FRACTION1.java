package Prepbytes;
import java.io.*;
import java.util.*;
public class FRACTION1 {
        static HashMap<Integer, String> hm=new HashMap<Integer, String>();
    public static void main(String[] args)throws IOException {
        BufferedReader x=new BufferedReader(new InputStreamReader(System.in));
        String input[]=(x.readLine()).split(" ");
        double a=Integer.parseInt(input[0]);
        double b=Integer.parseInt(input[1]);
        double result=a/b;
        int a1=(int)a;
        int b1=(int)b;
        int whole=a1/b1;
        double decimal=result-whole;
        String s=decimal+"";
        int len=s.length();
        if(s.length()>14)
        len=14;
        s=s.substring(2, len);
        //System.out.println(s);
        len=s.length();

        String res="."+s;
        if(s.length()>6)
        res="."+s.substring(0, 6);
        for(int i=1; i<=len/2; i++)
        {
            int l=0, r=l+i, flag=0;
            String a2=s.substring(l, r);
            //System.out.println(a2);
            while(r<=len)
            {
                flag=1;
                String b2=s.substring(l, r);
                //System.out.println("xb "+b2);
                l=l+i;
                r=l+i;
                if(!(a2.equals(b2)))
                break;
                flag=0;                
            }
            if(flag==0)
            {
                l=l-i;
                r=r-i;
                res=".("+s.substring(l, r)+")";
                break;
            }
        }
        System.out.println(whole+res);
    }
}
//int a=Integer.MIN_VALUE