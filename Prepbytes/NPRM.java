package Prepbytes;
import java.io.*;
import java.util.*;
public class NPRM {
    static int arr[];
    public static void main(String[] args)throws IOException {
        BufferedReader x=new BufferedReader(new InputStreamReader(System.in));
       
        sieveOfEratosthenes(1000000);

        int T=Integer.parseInt(x.readLine());

        for(int i1=0; i1<T; i1++)
        {
            int N=Integer.parseInt(x.readLine());
            System.out.println(arr[N]);
        }
    }
    static void sieveOfEratosthenes(int n) 
	{ 
		boolean prime[] = new boolean[n+1]; 
		for(int i=0;i<n;i++) 
			prime[i] = true; 
		
		for(int p = 2; p*p <=n; p++) 
		{ 
			if(prime[p] == true) 
			{ 
				for(int i = p*p; i <= n; i += p) 
					prime[i] = false; 
			} 
		} 
		
        int k=0;
		
		//Make the seived array
		arr=new int[75001];
		k=1;
		for(int i = 2; i <= n; i++) 
		{ 
            if(k==75001)
            break;
			if(prime[i] == true) 
				arr[k++]=i;
		}
		//System.out.println(arr[1]+" "+arr[10]+" "+arr[100]+" "+arr[500]+" "+arr[1000]+" "+arr[10000]+" "+arr[15000]+" "+arr[20000]+" "+arr[50000]+" "+arr[70000]);
	} 
}