package Prepbytes;
import java.io.*;
import java.util.*;
public class PAIRS1 {
    public static void main(String[] args)throws IOException {
        BufferedReader x=new BufferedReader(new InputStreamReader(System.in));
        String input[]=(x.readLine().split(" "));
        int N=Integer.parseInt(input[0]);
        int M=Integer.parseInt(input[1]);

        int arr1[]=new int[M];
        int arr2[]=new int[M];
        
        for(int i=0; i<M; i++)
        {
            String inpuut[]=(x.readLine()).split(" ");
            arr1[i]=Integer.parseInt(inpuut[0]);
            arr2[i]=Integer.parseInt(inpuut[1]);
        }

        int x1=arr1[0];
        int x2=arr2[0];

        String ans="NO";

        int y1=-1, y2=-1, y3=-1, y4=-1;

        for(int i=0; i<M; i++)
        {
            if((arr1[i]!=x1)&&(arr2[i]!=x1))        //duplicate not found
            {
                y1=arr1[i];
                y2=arr2[i];
                ans="NO";
                break;
            }
            ans="YES";
        }
        
        if(ans=="YES")
        {
            System.out.println(ans);
            System.exit(0);
        }

        for(int i=0; i<M; i++)
        {
            if((arr1[i]!=x2)&&(arr2[i]!=x2))        //duplicate not found
            {
                y1=arr1[i];
                y2=arr2[i];
                ans="NO";
                break;
            }
            ans="YES";
        }

        if(ans=="YES")
        {
            System.out.println(ans);
            System.exit(0);
        }

        if((check(arr1, arr2, x1, y1))||(check(arr1, arr2, x1, y2))||(check(arr1, arr2, x1, y3))||(check(arr1, arr2, x1, y4))||(check(arr1, arr2, x2, y1))||(check(arr1, arr2, x2, y2))||(check(arr1, arr2, x2, y3))||(check(arr1, arr2, x2, y4)))
        {
            ans="YES";
        }
        System.out.println(ans);
    }
    static boolean check(int []arr1, int []arr2, int x, int y)
    {
        for(int i=0; i<arr1.length; i++)
        {
            if((arr1[i]!=x)&&(arr1[i]!=y)&&(arr2[i]!=x)&&(arr2[i]!=y))
            return false;            
        }
        return true;
    }
}