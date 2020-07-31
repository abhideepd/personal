package Prepbytes;
import java.io.*;
import java.util.*;
public class SUBSTRING {
    static int answer=0;
    static HashMap<String, Integer> hm=new HashMap<String, Integer>();
    public static void main(String[] args)throws IOException {
        BufferedReader x=new BufferedReader(new InputStreamReader(System.in));
        int T=Integer.parseInt(x.readLine());
        for(int i=0; i<T; i++)
        {
            String input=x.readLine();
            aa(input, "", -1, 1);
            System.out.println(answer);
            answer=0;
            //System.out.println(hm);
        }
    }
    static void aa(String input, String a, int i, int u)
    {
        //System.out.println(u+"---"+a);

        if(u==a.length())
        {
            if(check(a))
            {
                System.out.println(a);
                hm.put(a, 0);
                ++answer;       
            }
        }
        
        if(i==input.length()-1)
        return;

        aa(input, a+input.charAt(i+1), i+1, u+1);
        aa(input, input.charAt(i+1)+"", i+1, u);
    }
    static boolean check(String a)
    {
        if(a=="")
        return false;

        int l=0, r=a.length()-1;
        if(a.charAt(l)==a.charAt(r))
        return true;

        return false;
    }
}