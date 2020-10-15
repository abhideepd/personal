package GeeksforGeeks;
import java.io.*;
import java.util.*;
public class tournament {
    int max=Integer.MIN_VALUE;
    int min=Integer.MAX_VALUE;
    int arr[];
    public static void main(String []args)throws IOException
    {
        BufferedReader x=new BufferedReader(new InputStreamReader(System.in));

        tc obj=new tc();
        starter(obj.inp1);
        starter(obj.inp2);
        starter(obj.inp3);
        starter(obj.inp4);
        starter(obj.inp5);
        starter(obj.inp6);
    }
    static void starter(String inp)
    {
        String temp_inp[]=inp.split(" ");
        tournament obj=new tournament();
        obj.arr=new int[temp_inp.length];
        for(int i=0;i<obj.arr.length; i++)
        {
            obj.arr[i]=Integer.parseInt(temp_inp[i]);
        }
        obj.max_min(obj, 0, obj.arr.length-1);
        System.out.println(obj.max+" "+obj.min);
    }
    void max_min(tournament obj, int low, int high)
    {
        if(high-low<=1)
        {
            if(obj.arr[low]<obj.min)
            obj.min=obj.arr[low];

            if(obj.arr[low]>obj.max)
            obj.max=obj.arr[low];

            if(obj.arr[high]<obj.min)
            obj.min=obj.arr[high];

            if(obj.arr[high]>obj.max)
            obj.max=obj.arr[high];

            return;
        }
        else
        {
            int mid=(low+high)/2;
            max_min(obj, low, mid);
            max_min(obj, mid+1, high);
        }
    }
}
class tc
{
    String inp1="10 9 8 7 6 5 4 3 2 1";
    String inp2="4 8 1 2 3 0 11 23 5 5";
    String inp3="1 1 1 1 1 1 1 1 1 1";
    String inp4="1 1 1 1 1 2 2 2 2 2";
    String inp5="1 2 3 4 5 6 7 8 9";
    String inp6="1";
}
    