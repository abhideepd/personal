package GeeksforGeeks;
import java.io.*;
import java.util.*;
public class string_permutation {
    static TreeMap<String, Integer> answer=new TreeMap<String, Integer>();
    public static void main(String []args)throws IOException
    {
        BufferedReader x=new BufferedReader(new InputStreamReader(System.in));
        int t=Integer.parseInt(x.readLine());
        for(int i1=0; i1<t; i1++)
        {
            answer=new TreeMap<String, Integer>();
            String input=x.readLine();
            char arr[]=input.toCharArray();
            fuckthisbitch(input, "");
            //permute(arr, 0);
            //System.out.println(answer);
            print_answer();
            System.out.println();
        }
    }
    static void print_answer()
    {
        Set<String> keys=answer.keySet();
        for(String key:keys)
        System.out.print(key+" ");
    }
    static void permute(char []arr, int j)
    {
        if(j==arr.length)
        {
            //print(arr);
            String temp=arr.toString();
            answer.put(temp, 0);
            return;
        }
        for(int i=j; i<arr.length; i++)
        {
            arr=swap(j, i, arr);
            permute(arr, j+1);
            arr=swap(j, i, arr);
        }
    }
    static void print(char []arr)
    {
        System.out.print(arr);
        System.out.print(" ");
    }
    static char[] swap(int a, int b, char []arr)
    {
        char temp=arr[a];
        arr[a]=arr[b];
        arr[b]=temp;
        return arr;
    }
    static void fuckthisbitch(String a, String res)
    {
        if(a.length()==1)
        {
            //System.out.print(res+a+" ");
            answer.put(res+a, 0);
            return;
        }
        for(int i=0; i<a.length(); i++)
        {
            String temp=a.substring(0, i)+a.substring(i+1, a.length());
            fuckthisbitch(temp, res+a.charAt(i));
        }
    }
}
