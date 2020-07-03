package Prepbytes;
import java.io.*;
public class CNTPAIR {
    public static void main(String[] args)throws IOException {
        BufferedReader x=new BufferedReader(new InputStreamReader(System.in));
<<<<<<< HEAD
        //input size and 'K'
        String input1[]=(x.readLine()).split(" ");
        int size=Integer.parseInt(input1[0]);
        int K=Integer.parseInt(input1[1]);
        //Input array
        String input2[]=(x.readLine()).split(" ");
        //convert input array to integer
        int arr[]=new int[size];
        for(int i=0; i<size; i++)
        {
            arr[i]=Integer.parseInt(input2[i]);
        }
        int index[]=new int[1000000001];
        for(int i=0; i<size; i++)
        {
            
        }
=======
        //input 'N' and 'K'
        String input1[]=(x.readLine()).split(" ");
        int size=Integer.parseInt(input1[0]);
        int K=Integer.parseInt(input1[1]);
        //Input input array
        String input2[]=(x.readLine()).split(" ");
        //convert string array  to integer array
        int arr[]=new int[size];
        int max=-1;
        for(int i=0; i<size; i++)
        {
            arr[i]=Integer.parseInt(input2[i]);
            if(max<arr[i])
            max=arr[i];
        }
        //int index[]=new int[max+1];
        int index[]=new int[1000000000];
        //System.out.println("max: "+max);
        for(int i=0; i<size; i++)
        {
            //System.out.println(i);
            index[arr[i]]=index[arr[i]]+1;
        }
        int result=0;

        //TEST
        //for(int i=0; i<max+1; i++)
        //System.out.println(i+"--->"+index[i]);
        //TEST
        //System.out.println(K);
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
            //System.out.println(temp1+" "+temp2+"--->"+result);
        }
        System.out.println(result);
>>>>>>> f432c2d75d3a0aa7ffc9908e06546f7b2ff10951
    }
}