package GeeksforGeeks;
import java.io.*;
import java.util.*;
public class min_dis 
{
    public static void main(String []args)
    {
        test();
    }
    static void test()
    {
        _Solution s=new _Solution();
        int arr[]={86,39,90,67,84,66,62};
        int x=42;
        int y=12;
        int n=arr.length;
        System.out.println(s.minDist(arr, n, x, y));
    }
}
class _Solution 
{
    int minDist(int a[], int n, int x, int y) 
    {
        // code here
        int x_sucks=-1, y_sucks=-1, ans=Integer.MAX_VALUE;
        for(int i=0; i<n; i++)
        {
            if(x==a[i])
            x_sucks=i;
            
            if(y==a[i])
            y_sucks=i;
            
            int temp=Math.abs(x_sucks-y_sucks);
            
            if((x_sucks!=-1)&&(y_sucks!=-1))
            ans=Math.min(ans, temp);
        }
        if(ans==Integer.MAX_VALUE)
        return -1;
        return ans;
    }
}