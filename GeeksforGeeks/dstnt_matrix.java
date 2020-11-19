package GeeksforGeeks;
import java.io.*;
import java.util.*;
public class dstnt_matrix {
    public static void main(String []args)throws IOException
    {
        test();
    }
    static void test()
    {
        //int a1[][]={{12, 1, 14, 3, 16}, {14, 2, 1, 3, 35}, {14, 1, 14, 3, 11}, {14, 5, 3, 2, 1}, {1, 18, 3, 21, 14}};

        int a2[][]={    {2, 1, 4, 3},
                        {1, 2, 3, 2},  
                        {3, 6, 2, 3},  
                        {5, 2, 5, 3}  };

        int a3[][]={    {12, 1, 14, 3, 16},
                        {14, 2, 1, 3, 35},  
                        {14, 1, 14, 3, 11},  
                        {14, 25, 3, 2, 1},
                        {1, 18, 3, 21, 14}  };

        //operations(a1, a1.length);
        operations(a2, a2.length);
        operations(a3, a3.length);
    }
    static void operations(int [][]M, int N)
    {
        System.out.println(distinct(M, N));
    }
    static int distinct(int [][]M, int N)
    {
        HashMap<Integer, Integer> prev=new HashMap<Integer, Integer>();

        for(int i=0; i<N; i++)
        prev.put(M[0][i], 0);

        for(int i=1; i<N; i++)
        {
            HashMap<Integer, Integer> curr=new HashMap<Integer, Integer>();
            for(int j=0; j<N; j++)
            {
                if(prev.containsKey(M[i][j]))
                curr.put(M[i][j], 0);
            }
            //System.out.println(prev+" "+curr);
            prev=curr;
        }

        return prev.size();
    }
}
