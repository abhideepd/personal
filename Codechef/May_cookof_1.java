package Codechef;

/**
 * May_cookof_1
 */
import java.util.*;
import java.io.*;
public class May_cookof_1 {

    public static void main(String[] args)throws IOException {
        BufferedReader x = new BufferedReader(new InputStreamReader(System.in));
        int T=Integer.parseInt(x.readLine());       //Testcase
        for(int i1=0; i1<T; i1++)
        {
            int size=Integer.parseInt(x.readLine());
            String inp[]=(x.readLine()).split(" ");
            //STRATEGY
            /*
            Run a loop on length and create two hashmaps.
            One for storing the no. and one for storing the size.
            If the hashmap contains the no. then print no else print yes
            Do it in separate suntion and return the value 
             */
            if(output(inp))
            System.out.println("YES");
            else
            System.out.println("NO");
        }
    }
    static boolean output(String []inp)
    {
       HashMap<Integer, Integer> a1=new HashMap<Integer, Integer>();//no.
       HashMap<Integer, Integer> a2=new HashMap<Integer, Integer>();//count
       
       int prev=Integer.parseInt(inp[0]), 
            count=1,
            temp=0;
       for(int i=1; i<inp.length; i++)
       {
           temp=Integer.parseInt(inp[i]);
           //System.out.println(temp+"--"+prev);
           if(temp!=prev)
           {
               //System.out.println(prev+": "+count);
               if(a1.containsKey(temp))
               return false;
               if(a2.containsKey(count))
               return false;
               a1.put(prev, 0);
                a2.put(count, 0);
               count =1;
               prev=temp;
           }
           else{
               ++count;
           }
       }
       //System.out.println(temp+": "+count);
       //System.out.println(a1+": "+a2);
       if(a1.containsKey(temp))
       return false;
       if(a2.containsKey(count))
       return false;

       return true;
    }
}