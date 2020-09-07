package Prepbytes;
import java.io.*;
import java.util.*;
public class CONELE {
    static boolean seg_tree[];
    static int min_tree[];
    static int max_tree[];
    static ArrayList<Integer> stored_subtries=new ArrayList<Integer>();
    static ArrayList<Boolean> ans=new ArrayList<Boolean>();
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
            int seg_tree_size=seg_tree_size(size);
            seg_tree=new boolean[seg_tree_size];
            min_tree=new int[seg_tree_size];
            max_tree=new int[seg_tree_size];
            construct_min_tree(0, size-1, arr, 0);
            construct_max_tree(0, size-1, arr, 0);
            construct(0, size-1, arr, 0);
            //print(seg_tree);
            //print(max_tree);

            //Query
            int query_no=Integer.parseInt(x.readLine().trim());
            ans=new ArrayList<Boolean>();
            for(int i=0; i<query_no; i++)
            {
                String input_query[]=(x.readLine()).split(" ");
                int l=Integer.parseInt(input_query[0]);
                int r=Integer.parseInt(input_query[1]);
                stored_subtries=new ArrayList<Integer>();
                solution(l-1, r-1, 0, size-1, arr, 0);
                ans.add(check(stored_subtries));
                //System.out.println(stored_subtries);
            }
            //print(seg_tree);
            print(ans);
        }
    }
    static boolean check(ArrayList<Integer> arr)
    {
        if(arr.size()==0)
        return false;
        else{
            if(arr.size()==1)
            {
                return seg_tree[arr.remove(0)];
            }
            else if(arr.size()==2)
            {
                int temp1=arr.remove(0);
                int temp2=arr.remove(0);
                //if((seg_tree[temp1]==false)||(seg_tree[temp2]==false))
                //return false;
                //else
                //{
                    int temp12=(min_tree[temp1]-max_tree[temp2]);
                    int temp21=(min_tree[temp2]-max_tree[temp1]);

                    if((temp12<=1)&&(temp21<=1))
                    return true;
                    else
                    return false;
                //}
            }
            //for three elements
            int temp1=arr.remove(0);
            int temp2=arr.remove(0);
            int temp3=arr.remove(0);
            int temp12=(max_tree[temp1]-min_tree[temp2]);
            int temp13=(max_tree[temp1]-min_tree[temp3]);
            int temp21=(max_tree[temp2]-min_tree[temp1]);
            int temp31=(max_tree[temp3]-min_tree[temp1]);
            int temp23=(max_tree[temp2]-min_tree[temp3]);
            int temp32=(max_tree[temp3]-min_tree[temp2]);

            //1--2--3
            if((temp12<=1)&&(temp23<=1))
            return true;

            //1--3--2
            if((temp13<=1)&&(temp32<=1))
            return true;

            //2--3--1
            if((temp23<=1)&&(temp31<=1))
            return true;

            //2--1--3
            if((temp21<=1)&&(temp13<=1))
            return true;

            //3--1--2
            if((temp31<=1)&&(temp12<=1))
            return true;

            //3--2--1
            if((temp32<=1)&&(temp21<=1))
            return true;

            return false;      
        }
    }
    static void solution(int l, int r, int tree_left, int tree_right, int []arr, int pos)
    {
        int mid=(tree_left+tree_right)/2;

        if((l<=tree_left)&&(r>=tree_right))
        {
            stored_subtries.add(pos);
            return;
        }

        else if((l>tree_right)||(r<tree_left))//base condition
        return;

        solution(l, r, tree_left, mid, arr, 2*pos+1);
        solution(l, r, mid+1, tree_right, arr, 2*pos+2);
    }
    static void print(ArrayList<Boolean> ans)
    {
        while(ans.size()!=0)
        System.out.println(ans.remove(0)==false?"No":"Yes");
    }
    static void construct_min_tree(int l, int r, int []arr, int pos)
    {
        int mid=(l+r)/2;
        if(l==r)
        {
            min_tree[pos]=arr[l];
            return;
        }
        construct_min_tree(l, mid, arr, 2*pos+1);
        construct_min_tree(mid+1, r, arr, 2*pos+2);
        min_tree[pos]=Math.min(min_tree[2*pos+1], min_tree[2*pos+2]);
    }
    static void construct_max_tree(int l, int r, int []arr, int pos)
    {
        int mid=(l+r)/2;
        if(l==r)
        {
            max_tree[pos]=arr[l];
            return;
        }
        construct_max_tree(l, mid, arr, 2*pos+1);
        construct_max_tree(mid+1, r, arr, 2*pos+2);
        max_tree[pos]=Math.max(max_tree[2*pos+1], max_tree[2*pos+2]);
    }
    static void construct(int l, int r, int []arr, int pos)
    {
        int mid=(l+r)/2;
        if(l==r)
        {
            seg_tree[pos]=true;
            return;
        }
        construct(l, mid, arr, 2*pos+1);
        construct(mid+1, r, arr, 2*pos+2);

        if(seg_tree[pos*2+1]&&seg_tree[pos*2+2])
        {
            int temp1=(int)Math.abs(min_tree[pos*2+1]-max_tree[pos*2+2]);
            int temp2=(int)Math.abs(min_tree[pos*2+2]-max_tree[pos*2+1]);

            if((temp1==0)||(temp2==0)||(temp1==1)||(temp2==1))
            seg_tree[pos]=true;
            else
            seg_tree[pos]=false;
        }
        else
        seg_tree[pos]=false;
    }
    static int seg_tree_size(int n)
    {
        int a=1;
        if((n&(n-1))==0)
        a=n;
        else{
            while(n!=0)
            {
                a=a<<1;
                n=n>>1;
            }
        }
        return 2*a-1;
    }
    static void print(int []seg_treee)
    {
        System.out.println("Answer: ");
        for(int i=0; i<seg_treee.length; i++)
        System.out.print(seg_treee[i]+" ");
        System.out.println();
    }
    static void print(boolean []seg_treee)
    {
        System.out.println("Answer: ");
        for(int i=0; i<seg_treee.length; i++)
        System.out.print(seg_treee[i]+" ");
        System.out.println();
    }
}