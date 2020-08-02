package Prepbytes;
import java.io.*;
public class MIKEANDEXAM {
    static int answer=0;
    public static void main(String[] args)throws IOException {
        BufferedReader x=new BufferedReader(new InputStreamReader(System.in));
        int T=Integer.parseInt(x.readLine());
        for(int i1=0; i1<T; i1++)
        {
            String input[]=(x.readLine()).split(" ");
            int N=Integer.parseInt(input[0]);
            int K=Integer.parseInt(input[1]);
            String input1[]=(x.readLine()).split(" ");
            int arr[]=new int [N];
            for(int i=0; i<N; i++)
            {
                arr[i]=Integer.parseInt(input1[i]);
            }
            int ans=answer(arr, 0, K);
            System.out.println(ans);
       }
    }
    static int answer(int []arr, int i, int K)  
    {
        if(K==0)
        return 1;

        if(i==arr.length)
        return 0;

        return answer(arr, i+1, K-arr[i])+answer(arr, i+1, K+arr[i])+answer(arr, i+1, K);
    }
}