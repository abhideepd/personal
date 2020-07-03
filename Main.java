//package Prepbytes;
import java.io.*;
public class Main {
    public static void main(String[] args)throws IOException {
        BufferedReader x=new BufferedReader(new InputStreamReader(System.in));
    
        String input1[]=(x.readLine()).split(" ");
        int size=Integer.parseInt(input1[0]);
        int K=Integer.parseInt(input1[1]);
  
        String input2[]=(x.readLine()).split(" ");

        int arr[]=new int[size];
        int max=-1;
        for(int i=0; i<size; i++)
        {
            arr[i]=Integer.parseInt(input2[i]);
            if(max<arr[i])
            max=arr[i];
        }
        int index[]=new int[max+1];
 
        for(int i=0; i<size; i++)
        {
            index[arr[i]]=index[arr[i]]+1;
        }
        int result=0;

        for(int i=0; i<max+1; i++)
        {
            int temp1=i;
            int temp2=temp1+K;
            
            if(temp2<max+1)
            {
                result=result+(index[temp1]<=index[temp2]?index[temp1]:index[temp2]);
            }
            else
            break;
        }
        System.out.println(result);
    }
}