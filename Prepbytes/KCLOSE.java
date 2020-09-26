package Prepbytes;
import java.io.*;
import java.util.*;
public class KCLOSE {
    static int pos_min_heap[];
    static int size_pos_min_heap=0;
    static int neg_min_heap[];
    static int size_neg_min_heap=0;
    static int ans_max_heap[];
    static int size_ans_max_heap=0;
    public static void main(String []args)throws IOException
    {
        BufferedReader x=new BufferedReader(new InputStreamReader(System.in));
        int T=Integer.parseInt(x.readLine());
        for(int i1=0; i1<T; i1++)
        {
            size_pos_min_heap=0;
            size_neg_min_heap=0;
            size_ans_max_heap=0;
            String input1[]=(x.readLine()).split(" ");
            int size=Integer.parseInt(input1[0]);
            int P=Integer.parseInt(input1[1]);//comparison
            int Q=Integer.parseInt(input1[2]);
            int input_array[]=new int[size];
            String input_arr[]=(x.readLine()).split(" ");
            for(int i=0; i<size; i++)
            input_array[i]=Integer.parseInt(input_arr[i]);

            pos_min_heap=new int[size+1];
            neg_min_heap=new int[size+1];
            ans_max_heap=new int[Q+1];

            for(int i=0; i<size; i++)
            {
                int diff=input_array[i]-P;
                if(diff>=0)
                insert_pos_heap(diff);
                else
                insert_neg_heap(diff*-1);
            }
            while(Q!=0)
            {
                //Answer
                int pos=peek_pos_min_heap();
                int neg=peek_neg_min_heap();

                if(pos<neg)
                {
                    insert_ans(extract_pos_min_heap()+P);
                }
                else if(pos>=neg)
                {
                    insert_ans(P-extract_neg_min_heap());
                }
                --Q;
            }
            print_ans();
            //print();
        }
    }
    static void print_ans()
    {
        while(size_ans_max_heap!=0)
        System.out.print(extract_ans_heap()+" ");

        System.out.println();
    }
    static void insert_ans(int n)
    {
        ++size_ans_max_heap;
        ans_max_heap[size_ans_max_heap]=n;
        insert_ans_max_heap(size_ans_max_heap);
    }
    static void insert_ans_max_heap(int n)
    {
        if(n==1)
        return;

        if(ans_max_heap[n/2]<ans_max_heap[n])
        swap_ans_heap(n/2, n);

        insert_ans_max_heap(n/2);
    }
    static int extract_ans_heap()
    {
        int ans=ans_max_heap[1];
        swap_ans_heap(1, size_ans_max_heap);
        --size_ans_max_heap;
        ans_max_heapify(1);
        return ans;
    }
    static void ans_max_heapify(int root)
    {
        int largest=root;
        int left=root*2;
        int right=root*2+1;

        if((left<=size_ans_max_heap)&&(ans_max_heap[largest]<ans_max_heap[left]))
        largest=left;

        if((right<=size_ans_max_heap)&&(ans_max_heap[largest]<ans_max_heap[right]))
        largest=right;

        if(largest!=root)
        {
            swap_ans_heap(root, largest);
            ans_max_heapify(largest);
        }
    }
    static void swap_ans_heap(int a, int b)
    {
        int temp=ans_max_heap[a];
        ans_max_heap[a]=ans_max_heap[b];
        ans_max_heap[b]=temp;
    }
    static void print()
    {
        System.out.println();

        System.out.println("Positive: ");
        for(int i=1; i<=size_pos_min_heap; i++)
        System.out.print(pos_min_heap[i]+" ");

        System.out.println();

        System.out.println("Negative: ");
        for(int i=1; i<=size_neg_min_heap; i++)
        System.out.print(neg_min_heap[i]+" ");

        System.out.println();
    }
    static void insert_neg_heap(int n)
    {
        ++size_neg_min_heap;
        neg_min_heap[size_neg_min_heap]=n;
        insert_neg_min_heap(size_neg_min_heap);
    }
    static void insert_neg_min_heap(int n)
    {
        if(n==1)
        return;

        if(neg_min_heap[n/2]>neg_min_heap[n])
        swap_neg_min_heap(n/2,  n);

        insert_neg_min_heap(n/2);
    }
    static void swap_neg_min_heap(int a, int b)
    {
        int tmep=neg_min_heap[a];
        neg_min_heap[a]=neg_min_heap[b];
        neg_min_heap[b]=tmep;
    }
    static int peek_neg_min_heap()
    {
        if(size_neg_min_heap==0)
        return Integer.MAX_VALUE;

        return neg_min_heap[1];
    }
    static int extract_neg_min_heap()
    {
        int ans=neg_min_heap[1];
        swap_neg_min_heap(1, size_neg_min_heap);
        --size_neg_min_heap;
        neg_min_heapify(1);
        return ans;
    }
    static void neg_min_heapify(int root)
    {
        int smallest=root;
        int left=2*root;
        int right=2*root+1;
        
        if((left<=size_neg_min_heap)&&(neg_min_heap[smallest]>neg_min_heap[left]))
        smallest=left;

        if((right<=size_neg_min_heap)&&(neg_min_heap[smallest]>neg_min_heap[right]))
        smallest=right;

        if(smallest!=root)
        {
            swap_neg_min_heap(smallest, root);
            neg_min_heapify(smallest);
        }
    }
    static void insert_pos_heap(int n)
    {
        ++size_pos_min_heap;
        pos_min_heap[size_pos_min_heap]=n;
        insert_pos_min_heap(size_pos_min_heap);
    }
    static void insert_pos_min_heap(int n)
    {
        if(n==1)
        return;

        if(pos_min_heap[n/2]>pos_min_heap[n])
        swap_pos_min_heap(n/2, n);

        insert_pos_min_heap(n/2);
    }
    static void swap_pos_min_heap(int a, int b)
    {
        int temp=pos_min_heap[a];
        pos_min_heap[a]=pos_min_heap[b];
        pos_min_heap[b]=temp;
    }
    static int peek_pos_min_heap()
    {
        if(size_pos_min_heap==0)
        return Integer.MAX_VALUE;

        return pos_min_heap[1];
    }
    static int extract_pos_min_heap()
    {
        int ans=pos_min_heap[1];
        swap_pos_min_heap(1, size_pos_min_heap);
        --size_pos_min_heap;
        pos_min_heapify(1);
        return ans;
    }
    static void pos_min_heapify(int root)
    {
        int smallest=root;
        int left=2*root;
        int right=2*root+1;

        if((left<=size_pos_min_heap)&&(pos_min_heap[smallest]>pos_min_heap[left]))
        smallest=left;

        if((right<=size_pos_min_heap)&&(pos_min_heap[smallest]>pos_min_heap[right]))
        smallest=right;

        if(smallest!=root)
        {
            swap_pos_min_heap(smallest, root);
            pos_min_heapify(smallest);
        }
    }
}
