package Prepbytes;
import java.io.*;
public class LXSM {
    static int arr[];
    static int size=0;
    public static void main(String []args)throws IOException
    {
        BufferedReader x=new BufferedReader(new InputStreamReader(System.in));
        int T=Integer.parseInt(x.readLine());
        for(int i1=0; i1<T; i1++)
        {
            String input[]=(x.readLine()).split(" ");

            String str=input[0];
            int q=Integer.parseInt(input[1].trim());
            //size=str.length();
            arr=new int[str.length()+1];

            for(int i=1; i<=str.length(); i++)
            {
                int temp=(int)str.charAt(i-1);
                
                arr[i]=temp;

                insert(i); ++size;

                /*print();
                System.out.print(" tmep: "+temp+" "+(char)temp);
                System.out.println();*/

                if(size==q)
                print(extract_min());
            }
            //print_full();
            print();
        }
    }
    static void print_full()
    {
        for(int i=0; i<arr.length; i++)
        System.out.print((char)arr[i]+" ");

        System.out.println();
    }
    static void print()
    {
        for(int i=1; i<=size; i++)
        System.out.print((char)arr[i]);

        System.out.println();
    }
    static int extract_min()
    {
        int ans=arr[1];
        arr[1]=arr[size];
        --size;
        min_heapify(1);
        return ans;
    }
    static void min_heapify(int root)
    {
        int left=root*2;
        int right=root*2+1;
        int smallest=root;

        if((left<=root)&&(arr[left]<arr[smallest]))
        smallest=left;

        if((right<=root)&&(arr[right]<arr[smallest]))
        smallest=right;

        if(smallest!=root)
        {
            swap(smallest, root);
            min_heapify(smallest);
        }
    }
    static void print(int a)
    {
        System.out.print((char)a);
    }
    static void insert(int n)
    {
        if(n==1)
        return;

        if(arr[n/2]>arr[n])
        swap(n/2, n);

        insert(n/2);
    }
    static void swap(int a, int b)
    {
        int temp=arr[a];
        arr[a]=arr[b];
        arr[b]=temp;
    }
}