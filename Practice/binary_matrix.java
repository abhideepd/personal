package Practice;
import java.io.*;
import java.util.*;
public class binary_matrix 
{
    public static void main(String []args)throws IOException
    {
        BufferedReader x=new BufferedReader(new InputStreamReader(System.in));
        String input[]=(x.readLine()).split(" ");
        ArrayList<ArrayList<Character>> inp=new ArrayList<ArrayList<Character>>();
        while(Integer.parseInt(input[0])!=-1)
        {
            ArrayList<Character> temp=new ArrayList<Character>();
            for(int i=0; i<input.length; i++)
            {
                //temp.add(Integer.parseInt(input[i]));
                temp.add(input[i].charAt(0));
            }
            inp.add(temp);
            input=(x.readLine()).split(" ");
        }
        //System.out.println(inp);
        //System.out.println("\nSize:  "+"Column: "+inp.size()+" Row: "+inp.get(0).size()+"\n");
        char matrix[][]=new char[inp.size()][inp.get(0).size()];
        for(int i=0; i<inp.size(); i++)
        {
            for(int j=0; j<inp.get(0).size(); j++)
            {
                char temp=inp.get(i).get(j);
                //System.out.println(temp);
                matrix[i][j]=temp;
            }
        }
        //print(matrix);
        System.out.print("\nAnswer:-\n");
        System.out.print(new Solution1().maximalRectangle(matrix));
    }
    static void print(char[][] m)
    {
        System.out.println("SAMPLE:-- ");
        System.out.println("Row: "+m.length);
        System.out.println("Col: "+m[0].length);
        
        for(int i=0; i<m.length; i++)
        {
            for(int j=0; j<m[0].length; j++)
            {
                System.out.print(m[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println("SAMPLE ENDS------");
    }
}
class Solution1 
{
    //int matrix[][];
    public int maximalRectangle(char[][] mat) 
    {
        int matrix[][]=new int[mat.length][mat[0].length];
        change_to_integer_matrix(mat, matrix);
        int arr[]=new int[mat[0].length];
        int ans_max=-1;
        for(int i=0; i<mat.length; i++)
        {
            for(int j=0; j<mat[0].length; j++)
            {
                if(matrix[i][j]!=0)
                arr[j]=arr[j]+matrix[i][j];
            }

            int nearest_smallest_left[]=nearest_smallest_left(arr);
            int nearest_smallest_right[]=nearest_smallest_right(arr);

            for(int j=0; j<mat[0].length; j++)
            {
                int temp_left=nearest_smallest_left[j];
                int temp_right=nearest_smallest_right[j];
                int dist=(j-temp_left)+(temp_right-j)+1;
                int multiplier=Math.min(arr[temp_left], arr[temp_right]);
                System.out.println(temp_left+" "+temp_right+" "+dist+" "+multiplier+" "+(dist*multiplier));
                ans_max=Math.max(ans_max, (dist*multiplier));
            }
            System.out.println();
        }
        return ans_max;
    }
    static void change_to_integer_matrix(char[][] mat, int matrix[][])
    {
        //print(mat);
        for(int i=0; i<mat.length; i++)
        {
            for(int j=0; j<mat[0].length; j++)
            {
                String temp=mat[i][j]+"";
                //System .out.println(temp);
                matrix[i][j]=Integer.parseInt(temp);
            }
        }
    }
    static void print(char[][] m)
    {
        System.out.println("SAMPLE:-- ");
        System.out.println("Row: "+m.length);
        System.out.println("Col: "+m[0].length);
        
        for(int i=0; i<m.length; i++)
        {
            for(int j=0; j<m[0].length; j++)
            {
                System.out.print(m[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println("SAMPLE ENDS------");
    }
    static int[] nearest_smallest_left(int a[])
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
        return ans;
    }
    static int[] nearest_smallest_right(int a[])
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
        return ans;
    }
}