package Prepbytes;
import java.io.*;
public class RECTSB {
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
            int min=arr[0];
            int max=arr[size-1];
            int min_pos=0;
            int max_pos=size-1;

            for(int i=0; i<size; i++)
            {
                if(arr[i]<=min)
                {
                    min_pos=i;
                    break;
                }
            }
            for(int i=0; i<size; i++)
            {
                if(arr[i]>=max)
                {
                    max_pos=i;
                    break;
                }
            }
            if(min_pos>max_pos)
            {
                System.out.println(1);
            }
            else{
                
            }
        }
    }
}