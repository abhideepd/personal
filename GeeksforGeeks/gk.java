package GeeksforGeeks;
import java.io.*;
import java.util.*;
public class gk 
{
    public static void main(String []args)throws IOException
    {
        __Solution s=new __Solution();
        int A[]={3, 3, 3};
        int B[]={3, 3, 3};
        int C[]={3, 3, 3};
        //ArrayList<Integer> arr=s.commonElements(A, B, C, A.length, B.length, C.length);
        System.out.println(s.commonElements(A, B, C, A.length, B.length, C.length));
    }
}
class __Solution
{
    ArrayList<Integer> commonElements(int A[], int B[], int C[], int n1, int n2, int n3) 
    {
        // code here 
        ArrayList<Integer> ans=new ArrayList<Integer>();
        
        int i=0, j=0, k=0;
        
        while((i<n1)&&(j<n2)&&(k<n3))
        {
            if((A[i]==B[j])&&(B[j]==C[k]))
            {
                ans.add(A[i]);
                ++i;
                ++j;
                ++k;
            }
            else if((A[i]<=B[j])&&(B[j]<=C[k]))
            {
                ++i;
            }
            else if((B[j]<A[i])&&(B[j]<C[k]))
            {
                ++j;
            }
            else
            {
                ++k;
            }
        }
        return ans;
    }
}