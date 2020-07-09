package Prepbytes;
import java.io.*;
public class MAXPRO {
    public static void main(String[] args)throws IOException {
        BufferedReader x=new BufferedReader(new InputStreamReader(System.in));
        int T=Integer.parseInt(x.readLine());
        for(int i1=0; i1<T; i1++)
        {
            int size=Integer.parseInt(x.readLine());
            String input[]=(x.readLine()).split(" ");
            int arr[]=new int[size];
            for(int i=0; i<size; i++)
            {
                arr[i]=Integer.parseInt(input[i]);
            }
            
            int result=0, a=100000000, max=arr[0], min=arr[0];
            for(int i=1; i<size; i++)
            {
                if(arr[i]<arr[i-1])
                {
                    int temp=max-min;
                    temp=temp>0?temp:0;
                    result=result+temp;
                    //System.out.println("XYZ: "+max+" "+min);
                    max=arr[i];
                    min=arr[i];
                }
                    if(arr[i]>max)
                    max=arr[i];

                    if(arr[i]<min)
                    min=arr[i];
            }
            int temp=max-min;
                temp=temp>0?temp:0;
                result=result+temp;
                //System.out.println("XYZ: "+max+" "+min);
            System.out.println(result);
        }
    }
}