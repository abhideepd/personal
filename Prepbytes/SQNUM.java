package Prepbytes;
import java.io.*;
public class SQNUM {
    static int arr[];
    static int size;
    static int mod=1000000000+7;
    public static void main(String []args)throws IOException
    {
        BufferedReader x=new BufferedReader(new InputStreamReader(System.in));
        int T=Integer.parseInt(x.readLine());
        for(int i1=0; i1<T; i1++)
        {
            size=Integer.parseInt(x.readLine());
            String input[]=(x.readLine()).split(" ");   
            arr=new int[size+1];         
            for(int i=1; i<=size; i++)
            {
                int temp=Integer.parseInt(input[i-1]);
                arr[i]=temp;
                increase(i);
            }
            //print();
            while(size!=1)
            {
                int P=((extract_max())*3)%mod;
                //print();
                int Q=((extract_max())*2)%mod;
                
                //int temp=((P*3)-(Q*2))%mod;
                int temp=P-Q;
                arr[++size]=temp;
                //print(); System.out.print("temp: "+temp+" P:"+P+" Q:"+Q);
                increase(size);
                //print();
            }
            //System.out.println(arr[1]);
            print();
        }
    }
    static void print()
    {
        //System.out.println();
        for(int i=1; i<=size; i++)
        System.out.print(arr[i]+" ");
        System.out.println();
    }
    static int extract_max()
    {
        int ans=arr[1];
        arr[1]=arr[size];
        --size;
        max_heapify(1);
        return ans;
    }
    static void max_heapify(int root)
    {
        int left=root*2;
        int right=root*2+1;
        int biggest=root;

        if((left<=size)&&(arr[left]>arr[biggest]))
        biggest=left;

        if((right<=size)&&(arr[right]>arr[biggest]))
        biggest=right;

        if(biggest!=root)
        {
            swap(biggest, root);
            max_heapify(biggest);
        }
    }
    static void increase(int n)
    {
        if(n==1)
        return;

        if(arr[n/2]<arr[n])
        swap(n/2,  n);

        increase(n/2);
    }
    static void swap(int a, int b)
    {
        int temp=arr[a];
        arr[a]=arr[b];
        arr[b]=temp;
    }
}