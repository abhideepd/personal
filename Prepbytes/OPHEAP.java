package Prepbytes;
import java.io.*;
import java.util.*;
public class OPHEAP {
    static int size=0;
    static int arr[];
    public static void main(String []args)throws IOException
    {
        //Testcases
        BufferedReader x=new BufferedReader(new InputStreamReader(System.in));
        int T=Integer.parseInt(x.readLine());

        for(int i1=0; i1<T; i1++)
        {
            size=Integer.parseInt(x.readLine());
            arr=new int[size+1];
            String input[]=(x.readLine()).split(" ");
            
            for(int i=1; i<=size; i++)
            {
                int temp=Integer.parseInt(input[i-1]);
                arr[i]=temp;
                insert(i);
            }
            //print();
            System.out.print(extract_min()+" ");
            //int ans=extract_min();
            print();
        }
    }
    static int extract_min()
    {
        int ans=arr[1];
        arr[1]=arr[size];
        --size;
        //print();
        min_heapify(1);
        return ans;
    }
    static void min_heapify(int root)
    {
        int left=2*root;
        int right=2*root+1;
        int smallest=root;

        if((left<=size)&&(arr[left]<arr[root]))
        {
            smallest=left;
        }

        if((right<=size)&&(arr[right]<arr[smallest]))
        {
            smallest=right;
        }

        if(smallest!=root)
        {
            swap(smallest, root);
            min_heapify(smallest);
        }
    }
    static void insert(int n)
    {
        if(n==1)
        return;

        if(arr[n/2]>arr[n])
        swap(n/2, n);

        insert(n/2);
    }
    static void print()
    {
        for(int i=1; i<size+1; i++)
        System.out.print(arr[i]+" ");

        System.out.println();
    }    
    static void swap(int a, int b)
    {
        int temp=arr[a];
        arr[a]=arr[b];
        arr[b]=temp;
    }
}