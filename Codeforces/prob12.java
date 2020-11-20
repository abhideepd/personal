package Codeforces;
import java.io.*;
public class prob12 {
    public static void main(String []args)throws IOException
    {
        BufferedReader xx=new BufferedReader(new InputStreamReader(System.in));
        double c=Double.parseDouble(xx.readLine());
        double l=1.0d;
        double r=Integer.MAX_VALUE;

        for(int i=0; i<80; i++)
        {
            double x=(l+r)/2.0d;
            double temp=func(x);

            //System.out.println("l:"+l+" r:"+r+" temp:"+temp+" c:"+c);

            if(temp>c)
            r=x;
            else if(temp<c)
            l=x;
            else
            break;

        }
        System.out.println(l);
    }
    static double func(double x)
    {
        return (x*x)+(Math.sqrt(x));
    }
}
