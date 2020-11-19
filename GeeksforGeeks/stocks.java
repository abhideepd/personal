package GeeksforGeeks;
import java.util.*;
import java.io.*;
public class stocks {
    public static void main(String []args)
    {
        int arr1[]={3,3,5,0,0,3,1,4};
        int res_arr1=6;

        int arr2[]={1,2,3,4,5};
        int res_arr2=4;

        int arr3[]={7,6,4,3,1};
        int res_arr3=0;

        int arr4[]={1};
        int res_arr4=0;

        int arr5[]={10, 22, 5, 75, 65, 80};
        int res_arr5=87;

        int arr6[]={2, 30, 15, 10, 8, 25, 80};
        int res_arr6=100;

        int arr7[]={100, 30, 15, 10, 8, 25, 80};
        int res_arr7=72;

        int arr8[]={90, 80, 70, 60, 50};
        int res_arr8=0;

        operations(arr1, res_arr1);
        operations(arr2, res_arr2);
        operations(arr3, res_arr3);
        operations(arr4, res_arr4);
        operations(arr5, res_arr5);
        operations(arr6, res_arr6);
        operations(arr7, res_arr7);
        operations(arr8, res_arr8);
        System.out.println();
    }
    static void operations(int []arr, int res_arr)
    {
        _Solution_ s=new _Solution_();

        System.out.print("\nInput: ");
        for(int i:arr)System.out.print(i+" ");System.out.print("    Result: "+res_arr);

        System.out.print("   Output: ");
        int temp=s.maxProfit(arr);
        System.out.println(temp+"   "+(temp==res_arr?"Correct !":"Wrong :-("));
    }
}
class _Solution_ {
    Stack<Integer> s;
    public int maxProfit(int[] prices) {

        int max1=0, max2=0;
        _Solution_ x=new _Solution_();
        x.s=new Stack<Integer>();

        int current_minima=prices[0];
        int past=prices[0];
        for(int present:prices)
        {
            if(past>present)
            {
                int diff=past-current_minima;
                current_minima=present;
                x.s.push(diff);
            }
            past=present;
        }
        x.s.push(past-current_minima);

        System.out.println(x.s);
        
        while(x.s.size()!=0)
        {
            int temp=x.s.pop();

            if(temp>max1)   // -- highest
            {
                max2=max1;
                max1=temp;
            }
            else if(temp>max2)
            max2=temp;
        }
        return max1+max2;
    }
}