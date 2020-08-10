package Prepbytes;
import java.io.*;
public class MATPATTERN {

    static long arr[]=new long[10001];
    static long matrix[][];
    static int k=0;
    static int N;
    public static void main(String[] args)throws IOException {
        BufferedReader x=new BufferedReader(new InputStreamReader(System.in));

        int prev=1, h=2;
        for(int i=0; i<10001; i++)
        {
            arr[i]=prev;
            prev=prev+h;
            ++h;
        }
        
        int T=Integer.parseInt(x.readLine());
        for(int i1=0; i1<T; i1++)
        {
            N=Integer.parseInt(x.readLine());
            matrix=new long[N][N];

            for(int i=0; i<N; i++)
            {
                outsource(i, 0);
            }

            for(int i=1; i<N; i++)
            {
                outsource(N-1, i);
            }

            for(int i=0; i<N; i++)
            {
                for(int j=0; j<N; j++)
                System.out.print(matrix[i][j]+" ");
                System.out.println();
            }
        }
    }
    static void outsource(int x, int y)
    {
        while((x>-1)&&(y>-1)&&(x<N)&&(y<N))
        {
            matrix[y][x]=arr[k++];
            --x;
            ++y;
        }
    }
}