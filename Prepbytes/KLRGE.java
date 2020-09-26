package Prepbytes;
import java.io.*;
import java.util.*;
public class KLRGE {
    static int heap[];
    static int size_of_heap=0;
    public static void main(String []args)throws IOException
    {
        BufferedReader x=new BufferedReader(new InputStreamReader(System.in));
        int T=Integer.parseInt(x.readLine());
        for(int i1=0; i1<T; i1++)
        {
            size_of_heap=0;
            String input1[]=(x.readLine()).split(" ");
            int size=Integer.parseInt(input1[0]);
            int k=Integer.parseInt(input1[1]);
            String input_array[]=(x.readLine()).split(" ");
            heap=new int[size+1];
            for(int i=0; i<size; i++)
            {
                insert(Integer.parseInt(input_array[i]));
            }
            for(int i=1; i<k; i++)
            {
                int temp=extract_max();
            }
            System.out.println(extract_max());
        }
    }
    public static void insert(int n)
    {
        ++size_of_heap;
        heap[size_of_heap]=n;
        insert_in_heap(size_of_heap);
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
        int tmep=heap[a];
        heap[a]=heap[b];
        heap[b]=tmep;
    }
    static int extract_max()
    {
        int max=heap[1];
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
        largest=left;

        if((right<=size_of_heap)&&(heap[largest]<heap[right]))
        largest=right;

        if(largest!=root)
        {
            swap(largest, root);
            max_heapify(largest);
        }
    }
}
