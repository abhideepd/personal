package Prepbytes;
import java.io.*;
import java.util.*;
public class TRIPLET {
    public static void main(String[] args)throws IOException {
        BufferedReader x=new BufferedReader(new InputStreamReader(System.in));
        int T=Integer.parseInt(x.readLine());
        for(int i1=0; i1<T; i1++)
        {
            int size=Integer.parseInt(x.readLine());
            String input[]=(x.readLine()).split(" ");
            int arr[]=new int[size];
            int array[]=new int[1000001];
            for(int i=0; i<size; i++)
            {
                arr[i]=Integer.parseInt(input[i]);
                array[arr[i]]=array[arr[i]]+1;
            }          
            int new_arr[]=new int[size];
            int k=0;
            for(int i=0; i<1000001; i++)
            {
                int counter=array[i];
                while(counter-->0)
                new_arr[k++]=i;
                //new_arr[i]=arr[i];
            }
            
            //Arrays.sort(arr);

            //for(int i=0; i<size; i++)
            //System.out.println(new_arr[i]);
            
            int n1=-1, n2=-1, n3=-1;
            for(int i=size-1; i>=0; i--)
            {
                int l=0, r=i-1;
                while(l<r)
                {
                    long sum=new_arr[r]+new_arr[l];
                    if(sum>new_arr[i])
                    --r;
                    else if(sum<new_arr[i])
                    ++l;
                    else{
                        n1=new_arr[i];
                        n2=new_arr[l];
                        n3=new_arr[r];
                        break;
                    }
                }
                if(n1!=-1)
                break;
            }       
            if(n1!=-1)
            System.out.println(n1+" "+n2+" "+n3);
            else
            System.out.println(-1);
        }
    }
}