package Project_Euler;
import java.util.*;
import java.io.*;
public class Problem66 
{
    static int limit=70;
    static int limit1=900000;
    public static void main(String []args)throws IOException
    {
        function1();
       // testing1();
    }
    static void testing1()
    {
       // System.out.println(check(3, 2, 1));
      //System.out.println(search_x(13));
      System.out.println(search_x(1000));
    }
    static void function1()
    {
        int max_x=0;
        ArrayList<Integer> arr=new ArrayList<Integer>();
        ArrayList<Integer> noo=new ArrayList<Integer>();
        ArrayList<Integer> x_val=new ArrayList<Integer>();
        int D_value=0;
        for(int D=2; D<=limit; D++)
        {
            int temp=search_x(D);
            System.out.print("D: "+D+" x: "+temp+" y:");

            if(temp==-1)
            noo.add(D);

            if(temp>max_x)
            {
                max_x=temp;
                D_value=D;
                arr.add(D);
                x_val.add(max_x);
                System.out.print(" ----> max");
            }
            System.out.println();
        }
        System.out.println("Answer:-\nx: "+max_x+"  D: "+D_value);
        System.out.println("D_value: "+arr);
        System.out.println("x_value: "+x_val);
        System.out.println("neg_array:"+ noo);
    }
    static int search_x(int D)
    {
        for(int y=(int)Math.sqrt(D)-1; y<limit1; y++)
        {
            for(int x=limit1; x>y; x--)
            {
                if(check(D, x, y))
                {
                    System.out.print(y);
                    return x;
                    //System.out.println(x);
                }
            }
        }
        return -1;
    }
    static boolean check(long D, long x, long y)
    {
        long temp=(long)Math.sqrt(D);
        if(temp*temp==D)
        return false;
        x=x*x;
        y=y*y;
        if(x-D*y==1)
        return true;
        return false;
    }
}
