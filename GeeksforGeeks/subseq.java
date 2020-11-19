package GeeksforGeeks;
import java.io.*;
import java.util.*;
public class subseq {
    public static void main(String []args)
    {        
        int arr1[]={-2,1,-3,4,-1,2,1,-5,4};
        int arr2[]={1};
        int arr3[]={0};
        int arr4[]={-1};
        int arr5[]={-2147483647};
        int arr6[]={1, 2, 3, 4, -10};
        int arr7[]={-2, 1, -3, 4, -1, 2, 1, -5, 4};
        int arr8[]={-2, -3, 4, -1, -2, 1, 5, -3};

        //operation(arr1);
        //operation(arr2);
        //operation(arr3);
        //operation(arr4);
        //operation(arr5);
        //operation(arr6);
        //operation(arr7);
        operation(arr8);        
    }
    static void operation(int []arr)
    {
        Solution_X x=new Solution_X();
        System.out.println(x.maxSubArray(arr));
    }
}
class Solution_X {
    int master_sum;
    Solution_X()
    {
        master_sum=Integer.MIN_VALUE;
    }
    public int maxSubArray(int[] nums) {
        Solution_X s=new Solution_X();
        s.func(nums, 0, s);
        return s.master_sum;
    }
    void func(int []arr, int i, Solution_X s)
    {
        int sum=0;
        for(int i1=i; i1<arr.length; i1++)
        {
            sum=sum+arr[i1];
            //System.out.println(sum);
            if(sum>s.master_sum)
            s.master_sum=sum;

            func(arr, i1+1, s);
        }
    }
}