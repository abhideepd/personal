package GeeksforGeeks;
import java.io.*;
import java.util.*;
public class subset_sum {
    static ArrayList<Integer> answer=new ArrayList<Integer>();
    public static void main(String []args)throws IOException
    {
        BufferedReader x=new BufferedReader(new InputStreamReader(System.in));
        int t=Integer.parseInt(x.readLine());
        for(int i1=0; i1<t; i1++)
        {
            answer=new ArrayList<Integer>();
            //answer.add(0);
            int size=Integer.parseInt(x.readLine());
            String input[]=(x.readLine()).split(" ");
            int arr[]=new int[size];
            for(int i=0; i<size; i++)
            arr[i]=Integer.parseInt(input[i]);
            anx(0, arr, 0);
            print_answer();
            System.out.println();
        }
    }
    static void print_answer()
    {
        Collections.sort(answer);
        for(int i=0; i<answer.size(); i++)
        System.out.print(answer.get(i)+" ");
    }
    static void anx(int sum, int []arr, int j)
    {
        answer.add(sum);

        for(int i=j; i<arr.length; i++)
        {
            anx(sum+arr[i], arr, i+1);
        }
    }
}
