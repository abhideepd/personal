package GeeksforGeeks;
import java.io.*;
import java.util.*;
public class count_inversion {
    static int ans=0;
    public static void main(String []args)throws IOException
    {
        BufferedReader x=new BufferedReader(new InputStreamReader(System.in));
        int t=1;
        //t=Integer.parseInt(x.readLine());
        for(int i1=0; i1<t; i1++)
        {
            //int size=Integer.parseInt(x.readLine());
            //String input[]=(x.readLine()).split(" ");
            //driver(input);

            test();
        }
    }
    static void test()
    {
        String input1[]=("2 4 1 3 5").split(" ");
        String input2[]=("8 4 2 1").split(" ");
        String input3[]=("3 1 2").split(" ");

        driver(input1);
        driver(input2);
        driver(input3);
    }
    static void driver(String []input)
    {
        print(input);   //--test

        int arr[]=new int[input.length];
        for(int i=0; i<input.length; i++)
        arr[i]=Integer.parseInt(input[i]);
        ans=0;

        /*      //-- demo
        int ans=0;

        for(int i=0; i<input.length; i++)
        {
            for(int j=i+1; j<input.length; j++)
            {
                if(arr[i]>arr[j])
                ++ans;
            }
        }
        System.out.println(ans);
        */
        merge(arr, 0, arr.length-1);
        System.out.println(ans);
    }
    static void merge(int []arr, int l, int r)
    {
        if(l<r)
        {
            int mid=(l+r)/2;
            merge(arr, l, mid);
            merge(arr, mid+1, r);
            sort(arr, l, mid, r);
        }
    }   
    static void sort(int []arr, int l, int mid, int r)
    {
        int size_L=mid-l+1;
        int size_R=r-mid;
        int L[]=new int[size_L];
        int R[]=new int[size_R];

        int k=l;
        for(int i=0; i<size_L; i++)
        L[i]=arr[k++];

        for(int i=0; i<size_R; i++)
        R[i]=arr[k++];

        int L_cnt=0, R_cnt=0, i=l;
        while((L_cnt<size_L)&&(R_cnt<size_R))
        {
            if(L[L_cnt]>R[R_cnt])
            {   
                //L_cnt++;
                ++R_cnt;
                ++ans;
            }
            else
            {
                ++L_cnt;
            }
        }
        ans=ans+(size_L-L_cnt);
        System.out.println("L_cnt: "+L_cnt+"   R_cnt: "+R_cnt+"  size_L: "+size_L+"  size_R: "+size_R);   //--test
    }
    static void print(String []input)
    {
        StringBuilder output=new StringBuilder();
        output.append("\nInput: ");
        for(String s:input)output.append(s+" ");  
        System.out.println(output);  
    }
}