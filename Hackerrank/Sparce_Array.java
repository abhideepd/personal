package Hackerrank;
import java.io.*;
import java.util.*;
public class Sparce_Array 
{
    public static void main(String []args)throws IOException
    {
        //testing1();
        testing2();
    }
    static void testing1()
    {
        String []strings={"ab", "ab", "abc"};
        String []queries={"ab", "abc", "bc"};
        int output_arr[]=matchingStrings(strings, queries);
        System.out.println("Output array length: "+output_arr.length);
        for(int i:output_arr)
        System.out.println(i);
        System.out.println("END");
    }
    static void testing2()throws IOException
    {
        BufferedReader x=new BufferedReader(new InputStreamReader(System.in));
        int strings_size=Integer.parseInt(x.readLine());
        String strings[]=new String[strings_size];
        for(int i=0; i<strings_size; i++)
        {
            strings[i]=x.readLine();
        }
        int queries_size=Integer.parseInt(x.readLine());
        String queries[]=new String[queries_size];
        for(int i=0; i<queries_size; i++)
        {
            queries[i]=x.readLine();
        }
        int output_arr[]=matchingStrings(strings, queries);
        System.out.println("Output array length: "+output_arr.length);
        for(int i:output_arr)
        System.out.println(i);
        System.out.println("END");
    }
    static int[] matchingStrings(String[] strings, String[] queries) 
    {
        int output_arr[]=new int[queries.length];
        HashMap<String, Integer> hm=new HashMap<String, Integer>();
        for(String i:strings)
        {
            if(!hm.containsKey(i))
            hm.put(i, 1);
            else
            hm.put(i, hm.get(i)+1);
        }
        int k=0;
        for(String query:queries)
        {
            if(hm.containsKey(query))
            output_arr[k]=hm.get(query);
            ++k;
        }
        return output_arr;
    }
}
