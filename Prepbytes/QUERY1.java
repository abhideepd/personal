package Prepbytes;
import java.io.*;
import java.util.*;
public class QUERY1 {
    static int seg_tree[];
    static int K=1000000000+7;
    public static void main(String []args)throws IOException
    {
        BufferedReader x=new BufferedReader(new InputStreamReader(System.in));
        int T=Integer.parseInt(x.readLine());

        for(int i1=0; i1<T; i1++)
        {
            int size=Integer.parseInt(x.readLine().trim());

            String input[]=(x.readLine()).split(" ");
            int arr[]=new int [size];
            for(int i=0; i<size; i++)
            arr[i]=Integer.parseInt(input[i]);

            int seg_tree_size=seg_tree_size(size);
            seg_tree=new int[seg_tree_size];

            construct(0, size-1, 0, arr);
            //print();

            //Input Query
            int query_no=Integer.parseInt(x.readLine().trim());
            ArrayList<Integer> ans=new ArrayList<Integer>();
            for(int i=0; i<query_no; i++)
            {
                String query_input[]=(x.readLine()).split(" ");
                int l=Integer.parseInt(query_input[0]);
                int r=Integer.parseInt(query_input[1]);
                ans.add(solution(l-1, r-1, 0, size-1, 0)%K);
            }
            print(ans);
        }
    }
    static int solution(int l, int r, int tree_left, int tree_right, int pos)
    {
        if((tree_left>=l)&&(tree_right<=r))
        return seg_tree[pos];

        else if((tree_right<l)||(tree_left>r))
        return 0;

        int mid=(tree_left+tree_right)/2;

        return solution(l, r, tree_left, mid, pos*2+1)+solution(l, r, mid+1, tree_right, pos*2+2);
    }

    static void print(ArrayList<Integer> arr)
    {
        while(arr.size()!=0)
        System.out.println(arr.remove(0));
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
        seg_tree[pos]=seg_tree[2*pos+1]+seg_tree[2*pos+2];
    }
    static int seg_tree_size(int n)
    {
        int a=1;
        if((n&(n-1))==0)
        a= n;

        else{
            while(n!=0)
            {
                a=a<<1;
                n=n>>1;
            }
        }
        return 2*a-1;
    }
}