package Hackerearth;
import java.io.*;
import java.util.*;
public class forest {
    static boolean visited[][];
    public static void main(String []args)throws IOException
    {
        BufferedReader x=new BufferedReader(new InputStreamReader(System.in));
        int N=Integer.parseInt(x.readLine());
        visited=new boolean[N][N];
        int ans=0;
        char matrix[][]=new char[N][N];
        for(int i=0; i<N; i++)
        {
            String input=x.readLine();
            for(int i1=0; i1<N; i1++)
            {
                matrix[i][i1]=input.charAt(i1);
            }
        }
        for(int i=0; i<N; i++)
        {
            for(int j=0; j<N; j++)
            {
                if(visited[i][j]==false)
                {
                    int temp=answer(i, j, N, matrix);
                    if(ans<temp)
                    ans=temp;
                }
            }
        }
        System.out.println(ans);
    }
    static int answer(int i, int j, int N, char [][]matrix)
    {
        if((i>=N)||(j>=N)||(i<0)||(j<0))
        return 0;

        if((visited[i][j]==true)||(matrix[i][j]=='W'))
        return 0;

        visited[i][j]=true;

        return 1+answer(i+1, j, N, matrix)+answer(i, j+1, N, matrix)+answer(i-1, j, N, matrix)+answer(i, j-1, N, matrix);
    }
}
