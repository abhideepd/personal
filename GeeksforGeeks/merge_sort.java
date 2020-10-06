package GeeksforGeeks;
import java.util.*;
public class merge_sort {
    //static int arr[]={9, 4, 2, 1, 5, 6, 3, 8, 7};
    static int arr[]={1, 3, 4, 2, 9, 5, 6, 8, 7, 10};
    public static void main(String []args)
    {
        //arr=new int[9];
        //arr={9, 4, 2, 1, 5, 6, 3, 8, 7};
        //int arr[]={1, 3, 4, 2, 9, 5, 6, 8, 7, 10};
        mergesort(0, arr.length-1);

        //print
        for(int i=0; i<arr.length; i++)
        System.out.print(arr[i]+" ");
    }
    static void mergesort(int l, int r)
    {
        if(l<r)
        {
            int mid=(l+r)/2;
            mergesort(  l, mid);
            mergesort(mid+1, r);
            merge(l, mid, r);
        }
    }

    static void merge(int lr, int mid, int nr)
    {
        int L[]=new int[mid-lr+1];
        int R[]=new int[nr-mid];

        for(int i=0; i<L.length; i++)
        {
            L[i]=arr[lr+i];
        }
        for(int i=0; i<R.length; i++)
        {
            R[i]=arr[mid+i+1];
        }
        int i=0, j=0, index=lr;
        while((i<L.length)&&(j<R.length))
        {
            if(L[i]<R[j])
            {
                arr[index]=L[i++];
            }
            else
            {
                arr[index]=R[j++];
            }
            ++index;
        }
        for(; i<L.length; i++)
        {
            arr[index++]=L[i];
        }
        for(; j<R.length; j++)
        {
            arr[index++]=R[j];
        }
    }
}
