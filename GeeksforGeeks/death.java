package GeeksforGeeks;
import java.io.*;
import java.util.*;
public class death {
    public static void main(String []args)throws IOException
    {
        BufferedReader x=new BufferedReader(new InputStreamReader(System.in));
        int t=Integer.parseInt(x.readLine());
        for(int i1=0; i1<t; i1++)
        {
            String input[]=(x.readLine()).split(" ");
            int n=Integer.parseInt(input[0]);
            int k=Integer.parseInt(input[1]);
            ArrayList<Integer> arr=new ArrayList<Integer>();
            for(int i=0; i<n; i++)
            arr.add(i+1);

            //if(k==1)
            //System.out.println(n);
            //else
            function(arr, k, k, 0);
        }
    } 
    static void function(ArrayList<Integer> arr, int k, int k1, int index)
    {
        //System.out.println(arr);
        if(arr.size()==1)
        {
            System.out.println(arr.remove(0));
            return;
        }

        if(index>=arr.size())
        index=0;

        if(k1<=1)
        {
            k1=k;
            arr.remove(index);
            function(arr, k, k1, index);
            return;
            //--index;
        }

        if(index>=arr.size())
        index=0;

        function(arr, k, k1-1, index+1);
    }
}
