package Hackerrank;
import java.io.*;
import java.util.*;
public class poisonous_plant 
{
    public static void main(String []args)throws IOException
    {
        BufferedReader x=new BufferedReader(new InputStreamReader(System.in));
        int size=Integer.parseInt(x.readLine());
        String input[]=(x.readLine()).split(" ");
        int arr[]=new int[size];
        for(int i=0; i<input.length; i++)
        arr[i]=Integer.parseInt(input[i]);
        //System.out.print("\nAnswer: ");
        System.out.print("\nAnswer: "+poisonousPlants(arr));
    }
    static int poisonousPlants(int[] p) 
    {
        
        //print("Input", p);

        //print("nearest_greatest_left_index", nearest_greatest_left(p));
        //print("nearest_greatest_left", index_to_value(nearest_greatest_left(p), p));

        //print("nearest_greatest_right_index", nearest_greatest_right(p));
        //print("nearest_greatest_right", index_to_value(nearest_greatest_right(p), p));

        print("nearest_smallest_left_index", nearest_smallest_left(p));
        print("nearest_smallest_left", index_to_value(nearest_smallest_left(p), p));

        //print("nearest_smallest_right_index", nearest_smallest_right(p));
        //print("nearest_smallest_right", index_to_value(nearest_smallest_right(p), p));
        
        int ans=Integer.MIN_VALUE;
        int []nearest_left_smallest=nearest_smallest_left(p);
        for(int i=0; i<p.length; i++)
        {
            ans=Math.max(ans, i-nearest_left_smallest[i]);
        }
        
        return ans;
    }
    static ArrayList<Integer> new_function(ArrayList<Integer> arr)
    {
        ArrayList<Integer> ans=new ArrayList<Integer>();
        ans.add(arr.get(0));
        for(int i=1; i<arr.size(); i++)
        {
            int left=arr.get(i-1);
            int right=arr.get(i);
            if(right>left)
            continue;
            ans.add(right);
        }
        return ans;
    }
    static void print(String a, int []aa)
    {
        System.out.print("\n"+a+": ");
        for(int i:aa)
        System.out.print(i+" ");
    }
    static int[] index_to_value(int key[], int value[])
    {
        int ans[]=new int[key.length];
        for(int i=0; i<key.length; i++)
        {
            ans[i]=value[key[i]];
        }
        return ans;
    }
    static int[] nearest_greatest_left(int []a)
    {
        int ans[]=new int[a.length];
        Stack<Integer> s=new Stack<Integer>();
        for(int i=0; i<a.length; i++)
        {
            while((s.size()!=0)&&(a[s.peek()]<=a[i]))
            s.pop();

            if(s.size()==0)
            ans[i]=i;
            else
            ans[i]=s.peek();
            s.push(i);
        }
        //print("\nnearest_greatest_left: ",s);
        return ans;
    }
    static int[]nearest_greatest_right(int []a)
    {
        int ans[]=new int[a.length];
        Stack<Integer> s=new Stack<Integer>();
        for(int i=a.length-1; i>=0; i--)
        {
            while((s.size()!=0)&&(a[s.peek()]<=a[i]))
            s.pop();

            if(s.size()==0)
            ans[i]=i;
            else
            ans[i]=s.peek();
            s.push(i);
        }
        //print("\nnearest_greatest_right: ",s);
        return ans;
    }
    static int[] nearest_smallest_left(int []a)
    {
        int ans[]=new int[a.length];
        Stack<Integer> s=new Stack<Integer>();
        for(int i=0; i<a.length; i++)
        {
            while((s.size()!=0)&&(a[s.peek()]>=a[i]))
            s.pop();

            if(s.size()==0)
            ans[i]=i;
            else
            ans[i]=s.peek();
            s.push(i);
        }
        //print("\nnearest_smallest_left: ",s);
        return ans;
    }
    static int[]nearest_smallest_right(int []a)
    {
        int ans[]=new int[a.length];
        Stack<Integer> s=new Stack<Integer>();
        for(int i=a.length-1; i>=0; i--)
        {
            while((s.size()!=0)&&(a[s.peek()]>=a[i]))
            s.pop();

            if(s.size()==0)
            ans[i]=i;
            else
            ans[i]=s.peek();
            s.push(i);
        }
        //print("\nnearest_smallest_right: ",s);
        return ans;
    }
    static void print(String a, Stack<Integer> aa)
    {
        System.out.print("\n"+a+"_Stack: ");
        for(int i:aa)
        System.out.print(i+" ");
    }
}
