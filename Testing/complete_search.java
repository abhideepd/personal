package Testing;
import java.io.*;
import java.util.*;
public class complete_search 
{   
    static int n=0;
    static Stack<Integer> subset=new Stack<Integer>(); 
    public static void main(String []args)throws IOException
    {
        //input();
        n=3;
        search(0);
    }
    static void search(int k)
    {
        if(k==n)
        {
            System.out.println(subset);
        }
        else
        {
            search(k+1);
            subset.push(k);
            search(k+1);
            subset.pop();
        }
    }
}   
