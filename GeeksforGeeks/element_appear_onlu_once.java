package GeeksforGeeks;

public class element_appear_onlu_once {
    public static void main(String []args)
    {
        //int arr[]={1,1,2,2,3,4,4};
        //int arr[]={1,1,2,2,3,4,4,5,5};
        //int arr[]={1,1,2,2,3,3,4,5,5};
        //int arr[]={1, 1, 2, 2, 3, 3, 4, 50, 50, 65, 65};
        //int arr[]={1, 2, 2, 3, 3, 4, 4};
        int arr[]={1, 1, 2, 2, 3, 3, 4};
        
        int n=arr.length;
        System.out.println(findOnce(arr, n));
    }
    static int findOnce(int arr[], int n)
    {
        // Complete this function
        //if(arr[0]!=arr[1])
        //return arr[0];

        //if(arr[arr.length-1]!=arr[arr.length-2])
        //return arr[arr.length-1];

        return function(arr, 0, n-1);
    }
    static int function(int []arr, int l, int r)
    {
        int mid=(l+r)/2;

        if(l==r)
        return arr[l];
        
        if(mid%2==0)    //-- 'mid' is EVEN
        {
            if(arr[mid+1]==arr[mid])
            return function(arr, mid+2, r);

            else
            return function(arr, l, mid);
        }
        else            //-- 'mid' is ODD
        {
            if(arr[mid-1]==arr[mid])
            return function(arr, mid+1, r);

            else
            return function(arr, l, mid);
        }
    }
}
