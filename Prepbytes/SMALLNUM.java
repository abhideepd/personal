package Prepbytes;
import java.io.*;
public class SMALLNUM {
    public static void main(String[] args)throws IOException {
        BufferedReader x=new BufferedReader(new InputStreamReader(System.in));
        //Input size of array
        int size=Integer.parseInt(x.readLine());
        //Input array
        String input[]=(x.readLine()).split(" ");
        //Input K
        int K=Integer.parseInt(x.readLine());
        //convert string array to integer
        int arr[]=new int[size];
        for(int i=0; i<size; i++)
        {
            arr[i]=Integer.parseInt(input[i]);
        }
        //create an index array and store the the frequency of nos.
        int index[]=new int[100001];

        for(int i=0; i<size; i++)
        {
            index[arr[i]]=index[arr[i]]+1;
        }
        //find out K
        for(int i=0; i<100001; i++)
        {
            if(index[i]==K)
            {
                System.out.println(i);
                break;
            }
        }
    }
}