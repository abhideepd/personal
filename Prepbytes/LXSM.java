package Prepbytes;
import java.io.*;
public class LXSM {
    static int heap[];
    static int ans_array[];
    static int size=0;
    static int size_of_heap=0;
    public static void main(String []args)throws IOException
    {
        BufferedReader x=new BufferedReader(new InputStreamReader(System.in));
        int T=Integer.parseInt(x.readLine());
        for(int i1=0; i1<T; i1++)
        {
            String input[]=(x.readLine()).split(" ");

            String str=input[0];
            int q=Integer.parseInt(input[1].trim());
            size=str.length();
            heap=new int[size+1];
            ans_array=new int[size];
            int counter=0;
            int ans_array_index=0;

            for(int i=0; i<size; i++)
            {
                if(counter==q)
                {
                    ans_array[ans_array_index++]=extract_min();
                    --counter;
                }
                insert(str.charAt(i));
                ++counter;
            }
            while(size_of_heap!=0)
            {
                ans_array[ans_array_index++]=extract_min();
            }
            print_ans();
        }
    }
    static void print_ans()
    {
        for(int i=0; i<ans_array.length; i++)
        {
            System.out.print((char)ans_array[i]);
        }
        System.out.println();
    }
    public static int extract_min()
    {
        int min=heap[1];
        swap(1, size_of_heap);
        --size_of_heap;
        min_heapify(1);
        return min;
    }
    public static void min_heapify(int root)
    {
        int smallest=root;
        int left=root*2;
        int right=root*2+1;

        if((left<=size_of_heap)&&(heap[left]<heap[smallest]))
        {
            smallest=left;
        }

        if((right<=size_of_heap)&&(heap[right]<heap[smallest]))
        {
            smallest=right;
        }

        if(smallest!=root)
        {
            swap(smallest, root);
            min_heapify(smallest);
        }
    }
    public static void insert(char a)
    {
        int temp=(int)a;
        ++size_of_heap;
        heap[size_of_heap]=temp;
        insert_in_heap(size_of_heap);
    }
    static void insert_in_heap(int a)
    {
        if(a==1)
        return;

        if(heap[a/2]>heap[a])
        swap(a/2, a);

        insert_in_heap(a/2);
    }
    static void swap(int a, int b)
    {
        int temp=heap[a];
        heap[a]=heap[b];
        heap[b]=temp;
    }
}