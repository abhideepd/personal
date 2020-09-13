package Prepbytes;
import java.io.*;
public class HPSRT {
    static int arr[];
    static int size;
    public static void main(String []args)throws IOException
    {
        BufferedReader x=new BufferedReader(new InputStreamReader(System.in));
        int T=Integer.parseInt(x.readLine());

        for(int i1=0; i1<T; i1++)
        {
            size=Integer.parseInt(x.readLine());
            String input[]=(x.readLine()).split(" ");
            arr=new int[size+1];
            int min_array[]=new int[size];

            for(int i=1; i<=size; i++)
            {
                int temp=Integer.parseInt(input[i-1]);
                arr[i]=temp;
                increase(i);
            }

            for(int i=size-1; i>=0; i--)
            {
                //print();
                int temp=extract_min();
                min_array[i]=temp;
            }

            print(min_array);
        }
    }
    static void print()
    {
        for(int i=1; i<=size; i++)
        System.out.print(arr[i]+" ");

        System.out.println();
    }
    static void print(int []array)
    {
        for(int i=0; i<array.length; i++)
        {
            System.out.print(array[i]+" ");
        }
        System.out.println();
    }
    public static int extract_min()
    {
        int ans=arr[1];
        arr[1]=arr[size];
        --size;
        min_heapify(1);
        return ans;
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
    static void increase(int n)
    {
        if(n==1)
        return;

        if(arr[n/2]>arr[n])
        swap(n/2, n);

        increase(n/2);
    }
    static void swap(int a, int b)
    {
        int temp=arr[b];
        arr[b]=arr[a];
        arr[a]=temp;
    }
}