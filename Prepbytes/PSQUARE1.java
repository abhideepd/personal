package Prepbytes;
import java.io.*;
import java.util.*;
public class PSQUARE1 {
    public static void main(String[] args)throws IOException {
        BufferedReader x=new BufferedReader(new InputStreamReader(System.in));

        //Sieve start
        int sive_size=100001;
        int sive_arr[]=new int[sive_size];
        //square root-->1
        for(int i=0; i<sive_size; i++)
        {
            long temp=i;
            long prod=temp*temp;

            if(prod>=sive_size)
            break;

            sive_arr[(int)prod]=1;
        }
        
        //prime nos.-->i(same)/-2
        
        for(int i=0; i<sive_size; i++)
        {
            if(sive_arr[i]==0)
            {
                for(int i1=2; i1<sive_size; i1++)
                {
                    long prod=i1*i;
                    if(prod>=sive_size)
                    break;
                    if(sive_arr[(int)prod]!=1)
                    sive_arr[i1*i]=-1;
                }
                sive_arr[i]=i;//prime no representation
            }
        }        
        //print(sive_arr);
        for(int i=sive_size-1; i>=0; i--)
        {
            if(sive_arr[i]==1)
            {
                for(int j=i+1; j<sive_size; j++)
                {
                    if(sive_arr[j]==-1)
                    {
                        if(j%i==0)
                        {
                            sive_arr[j]=j/i;
                        }
                    }
                }
            }
        }
       //print(sive_arr);
        //Sieve end
        
        int T=Integer.parseInt(x.readLine());
        for(int i1=0; i1<T; i1++)
        {
            String input1[]=(x.readLine()).split(" ");
            int N=Integer.parseInt(input1[0]);
            int M=Integer.parseInt(input1[1]);
            String input2[]=(x.readLine()).split(" ");
            int A[]=new int[N];
            int arr_A[]=new int[N];
            for(int i=0; i<N; i++)
            {
                int temp=Integer.parseInt(input2[i]);
                A[i]=temp;
                arr_A[i]=sive_arr[temp];
            }
            String input3[]=(x.readLine()).split(" ");
            int B[]=new int[M];
            HashMap<Integer, Integer> hm=new HashMap<Integer, Integer>();
            for(int i=0; i<M; i++)
            {
                int temp=Integer.parseInt(input3[i]);
                B[i]=temp;
                int temp1=sive_arr[temp];

                if(hm.containsKey(temp1))
                {
                    int temp2=hm.get(temp1);
                    if (temp2>temp)
                    hm.put(temp1, temp);
                }
                else{
                    hm.put(temp1, temp);
                }
            }
            for(int i=0; i<N; i++)
            {
                if(hm.containsKey(arr_A[i]))
                System.out.print(hm.get(arr_A[i])+" ");
                else
                System.out.print(-1+" ");   
            }
        }
    }

    public static void print(int []arr)
    {
        System.out.println();
        for(int i=0; i<arr.length; i++)
        System.out.println(i+" "+arr[i]);
        System.out.println();
        for(int i=0; i<100; i++)
        System.out.println(i+" "+arr[i]);
        System.out.println();
    }
}