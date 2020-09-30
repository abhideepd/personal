package Prepbytes;
import java.io.*;
import java.util.*;
public class DGAME {
    static ArrayList<Integer> arr=new ArrayList<Integer>();
    public static void main(String []args)throws IOException
    {
        BufferedReader x=new BufferedReader(new InputStreamReader(System.in));
        int t=Integer.parseInt(x.readLine());
        for(int i1=0; i1<t; i1++)
        {
            arr=new ArrayList<Integer>();
            String input[]=(x.readLine()).split(" ");
            String N=(input[0]);
            int M=Integer.parseInt(input[1]);
            input_in_arraylist(N);
            for(int i=0; i<M; i++)
            extract_min(M);
            print_ans();
        }
    }
    static void print_ans()
    {
        for(int i=0; i<arr.size()-1; i++)
        {
            if(arr.get(i)!=10)
            System.out.print(arr.get(i));
        }
        System.out.println();
    }
    static void extract_min(int M)
    {
        for(int i=1; i<arr.size(); i++)
        {
            if(arr.get(i-1)<arr.get(i))
            {
                //arr.set(i-1, 10);
                arr.remove(i-1);
                break;
            }
        }
    }
    static void input_in_arraylist(String a)
    {
        for(int i=0; i<a.length(); i++)
        {
            arr.add(Integer.parseInt(a.charAt(i)+""));
        }
        arr.add(11);
    }
}