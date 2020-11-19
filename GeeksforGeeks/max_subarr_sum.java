package GeeksforGeeks;
import java.io.*;
public class max_subarr_sum {
    public static void main(String []args)
    {
        int arr1[]={1, 12,-5,-6,50,3}, k1=4;
        Solution_xx x=new Solution_xx();
        System.out.println(x.findMaxAverage(arr1, k1));
    }
}
class Solution_xx {
    public double findMaxAverage(int[] nums, int k) {
        
        int sum=0;
        double max_avg=0.0d;
        for(int i=0; i<k; i++)
        {
            sum=sum+nums[i];
        }
        max_avg=(double)sum/(double)k;
        for(int i=k; i<nums.length; i++)
        {
            sum=sum+nums[i]-nums[i-k];
            double temp=(double)sum/(double)k;
            if(temp>max_avg)
            max_avg=temp;
        }
        return max_avg;
    }
}