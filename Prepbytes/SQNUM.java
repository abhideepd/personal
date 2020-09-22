package Prepbytes;
import java.io.*;
public class SQNUM {
    static long heap[];
    static int size=0;
    static int size_of_heap=0;
    static long mod=1000000000+7;
    public static void main(String []args)throws IOException
    {
        BufferedReader x=new BufferedReader(new InputStreamReader(System.in));
        int T=Integer.parseInt(x.readLine());
        for(int i1=0; i1<T; i1++)
        {
            size=Integer.parseInt(x.readLine());
            String input[]=(x.readLine()).split(" ");   
            heap=new long[size+1];         
            for(int i=0; i<size; i++)
            {
                int temp=Integer.parseInt(input[i]);
                insert(temp);
            }
            //print_heap();
            while(size_of_heap!=1)
            {
                long P=extract_max();
                long Q=extract_max();                
                long result=((P*3)%mod-(Q*2)%mod)%mod;
                //System.out.println("P: "+P+" Q: "+Q+" result: "+result);
                insert(result);
            }
            System.out.println(extract_max());
        }
    }
    static void print_heap()
    {
        System.out.println("HEAP:-");
        for(int i=1; i<=size_of_heap; i++)
        System.out.print(heap[i]+" ");
        System.out.println();
    }
    static void insert(long n)
    {
        ++size_of_heap;
        heap[size_of_heap]=n;
        insert_in_heap(size_of_heap);
    }
    static long extract_max()
    {
        long max=heap[1];
        swap(1, size_of_heap);
        --size_of_heap;
        max_heapify(1);
        return max;
    }
    static void max_heapify(int root)
    {
        int largest=root;
        int left=root*2;
        int right=root*2+1;

        if((left<=size_of_heap)&&(heap[largest]<heap[left]))
        {
            largest=left;
        }

        if((right<=size_of_heap)&&(heap[largest]<heap[right]))
        {
            largest=right;
        }

        if(largest!=root)
        {
            swap(largest, root);
            max_heapify(largest);
        }
    }
    static void insert_in_heap(int n)
    {
        if(n==1)
        return;

        if(heap[n/2]<heap[n])
        swap(n/2, n);

        insert_in_heap(n/2);
    }
    static void swap(int a, int b)
    {
        long temp=heap[a];
        heap[a]=heap[b];
        heap[b]=temp;
    }
}