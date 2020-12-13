package Testing;

import java.io.*;
import java.math.*;
import java.text.*;
import java.util.*;
import java.util.regex.*;

public class Solution {

    static ArrayList<Long> arr=new ArrayList<Long>();

    // Complete the solve function below.
   public static void main(String []args)
   {
       arr.add(9L);
       arr.add(90L);
       arr.add(99L);

       for(int i=2; i<13; i++)
       func(9L*(long)Math.pow(10, i));

       //d();

       for(int i=1; i<=500; i++)
       {
           //long x=div(i);
           if(div(i)==-1)
           System.out.println(i);
       }
   }
   static long div(int n)
   {
       for(int i=0; i<arr.size(); i++)
       {
           if(arr.get(i)%n==0)
           {
               return arr.get(i);
           }
       }
       return -1;
   }
   static void d()
   {
       for(int i=0; i<arr.size(); i++)
       System.out.print(arr.get(i)+" ");
       System.out.println();
   }
   static void func(long n)
   {
       int size=arr.size();
       arr.add(n);
       for(int i=0; i<size; i++)
       {
           long temp=arr.get(i);
           arr.add(temp+n);
       }
   }
}
