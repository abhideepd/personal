package Practice;
import java.io.*;
public class db1 {
    public static void main(String[] args)throws IOException {
        BufferedReader x=new BufferedReader(new InputStreamReader(System.in));
        int T=Integer.parseInt(x.readLine());
        for(int i1=0; i1<T; i1++)
        {
            String input[]=(x.readLine()).split(" ");
            int arr[]=new int[input.length];
            int temp_c=Integer.MIN_VALUE;
            int temp_a=Integer.MIN_VALUE;
            for(int i=0; i<input.length; i++)
            {
                arr[i]=Integer.parseInt(input[i]);
            }            
            int max_c[]=new int[input.length];
            int min_a[]=new int[input.length];
            //MAXIMUM
            for(int i=input.length-1; i>=2; i--)
            {
                if(arr[i]>temp_c)
                temp_c=arr[i];
                max_c[i]=temp_c;
            }
            //MINIMUM
            for(int i=0; i<input.length-2; i++)
            {
                if((arr[i]>temp_a)&&(arr[i]<arr[i+1])&&(arr[i]<max_c[i+2]))
                temp_a=arr[i];
                min_a[i]=temp_a;
            }
            
            int result=Integer.MIN_VALUE;
            for(int i=1; i<input.length-1; i++)
            {
                int b=arr[i];
                int a=min_a[i-1];
                int c=max_c[i+1];
                if((a<b)&&(b<c))
                {
                    int temp=a-b+c;
                    if(result<temp)
                    result=temp;
                }
            }
            if(result<=0)
            result=0;
            System.out.println(result);
        }
    }
}