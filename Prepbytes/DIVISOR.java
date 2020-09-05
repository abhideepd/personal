package Prepbytes;
import java.io.*;
import java.util.*;
public class DIVISOR {
    static int seg_tree[];
    public static void main(String args[])throws IOException
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
            //Segment tree construction
            int seg_tree_size=seg_tree_size(size);
            seg_tree=new int[seg_tree_size];
            construct(0, size-1, 0, arr);
            //Input query
            int query_no=Integer.parseInt(x.readLine().trim());
            ArrayList<Integer> ans=new ArrayList<Integer>();
            for(int i=0; i<query_no; i++)
            {
                String input_query[]=(x.readLine()).split(" ");
                int l=Integer.parseInt(input_query[0]);
                int r=Integer.parseInt(input_query[1]);
                ans.add(solution(l-1, r-1, 0, size-1, 0));
            }
            print(ans);
        }
    }
    static int solution(int l, int r, int seg_left, int seg_right, int pos)
    {
        int mid=(seg_left+seg_right)/2;
        if((seg_left<=l)&&(seg_right>=r))
        return seg_tree[pos];
        else if((seg_left>r)||(seg_right<l))
        return 0;
        return gcd_filter(solution(l, r, seg_left, mid, pos*2+1), solution(l, r, mid+1, seg_right, pos*2+2));
    }
    static void print()
    {
        for(int i=0; i<seg_tree.length; i++)
        System.out.print(seg_tree[i]+" ");
    }
    static void construct(int l, int r, int pos, int []arr)
    {
        int mid=(l+r)/2;
        //System.out.println(l+" "+r+" "+pos);
        if(l==r)
        {
            seg_tree[pos]=arr[l];
            return;
        }
        construct(l, mid, 2*pos+1, arr);
        construct(mid+1, r, 2*pos+2, arr);
        seg_tree[pos]=gcd_filter(Math.min(seg_tree[pos*2+1], seg_tree[pos*2+2]), Math.max(seg_tree[pos*2+1], seg_tree[pos*2+2]));
    }
    static int gcd_filter(int a, int b)
    {
        int max=Math.max(a, b);
        int min=Math.min(a, b);
        return gcd(min, max);
    }
    static int gcd(int a, int b)
    {
        if(a==0)
        return b;
        return gcd(b%a, a);
    }
    static int seg_tree_size(int n)
    {
        int a=1;
        if((n&(n-1))==0)
        a=n;
        else
        {
            while(n!=0)
            {
                a=a<<1;
                n=n>>1;
            }
        }
        return a*2-1;
    }
    static void print(ArrayList<Integer> a)
    {
        while(a.size()!=0)
        System.out.println(a.remove(0));
    }
}