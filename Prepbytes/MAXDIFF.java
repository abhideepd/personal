package Prepbytes;
import java.io.*;
public class MAXDIFF {
    public static void main(String[] args)throws IOException {
        BufferedReader x=new BufferedReader(new InputStreamReader(System.in));
        int T=Integer.parseInt(x.readLine());
        for(int i1=0; i1<T; i1++)
        {
            int size=Integer.parseInt(x.readLine());
            String input[]=(x.readLine()).split(" ");
            int arr1[]=new int[size];
            int arr2[]=new int[size];
            int max1=Integer.MIN_VALUE;
            int max2=Integer.MIN_VALUE;
            int min1=Integer.MAX_VALUE;
            int min2=Integer.MAX_VALUE;
            for(int i=0; i<input.length; i++)
            {
                arr1[i]=Integer.parseInt(input[i])+i;
                arr2[i]=Integer.parseInt(input[i])-i;

                if(max1<arr1[i])
                max1=arr1[i];
                if(min1>arr1[i])
                min1=arr1[i];

                if(max2<arr2[i])
                max2=arr2[i];
                if(min2>arr2[i])
                min2=arr2[i];
            }
            int dif1=(int)Math.abs(max1-min1);
            int dif2=(int)Math.abs(max2-min2);
            int dif=dif1>dif2?dif1:dif2;
            System.out.println(dif);
        }
    }
}