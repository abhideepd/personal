package Prepbytes;
import java.io.*;
import java.util.*;
public class CONELE {
    static int min_tree[];
    static int max_tree[];
    public static void main(String []args)throws IOException
    {
        BufferedReader x=new BufferedReader(new InputStreamReader(System.in));
        int T=Integer.parseInt(x.readLine());
        for(int i1=0; i1<T; i1++)
        {
            int size=Integer.parseInt(x.readLine().trim());
            String input[]=(x.readLine()).split(" ");
            int arr[]=new int[size];
            for(int i=0; i<size; i++)
            {
                arr[i]=Integer.parseInt(input[i]);
            }
            //construct segment tree
            min_tree=new int[seg_tree_size(size)];
            max_tree=new int[seg_tree_size(size)];
            construct_min_tree(0, size-1, 0, arr);
            construct_max_tree(0, size-1, 0, arr);
            //print_segment_trees();

            //Query Input
            int query_size=Integer.parseInt(x.readLine());
            for(int i=0; i<query_size; i++)
            {
                String input_query[]=(x.readLine()).split(" ");
                int l=Integer.parseInt(input_query[0]);
                int r=Integer.parseInt(input_query[1]);
                int min=query_min(l-1, r-1, 0, size-1, 0);
                int max=query_max(l-1, r-1, 0, size-1, 0);
                //System.out.println(max+" "+min);
                if((max-min)==(r-l))
                System.out.println("Yes");
                else
                System.out.println("No");
            }
        }
    }
    static int query_min(int query_l, int query_r, int tree_l, int tree_r, int pos)
    { 
        if((query_l<=tree_l)&&(query_r>=tree_r))
        return min_tree[pos];

        if((query_r<tree_l)||(query_l>tree_r))
        return Integer.MAX_VALUE;

        int mid=(tree_l+tree_r)/2;

        return Math.min((query_min(query_l, query_r, tree_l, mid, 2*pos+1)),(query_min(query_l, query_r, mid+1, tree_r, 2*pos+2)));
    }
    static int query_max(int query_l, int query_r, int tree_l, int tree_r, int pos)
    { 
        if((query_l<=tree_l)&&(query_r>=tree_r))
        return max_tree[pos];

        if((query_r<tree_l)||(query_l>tree_r))
        return Integer.MIN_VALUE;

        int mid=(tree_l+tree_r)/2;

        return Math.max((query_max(query_l, query_r, tree_l, mid, 2*pos+1)),(query_max(query_l, query_r, mid+1, tree_r, 2*pos+2)));
    }
    static int seg_tree_size(int n)
    {
        int a=(int)Math.ceil(Math.log(n)/Math.log(2));
        int ans=((int)Math.pow(2, a))*2-1;
        return ans;
    }
    static void print_segment_trees()
    {
        System.out.println();
        System.out.println("Segment Trees:- ");
        for(int i=0; i<min_tree.length; i++)
        System.out.print(min_tree[i]+" ");
        System.out.println();
        for(int i=0; i<max_tree.length; i++)
        System.out.print(max_tree[i]+" ");
        System.out.println();
    }
    static void construct_min_tree(int low, int high, int pos, int []arr)
    {
        int mid=(low+high)/2;
        if(low==high)
        {
            //System.out.println(low+" "+high+" "+pos);
            min_tree[pos]=arr[low];
            return;
        }
        construct_min_tree(low, mid, 2*pos+1, arr);
        construct_min_tree(mid+1, high, 2*pos+2, arr);

        min_tree[pos]=Math.min(min_tree[2*pos+1], min_tree[2*pos+2]);
    }
    static void construct_max_tree(int low, int high, int pos, int []arr)
    {
        int mid=(low+high)/2;
        if(low==high)
        {
            max_tree[pos]=arr[low];
            return;
        }
        construct_max_tree(low, mid, 2*pos+1, arr);
        construct_max_tree(mid+1, high, 2*pos+2, arr);

        max_tree[pos]=Math.max(max_tree[2*pos+1], max_tree[2*pos+2]);
    }
}