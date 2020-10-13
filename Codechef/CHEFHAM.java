package Codechef;
import java.io.*;
import java.util.*;
public class CHEFHAM {
    public static void main(String []args)throws IOException
    {
        BufferedReader x=new BufferedReader(new InputStreamReader(System.in));
        int t=Integer.parseInt(x.readLine());
        for(int i1=0; i1<t; i1++)
        {
            int size=Integer.parseInt(x.readLine());
            String input[]=(x.readLine()).split(" ");

            ArrayList<Integer> duplicates=new ArrayList<Integer>();
            ArrayList<Integer> unique=new ArrayList<Integer>();
            HashMap<Integer, Integer> temp_unique=new HashMap<Integer, Integer>();

            int arr[]=new int[size];
            int ans_arr[]=new int[size];

            for(int i=0; i<size; i++)
            {
                int temp=Integer.parseInt(x.readLine());
                arr[i]=temp;

                if(temp_unique.containsKey(temp))
                {
                    temp_unique.remove(temp);
                    duplicates.add(temp);
                }
                else
                {
                    temp_unique.put(temp, 0);
                }
            }

            //---  c/p all hashmap values to arraylist
            for(Map.Entry m:temp_unique.entrySet())
            {
                unique.add((int)m.getKey());
            }

            //--- 3 cases:
            /*
            0.) input Array size == 3 
            1.) duplicates arraylist size == 0
            2.) duplicates arraylist size == 1
            3.) duplicates arraylist size > 1
            */

            
        }
    }
}
