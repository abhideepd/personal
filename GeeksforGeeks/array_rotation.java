package GeeksforGeeks;
import java.util.*;
import java.io.*;
public class array_rotation {
    public static void main(String []args)throws IOException
    {
        //String input="15 18 2 3 6 12";
        //String input="2 3 4 5 2";
        //String input="2 3 4 5 1 2";
        //String input="2 3 4 5 1";
        //String input="1 2 3 4 5 6";
        String input="2 2 2 2 2";
        String inp[]=input.split(" ");
        int arr[]=new int[inp.length];
        for(int i=0; i<inp.length; i++)
        {
            arr[i]=Integer.parseInt(inp[i]);
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        Solution1 obj=new Solution1();
        System.out.println(obj.findKRotation(arr, arr.length));
        int arrr[] = {15, 18, 2, 3, 6, 12}; 
        int n = arrr.length; 
          
        //System.out.println(countRotations(arrr, 0, n-1)); 
    } 

}

class Solution1 {
    int findKRotation(int arr[], int n) {
        // code here
        int l=0, r=n-1;
        while(l<r)
        {
            //System.out.println(l+" "+r);
            int mid=(l+r)/2;
            if(mid<r&&arr[mid+1]<arr[mid])
            return mid+1;
            if(mid>l && arr[mid]<arr[mid-1])
            return mid;
            else if(arr[l]<arr[mid])
            l=mid+1;
            else
            r=mid-1;
        }
        return 0;
    }
}