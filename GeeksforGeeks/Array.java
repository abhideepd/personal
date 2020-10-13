package GeeksforGeeks;

// { Driver Code Starts


//Initial Template for Java



import java.io.*;
import java.util.*;


 // } Driver Code Ends




class Solution
{
    static void leftRotate(long arr[], int k,int n)
    {
        int diff=0;
        //diff=n-k;
        diff=k;
        
        StringBuilder x=new StringBuilder();
        for(int i=0;i<n; i++)
        {
            int temp=(i+diff)>=n?(i+diff)%n:(i+diff);
            //x.append(arr[temp]+" ");
            System.out.print(arr[temp]+" ");
        }
        //System.out.println(x);
        System.out.println();
    }
}


// { Driver Code Starts.

// Driver class
public class Array {

    // Driver code
    public static void main(String[] args) throws IOException {
        // Taking input using buffered reader
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int testcases = Integer.parseInt(br.readLine());
        // looping through all testcases
        while (testcases-- > 0) {
//            int n = Integer.parseInt(br.readLine());
            String line = br.readLine();
            String[] q = line.trim().split("\\s+");
            int n =Integer.parseInt(q[0]);
            int k =Integer.parseInt(q[1]);
//            //int y =Integer.parseInt(a2[2]);
            String line1 = br.readLine();
            String[] a1 = line1.trim().split("\\s+");
            long a[] = new long[n];
            for (int i = 0; i < n; i++) {
                a[i] = Long.parseLong(a1[i]);
            }
//            String line2 = br.readLine();
//            String[] a2 = line2.trim().split("\\s+");
//            long b[] = new long[n];
//            for (int i = 0; i < m; i++) {
//                b[i] = Long.parseLong(a2[i]);
//            }
            Solution ob = new Solution();
            //ArrayList<Long> ans=ob.smallestDifferenceTriplet(a,b,c,n);
            Solution.leftRotate(a,k,n);
            for (int i = 0; i < n; i++)
                System.out.print(a[i]+" ");
            System.out.println();
        }
    }
}




  // } Driver Code Ends