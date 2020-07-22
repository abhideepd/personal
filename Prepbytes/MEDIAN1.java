package Prepbytes;
import java.io.*;
import java.util.*;
public class MEDIAN1 {
    public static void main(String[] args)throws IOException {
        BufferedReader x=new BufferedReader(new InputStreamReader(System.in));
        String input1[]=(x.readLine()).split(" ");
        int size=Integer.parseInt(input1[0]);
        int K=Integer.parseInt(input1[1]);
        String input2[]=(x.readLine()).split(" ");
        int arr[]=new int[size];
        HashMap<Integer, Integer> array=new HashMap<Integer, Integer>();
        for(int i=0; i<size; i++)
        {
            arr[i]=Integer.parseInt(input2[i]);
            if(!(array.containsKey(arr[i])))
            array.put(arr[i], 1);
            else
            array.put(arr[i], array.get(arr[i])+1);
        }
        int m=(size-1)/2;
        m=arr[m];
        while(K>0)
        {
            //int temp=array[m];
            //array[m+1]=array[m+1]+temp;
            ++m;
            //K=K-temp;
        }
        System.out.println(m);
    }
}