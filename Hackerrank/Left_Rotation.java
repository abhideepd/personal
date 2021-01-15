package Hackerrank;
import java.io.*;
import java.util.*;
public class Left_Rotation
{
    public static void main(String []args)throws IOException 
    {
        testing1();
    }
    static void testing1()throws IOException
    {
        BufferedReader x=new BufferedReader(new InputStreamReader(System.in));
        String sizes[]=(x.readLine()).split(" ");
        int n=Integer.parseInt(sizes[0]);
        int d=Integer.parseInt(sizes[1]);
        String arr_input[]=(x.readLine()).split(" ");
        List<Integer> arr=new ArrayList<>();
        int k=0;
        for(String i:arr_input)
        arr.add(Integer.parseInt(i));
        List<Integer> output=rotateLeft(d, arr);
        System.out.println("Answer: ");
        for(int i:output)
        System.out.print(i+" ");
    }
    public static List<Integer> rotateLeft(int d, List<Integer> arr) 
    {
        // Write your code here    
        int n=arr.size();
        d=d%n;
        for(int i=0; i<n; i++)
        arr.add(arr.get(i));
        ArrayList<Integer> output=new ArrayList<Integer>();
        for(int i=d; i<n+d; i++)
        output.add(arr.get(i));
        return output;
    }
    static void swap(int a, int b, List<Integer> arr)
    {
        int temp=arr.get(a);
        arr.set(a, arr.get(b));
        arr.set(b, temp);
    }
}
