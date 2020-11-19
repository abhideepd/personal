package GeeksforGeeks;
import java.util.*;
public class subset_product {
    public static void main(String []args)
    {
        int arr1[]={2, 4, 5, 3}; int k1=12;
        int arr2[]={12, 32, 21}; int k2=1;
        //int arr1[]={2, 4, 5, 3}; int k1=12;

        operation(arr1, k1);
        operation(arr2, k2);
    }
    static void operation(int []arr, int k)
    {

    }
    static int xyz(int []arr, int k, int prod, int i)
    {
        if(prod==k)
        return 1;

        if(prod==0)
        return 0;

        for(int i1=i; i1<arr.length; i1++)
        {

        }

        return 0;
    }
}
