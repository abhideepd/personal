package Prepbytes;
import java.io.*;
public class BUNST {
    public static void main(String[] args)throws IOException {
        BufferedReader x=new BufferedReader(new InputStreamReader(System.in));
        String input1[]=(x.readLine()).split(" ");
        String input2[]=(x.readLine()).split(" ");
        int N=Integer.parseInt(input1[0]);
        int K=Integer.parseInt(input1[1]);
        int arr[]=new int[N];
        int min=Integer.parseInt(input2[0]);
        int sum=0;
        for(int i=0; i<N; i++)
        {
            arr[i]=Integer.parseInt(input2[i]);
            if(arr[i]<min)
            min=arr[i];
            sum=sum+arr[i];
        }
        if(K<N)
        System.out.println(0);
        else if(K>sum)
        System.out.println(0);
        else
        {
            int result=sum/K;
            if(result>min)
            System.out.println(min);
            else
            System.out.println(result);
            //System.out.println(xyz(K, 0, min, arr));
        }
    }
    static int xyz(int K, int sum, int min, int[] arr)
    {
        while(min!=0)
        {
            if(K==sum)
            return min;

            sum=0;
            for(int i=0; i<arr.length; i++)
            {
                sum=sum+(arr[i]/min);
            }
            --min;
        }
        return 0;
    }
}