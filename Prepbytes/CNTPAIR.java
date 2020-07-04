package Prepbytes;
import java.io.*;
public class CNTPAIR {
    public static void main(String[] args)throws IOException {
        BufferedReader x=new BufferedReader(new InputStreamReader(System.in));
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
        Arrays.sort(arr);

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
    }
}