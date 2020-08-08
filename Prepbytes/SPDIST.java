package Prepbytes;
import java.io.*;
public class SPDIST {
    public static void main(String[] args)throws IOException {
        BufferedReader x=new BufferedReader(new InputStreamReader(System.in));
        String S1_=x.readLine();
        String S2_=x.readLine();
        String S1=S1_.length()<=S2_.length()?S1_:S2_;
        String S2=S1_.length()>=S2_.length()?S1_:S2_;
        //System.out.println(S1+" "+S2);
        int result=0;

        for(int i=0; i<=(S2.length()-S1.length()); i++)
        {
            String temp=S2.substring(i, S2.length());
            result=result+func(S1, temp);
        }   
        System.out.println(result);
    }
    static int func(String S1, String S2)
    {
        int result=0;
        for(int i=0; i<S1.length(); i++)
        {
            int temp1=Integer.parseInt(S1.charAt(i)+"");
            int temp2=Integer.parseInt(S2.charAt(i)+"");
            
            result=result+(int)Math.abs(temp1-temp2);
        }
        return result;
    }
}