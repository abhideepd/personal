package Prepbytes;
import java.util.*;
import java.io.*;
public class QUERY {
    
    static int segtree[];
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
            
            int seg_tree_size=sizeofseg(size);
            //System.out.println(seg_tree_size);
            segtree=new int[seg_tree_size];
            create_segment_tree(0, size-1, arr, 0);

            //Input query
            int Q_Queries=Integer.parseInt(x.readLine());
            ArrayList<Integer> ans=new ArrayList<Integer>();
            for(int i=0; i<Q_Queries; i++)
            {
                String input_query[]=(x.readLine()).split(" ");
                int l=Integer.parseInt(input_query[0]);
                int r=Integer.parseInt(input_query[1]);
                ans.add(min(l-1, r-1, 0, size-1, 0));
            }

            print(ans);
        }
    }
    static int min(int l, int r, int seg_left, int seg_right, int pos)
    {
        int mid=(seg_left+seg_right)/2;
        if((seg_right<l)||(seg_left>r))
        {
            return Integer.MAX_VALUE;
        }
        else if((seg_right<=r)&&(seg_left>=l))
        {
            return segtree[pos];
        }
        return Math.min(min(l, r, seg_left, mid, pos*2+1), min(l, r, mid+1, seg_right, pos*2+2));
    }
    static void print()
    {
        for(int i=0; i<segtree.length; i++)
        System.out.print(segtree[i]+" ");
    }
    static void print(ArrayList<Integer> ans)
    {
        while(ans.size()!=0)
        System.out.println(ans.remove(0));
    }
    static void create_segment_tree(int l, int r, int []arr, int pos)
    {
        int mid=(l+r)/2;
        //System.out.println(l+" "+r+" "+pos);
        if(l==r)
        {
            segtree[pos]=arr[l];
            return;
        }
        create_segment_tree(l, mid, arr, 2*pos+1);
        create_segment_tree(mid+1, r, arr, 2*pos+2);
        segtree[pos]=Math.min(segtree[pos*2+1], segtree[pos*2+2]);
    }
    static int sizeofseg(int temp)
    {
        int a=1;
        if(((temp)&(temp-1))==0)
            a=temp;
        else
        {
            while(temp!=0)
            {
                temp=temp>>1;
                a=a<<1;
            }
        }      
        a=a*2-1;    
        return a;
    }
}