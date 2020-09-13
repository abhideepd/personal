package Prepbytes;
import java.io.*;
public class DLHEAP {
    static int arr[];
    static int size;
    public static void main(String []args)throws IOException
    {
        BufferedReader x=new BufferedReader(new InputStreamReader(System.in));
        int T=Integer.parseInt(x.readLine());

        for(int i1=0; i1<T; i1++)
        {
            String input_kN[]=(x.readLine()).split(" ");
            size=Integer.parseInt(input_kN[0]);
            int k=Integer.parseInt(input_kN[1].trim());

            String input_array[]=(x.readLine()).split(" ");
            arr=new int[size+1];
            int k_element[]=new int[k-1];

            for(int i=1; i<size+1; i++)
            {
                int temp=Integer.parseInt(input_array[i-1]);
                arr[i]=temp;
                increase(i);
            }

            //remove
            arr[k]=Integer.MIN_VALUE;
            increase(k);
            int temp=extract_min();
            print();            
        }
    }
    static void print()
    {
        for(int i=1; i<=size; i++)
        System.out.print(arr[i]+" ");

        System.out.println();
    }
    public static void min_heapify(int root)
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
    public static int extract_min()
    {
        int ans=arr[1];
        arr[1]=arr[size];
        --size;
        min_heapify(1);
        return ans;
    }
    public static void increase(int n)
    {
        if(n==1)
        return;

        if(arr[n/2]>arr[n])
        swap(n/2, n);

        increase(n/2);
    }
    public static void swap(int a, int b)
    {
        int temp=arr[a];
        arr[a]=arr[b];
        arr[b]=temp;
    }
}