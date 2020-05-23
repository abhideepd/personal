// { Driver Code Starts
// Initial Template for Java

import java.util.*;
class Rat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            int[][] a = new int[n][n];
            for (int i = 0; i < n; i++)
                for (int j = 0; j < n; j++) a[i][j] = sc.nextInt();

            GfG g = new GfG();
            ArrayList<String> res = g.printPath(a, n);
            if (res.size() > 0) {
                for (int i = 0; i < res.size(); i++)
                    System.out.print(res.get(i) + " ");
                System.out.println();
            } else {
                System.out.println(-1);
            }
        }
    }
}
// } Driver Code Ends


// User function Template for Java

// m is the given matrix and n is the order of matrix
class GfG 
{
    
    //static ArrayList<String> arr;
    static String arr;
    static ArrayList<String> finale;
    static int soln[][];
    
    static ArrayList<String> printPath(int [][]maze, int n)
    {

        //initialization
        soln=new int[n][n];
       // arr=new ArrayList<String>();
        arr="";
        finale=new ArrayList<String>();

        //testing
        /*
        for(int i=0; i<n; i++)
        {
            for(int j=0; j<n; j++)
            {
                System.out.print(maze[i][j]);
            }
            System.out.println();
        }
        //testing
        */

        if(operation(maze, n, 0, 0, 0 ,0)==false)
        {
           /* if(finale.size()==0)
            System.out.println(-1);
            else{
                for(String s:finale)
                System.out.print(s);
            }*/
            return finale;
        }
        return finale;
    }
    static boolean operation(int [][]maze, int n, int i, int j, int previ, int prevj)
    {
        if((i==n-1)&&(j==n-1)&&(maze[i][j]==1))
        {
            soln[i][j]=1;

            if(i>previ)
            arr+="D";
            else if(i<previ)
            arr+="U";
            else if(j>prevj)
            arr+="R";
            else if(j<prevj)
            arr+="L";   

            printx();
            arr=arr.substring(0, arr.length()-1);
            //return true;
        }
        if(safe(maze, n, i, j))
        {
            soln[i][j]=1;

            if(i>previ)
            arr+="D";
            else if(i<previ)
            arr+="U";
            else if(j>prevj)
            arr+="R";
            else if(j<prevj)
            arr+="L";
         
            if(operation(maze, n, i+1, j, i, j));//down
            else if(operation(maze, n, i, j-1, i, j));//left    
            else if(operation(maze, n, i, j+1, i, j));//right     
            else if(operation(maze, n, i-1, j, i, j));//up             

            soln[i][j]=0;
            if(arr.length()!=0)
            arr=arr.substring(0, arr.length()-1);
        }
        return false;
    }
    static boolean safe(int [][]maze, int n, int i, int j)
    {
        if((i>-1)&&(j>-1)&&(i<n)&&(j<n)&&(soln[i][j]!=1)&&(maze[i][j]==1))
        return true;
        return false;
    }
    static void printx()
    {
        /*for(int i=0; i<soln.length; i++)
        {
            for(int j=0; j<soln.length; j++)
            System.out.print(soln[i][j]+" ");
            System.out.println();
        }
        System.out.println();
        System.out.println(arr);
        System.out.println();

        for (String string : arr) {
            finale.add(string);
        }*/
        finale.add(arr);
    }
}