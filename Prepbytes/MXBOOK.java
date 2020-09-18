package Prepbytes;
import java.io.*;
public class MXBOOK {
    static int arr[];
    static int size;
    public static void main(String []args)throws IOException
    {
        BufferedReader x=new BufferedReader(new InputStreamReader(System.in));
        int T=Integer.parseInt(x.readLine());

        for(int i1=0; i1<T; i1++)
        {
            String input1[]=(x.readLine()).split(" ");
            size=Integer.parseInt(input1[0]);
            int k=Integer.parseInt(input1[1].trim());
            String input[]=(x.readLine()).split(" ");
            arr=new int[size+1];
            int ans=0;
            for(int i=1; i<=size; i++)
            {
                int temp=Integer.parseInt(input[i-1]);
                arr[i]=temp;
                increase(i);
            }
            while(size!=0)
            {
                k=k-extract_min();
                if(k<0)
                break;
                else
                ++ans;
            }
            System.out.println(ans);
        }
    }
    static void increase(int n)
    {
        if(n==1)
        return;

        if(arr[n/2]>arr[n])
        swap(n/2, n);

        increase(n/2);
    }
    static void min_heapify(int root)
    {
        int left=root*2;
        int right=root*2+1;
        int smallest=root;

        if((left<=size)&&(arr[left]<arr[smallest]))
        smallest=left;

        if((right<=size)&&(arr[right]<arr[smallest]))
        smallest=right;

        if(smallest!=root)
        {
            swap(smallest, root);
            min_heapify(smallest);
        }
    }
    static int extract_min()
    {
        int ans=arr[1];
        arr[1]=arr[size];
        --size;
        min_heapify(1);
        return ans;
    }
    static void swap(int a, int b)
    {
        int temp=arr[a];
        arr[a]=arr[b];
        arr[b]=temp;
    }
}