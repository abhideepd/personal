package Prepbytes;
import java.io.*;
public class TRANSPOINT {
public static void main(String[] args)throws IOException {
    BufferedReader x=new BufferedReader(new InputStreamReader(System.in));
    //Input Testcase
    int T=Integer.parseInt(x.readLine());

    for(int i1=0; i1<T; i1++)
    {
        //length
        int size=Integer.parseInt(x.readLine());
        //input string
        String input[]=(x.readLine()).split(" ");
        //change input to integer
        int arr[]=new int[size];
        for(int i=0; i<size; i++)
        {
            arr[i]=Integer.parseInt(input[i]);
        }
        //Output
        if(arr[size-1]==0)
        System.out.println(-1);
        else if(arr[0]==1)
        System.out.println(0);
        else
        System.out.println(func(arr));
    }
}
static int func(int []arr)
{
    int l=0;
    int r=arr.length;
    int m=(l+r)/2;

    while(l<r)
    {
        //System.out.println(l+" "+r);
        if(arr[m]==1)
            if(arr[m-1]==0)
            break;
            else
            r=m-1;
        else
        l=m+1;
        m=(l+r)/2;
    }
    return m;
}
}