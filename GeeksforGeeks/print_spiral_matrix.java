package GeeksforGeeks;
import java.io.*;
import java.util.*;
public class print_spiral_matrix {
    static StringBuilder output;
    public static void main(String []args)throws IOException
    {
        //Input(args);
        test();
    }
    static void Input(String []args)throws IOException
    {
        BufferedReader x=new BufferedReader(new InputStreamReader(System.in));
        int t=Integer.parseInt(x.readLine());

        for(int i1=0; i1<t; i1++)
        {
            String dimentions[]=(x.readLine()).split(" ");
            int l=Integer.parseInt(dimentions[0]);
            int r=Integer.parseInt(dimentions[1]);
            int arr[][]=new int[l][r];
            String input[]=(x.readLine()).split(" ");
            int k=0;
            for(int i=0; i<l; i++)
            {
                for(int j=0; j<r; j++)
                arr[i][j]=Integer.parseInt(input[k++]);
            }
            operations(arr);
        }
    }
    static void test()
    {
        int a1[][]={{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}, {13, 14, 15, 16}};
        int a2[][]={{1, 2, 3, 4, 5, 6}, {7, 8, 9, 10, 11, 12}, {13, 14, 15, 16, 17, 18}, {19, 20, 21, 22, 23, 24}, {25, 26, 27, 28, 29, 30}, {31, 32, 33, 34, 35, 36}};
        int a3[][]={{1, 2, 3, 4, 5}, {6, 7, 8, 9, 10}, {11, 12, 13, 14, 15}, {16, 17, 18, 19, 20}};
        int a4[][]={{1, 2, 3, 4, 5}, {6, 7, 8, 9, 10}, {11, 12, 13, 14, 15}, {16, 17, 18, 19, 20}, {21, 22, 23, 24, 25}, {26, 27, 28, 29, 30}, {31, 32, 33, 34, 35}, {36, 37, 38, 39, 40}, {41, 42, 43, 44, 45}, {46, 47, 48, 49, 50}, {51, 52, 53, 54, 55}, {56, 57, 58, 59, 60}};
        int a5[][]={{1, 2, 3, 4, 5, 6}, {7, 8, 9, 10, 11, 12}};
        int a6[][]={{1, 2, 3, 4, 5, 6}, {7, 8, 9, 10, 11, 12}, {13, 14, 15, 16, 17, 18}};
        int a7[][]={{1, 2}};
        int a8[][]={{1, 2}, {3, 4}};
        int a9[][]={{1}, {2}};
        int a10[][]={{1}};

        operations(a1);

        //operations(a2);

        //operations(a3);

        //operations(a4);
        //operations(a5);
        operations(a6);
        //operations(a7);
        //operations(a8);
        //operations(a9);
        //operations(a10);
    }
    static void print_input(int [][]arr)
    {
        //System.out.println("Input: ");
        
    }
    static void operations(int [][]arr)
    {
        output=new StringBuilder();
        int col=arr.length;   //-- column
        int row=arr[0].length;    //-- row

        int i=0;
        int j=row-1;
        int k=col-1;

        while((i<=k)&&(i<=j))
        {
            //System.out.println(i+" "+j+" "+k);
            print_counter(arr, i, j, k);
            ++i;    
            --j;
            --k;
        }
        System.out.println(output);
    }
    static void print(int [][]arr, int i, int j, int k)
    {
        int i1=i;
        for(; i1<=j; i1++)
        {
            output.append(arr[i][i1]+" ");
        }

        int j1=i+1;
        for(; j1<=k; j1++)
        {
            output.append(arr[j1][j]+" ");
        }

        int k1=j-1;
        if(i!=k)
        for(; k1>=i; k1--)
        {
            output.append(arr[k][k1]+" ");
        }

        i1=k-1;
        if(i!=j)
        for(; i1>i; i1--)
        {
            output.append(arr[i1][i]+" ");
        }

        //System.out.println(output);
    }
    static void print_counter(int [][]arr, int i, int j, int k)
    {
        int i1=i;
        for(; i1<=k; i1++)
        {
            output.append(arr[i1][i]+" ");
        }
        int j1=i+1;
        for(; j1<=j; j1++)
        {
            output.append(arr[k][j1]+" ");
        }
        i1=k-1;
        if(i!=j)
        for(; i1>=i; i1--)
        {
            output.append(arr[i1][j]+" ");
        }
        j1=j-1;
        if(i!=k)
        for(; j1>i; j1--)
        {
            output.append(arr[i][j1]+" ");
        }
    }
}
