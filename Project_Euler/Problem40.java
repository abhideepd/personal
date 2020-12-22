package Project_Euler;
import java.io.*;
import java.util.*;
public class Problem40 
{
    static int limit=1000010;
    static StringBuffer str=new StringBuffer("");
    static String no;
    public static void main(String []args)throws IOException
    {
        generate_string();
        main_function();
        //testing1();
    }
    static void testing1()
    {
        System.out.println(index_value(12)+" "+index_value(15));
    }
    static void generate_string()
    {
        int k=1;
        while(str.length()<=limit)
        str.append(k++);
    }   
    static int index_value(int x)
    {
        int t=Integer.parseInt(str.charAt(x-1)+"");
        return t;
    }
    static void main_function()
    {  
        int d1=index_value(1);
        int d10=index_value(10);
        int d100=index_value(100);
        int d1000=index_value(1000);
        int d10000=index_value(10000);
        int d100000=index_value(100000);
        int d1000000=index_value(1000000);

        System.out.println(d1*d10*d100*d1000*d10000*d100000*d1000000);
    }
}
