package Testing;
import java.util.*;
import java.io.*;
public class euler1 {
    public static void main(String []args)throws IOException
    {
        //System.out.println(f(10));
        ArrayList<Integer> arr=new ArrayList<Integer>();
        arr.add(1);
        arr.add(3);
        arr.add(4);
        System.out.println(arr.indexOf(3));
        System.out.println(arr.indexOf(5));
    }
    static long f(long n)
    {
        long ans=(n*(n+1)*(2*n+1))/6;
        return ans;
    }
}
