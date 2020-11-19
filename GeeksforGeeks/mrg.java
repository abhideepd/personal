package GeeksforGeeks;
import java.io.*;
import java.util.*;
public class mrg 
{
    public static void main(String []args)
    {
        int arr1_1[]={1, 3, 5, 7};
        int arr2_1[]={0, 2, 6, 8, 9};

        int arr1_2[]={0, 1, 2, 3};
        int arr2_2[]={5, 6, 7, 8, 9};

        int arr1_3[]={10};
        int arr2_3[]={2, 3};

        int arr1_4[]={1, 5, 9, 10, 15, 20};
        int arr2_4[]={2, 3, 8, 13};

        int arr1_5[]={0, 4, 5, 6};
        int arr2_5[]={2, 3, 7, 8};

       /* test(arr1_1, arr2_1);
        test(arr1_2, arr2_2);
        test(arr1_3, arr2_3);
        test(arr1_4, arr2_4);
        test(arr1_5, arr2_5);*/

        int test_arr[]={};
        int test_arr_1[]={7, 2, 6, 8, 9};
        int test_arr_2[]={3, 2, 6, 8, 9};
        int test_arr_3[]={1, 2, 6, 8, 9};
        int test_arr_4[]={2, 2, 6, 8, 9};
        int test_arr_5[]={9, 2, 6, 8, 9};
        int test_arr_6[]={10, 2, 6, 8, 9};
        test(test_arr_1, test_arr);
        test(test_arr_2, test_arr);
        test(test_arr_3, test_arr);
        test(test_arr_4, test_arr);
        test(test_arr_5, test_arr);
        test(test_arr_6, test_arr);
    }    
    static void test(int []arr1, int []arr2)
    {
        System.out.print("\nInput:"); for(int i:arr1)System.out.print(i+" "); System.out.print("--- "); for(int i:arr2)System.out.print(i+" ");
        //new SolutionX().merge(arr1, arr2, arr1.length, arr2.length);
        new SolutionX().sort(arr1);
        System.out.print("\nOutput:"); for(int i:arr1)System.out.print(i+" ");System.out.print("--- "); for(int i:arr2)System.out.print(i+" ");System.out.println();
    }
}
class SolutionX {

    public void merge(int arr1[], int arr2[], int n, int m) {
        // code here
        int arr1_index=0, arr2_index=0;
        while((arr1_index<n)&&(arr2_index<m))
        {
            if(arr2[arr2_index]<arr1[arr1_index])
            {
                int temp=arr2[arr2_index];
                arr2[arr2_index]=arr1[arr1_index];
                arr1[arr1_index]=temp;
                sort(arr2);
            }
            ++arr1_index;
        }
    }
    public void sort(int []arr)
    {
        int a=arr[0];
        int l=0, r=arr.length-1;
        int mid=0;
        while(l<r)
        {
            mid=(l+r)/2;
            if(arr[mid]>a)
            r=mid-1;
            else if(arr[mid]<a)
            l=mid+1;
            else
            break;
        }
        //if(mid!=0)
        for(int i=1; i<=l; i++)
        arr[i-1]=arr[i];

        System.out.print("\n"+"l:"+l+" r:"+r+" mid:"+mid);  //--test
        if(mid!=0)
        arr[r]=a;
    }
}