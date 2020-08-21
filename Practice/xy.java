package Practice;
import java.util.*;
public class xy {
    public static void main(String[] args) {
        //long a=Long.parseUnsignedLong("999999999999999999");
                                       //999999999999999999
        //long b=999999999999999999;//9888888888888888880
        //System.out.println(a);
        int a=7^1^7^1^7^1^99;
        int  b=7&1&7&1&7&1&99;
        int c=7|1|7|1|7|1|99;
        //System.out.println(a+" "+b+" "+c);

        long aa=25;
        double temp1=Math.log10(aa);
        double temp2=Math.log10(2);
        int digits=(int)(Math.ceil(temp1/temp2));
        System.out.println(digits+" "+(temp1/temp2));
    }
}