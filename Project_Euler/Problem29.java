package Project_Euler;
import java.io.*;
import java.util.*;
public class Problem29 
{    public static void main(String []args)throws IOException
    {
        HashMap<Double, Integer> hm=new HashMap<Double, Integer>();
        int limit=100;
        for(int i=2; i<=limit; i++)
        {
            for(int j=2; j<=limit; j++)
            {
                hm.put(Math.pow(i, j), 0);
            }
        }
        System.out.println(hm.size());
    }
}
