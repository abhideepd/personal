package Prepbytes;
import java.io.*;
import java.util.*;
public class SWSUM {
    static int subarray_min_heap[];
    static int discarded_max_heap[];
    static int size_subarray_min_heap=0;
    static int size_discarded_max_heap=0;
    static int start=0, end=0, max_sum=0;
    public static void main(String []args)throws IOException
    {
        BufferedReader x=new BufferedReader(new InputStreamReader(System.in));
        String input1[]=(x.readLine()).split(" ");
        int N=Integer.parseInt(input1[0]);
        int S=Integer.parseInt(input1[1]);

        String input2[]=(x.readLine().split(" "));
        int input_array[]=new int[N];
        subarray_min_heap=new int[N+1];
        discarded_max_heap=new int[N+1];

        for(int i=0; i<N; i++)
        {
            input_array[i]=Integer.parseInt(input2[i]);
        }

        kadane(input_array);
        
        for(int i=0; i<N; i++)
        {
            if((i>=start)&&(i<=end))
            {
                //insert in subarray min heap
                insert(1, input_array[i]);
            }
            else
            {
                //insert in discarded maxheap
                insert(2, input_array[i]);
            }
        }
        // 1 --> sunarray
        // 2 --> discarded
        while(S-->=0)
        {
            int sum1=max_sum-peek(1)+peek(2);
            if(sum1>max_sum)
            {
                max_sum=sum1;
                int min_from_sub=peek(1);
                int max_from_dis=peek(2);
                extract(1);
                extract(2);
                insert(1, max_from_dis);
                insert(2, min_from_sub);
            }
            else
            {
                break;
            }
        }
        print();
        System.out.println(max_sum);
    }
    static int peek(int n)
    {
        if(n==1)
        {
            //subarray
            if(size_subarray_min_heap==0)
            return Integer.MIN_VALUE;
            return subarray_min_heap[1];
        }
        else
        {
            //discarded
            if(size_discarded_max_heap==0)
            return Integer.MIN_VALUE;
            return discarded_max_heap[1];
        }
    }
    static void extract(int n)
    {
        if(n==1)
        {
            //subarray
            swap(1, 1, size_subarray_min_heap);
            --size_subarray_min_heap;
            subarray_min_heapify(1);
        }
        else
        {
            //discarded
            swap(2, 1, size_discarded_max_heap);
            --size_discarded_max_heap;
            discarded_max_heapify(1);
        }
    }
    static void insert(int n, int val)
    {
        if(n==1)
        {
            ++size_subarray_min_heap;
            subarray_min_heap[size_subarray_min_heap]=val;
            insert_subarray_min_heap(size_subarray_min_heap);
        }
        else
        {
            ++size_discarded_max_heap;
            discarded_max_heap[size_discarded_max_heap]=val;
            insert_discarded_max_heap(size_discarded_max_heap);
        }
    }
    static void insert_subarray_min_heap(int n)
    {
        if(n==1)
        return;

        if(subarray_min_heap[n/2]>subarray_min_heap[n])
        swap(1, n/2, n);

        insert_subarray_min_heap(n/2);
    }
    static void insert_discarded_max_heap(int n)
    {
        if(n==1)
        return;

        if(discarded_max_heap[n/2]<discarded_max_heap[n])
        swap(2, n/2, n);

        insert_discarded_max_heap(n/2);
    }
    static void discarded_max_heapify(int root)
    {
        int largest=root;
        int left=2*root;
        int right=2*root+1;

        if((left<=size_discarded_max_heap)&&(discarded_max_heap[largest]<discarded_max_heap[left]))
        largest=left;

        if((right<=size_discarded_max_heap)&&(discarded_max_heap[largest]<discarded_max_heap[right]))
        largest=right;

        if(largest!=root)
        {
            swap(2, largest, root);
            discarded_max_heapify(largest);
        }
    }
    static void subarray_min_heapify(int root)
    {
        int smallest=root;
        int left=root*2;
        int right=root*2+1;

        if((left<=size_subarray_min_heap)&&(subarray_min_heap[smallest]>subarray_min_heap[left]))
        smallest=left;

        if((right<=size_subarray_min_heap)&&(subarray_min_heap[smallest]>subarray_min_heap[right]))
        smallest=right;

        if(smallest!=root)
        {
            swap(1, smallest, root);
            subarray_min_heapify(smallest);
        }
    }
    static void swap(int n, int a, int b)
    {
        if(n==1)
        {
            int temp=subarray_min_heap[a];
            subarray_min_heap[a]=subarray_min_heap[b];
            subarray_min_heap[b]=temp;
        }
        else
        {
            int temp=discarded_max_heap[a];
            discarded_max_heap[a]=discarded_max_heap[b];
            discarded_max_heap[b]=temp;
        }
    }
    static void print()
    {
        System.out.println();
        System.out.println("Testing");
        System.out.println(start+" "+end+" "+max_sum);
        System.out.println("Heaps:- ");

        for(int i=1; i<=size_subarray_min_heap; i++)
        {
            System.out.print(subarray_min_heap[i]+" ");
        }
        System.out.println();
        for(int i=1; i<=size_discarded_max_heap; i++)
        {
            System.out.print(discarded_max_heap[i]+" ");
        }
        System.out.println();
    }
    static void kadane(int []arr)
    {
        int curr_sum=0, max=Integer.MIN_VALUE, s=0, e=0;
        for(int i=0; i<arr.length; i++)
        {
            curr_sum=curr_sum+arr[i];
            if(max<curr_sum)
            {
                max=curr_sum;
                start=s;
                end=i;
            }
            if(curr_sum<0)
            {
                curr_sum=0;
                s=i+1;
            }
        }
        max_sum=max;
    }
}
