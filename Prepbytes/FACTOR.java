package Prepbytes;
import java.io.*;
import java.util.*;
import java.time.format.DateTimeFormatter;  
import java.time.LocalDateTime;    
public class FACTOR
{
    public static void main(String[] args)throws IOException
    {
        BufferedReader x=new BufferedReader(new InputStreamReader(System.in));
        //Input No. of testcases
        int T=Integer.parseInt(x.readLine());

        //TIME
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");  
        LocalDateTime now1 = LocalDateTime.now(); 
        
        for(int i=0; i<T; i++)
        {
            //Input number n
            int n=Integer.parseInt(x.readLine());
            ArrayList<Integer> arr=new ArrayList<Integer>();                       
            out(n, arr, 1, 2);
            System.out.println(1+" "+n);
        }

        /*TIME*/
        LocalDateTime now2 = LocalDateTime.now();  
        System.out.println("Before:- "+dtf.format(now1));
        System.out.println("After:- "+dtf.format(now2));
    }
    public static void out(int n, ArrayList<Integer> arr, int prod, int index)
    {
        //System.out.println("XYZ:  "+n+" "+" "+ prod+" "+ index+" "+arr);
        if(prod==n)
        {
            print(arr);
            return;
        }
        if(prod>n)
        {
            return;
        }
        if(index>((n/2)+1))
        {
            return;
        }

        if(index*(index)<=n)
        for(int i=index; i<=n/2; i++)
        {
            if(prod>n)
            {
                break;
            }
            arr.add(i); 
            prod=prod*i;

            if(prod<=n)
            out(n, arr, prod, i);

            prod=prod/i;
            arr.remove(arr.size()-1);
        }
    }
    public static void print(ArrayList<Integer> arr)
    {        
        System.out.print(1+" ");
        for(int i=0; i<arr.size(); i++)
        {
            System.out.print(arr.get(i)+" ");
        }
        System.out.println();        
    }
}