package GeeksforGeeks;
import java.io.*;
public class binary_sezrch {
    public static void main(String[] args)throws IOException
    {
        int arr[]={1,3,5,7,9,11,13,15};
        int k=3;
        System.out.println(search(arr, k, 0, arr.length-1));
    }
    static int search(int []arr, int k, int l, int r)
    {
        if(l==r)
        {
            if(arr[l]==k)
            return l;
            else 
            return -1;
        }
        int mid=l+((r-l)/2);

        if((arr[l]<=k)&&(arr[mid]>=k))
        return search(arr, k, l, mid);

        else
        return search(arr, k, mid+1, r);
    }
}
