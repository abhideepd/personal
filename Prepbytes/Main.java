package Prepbytes;

import java.util.*;
import java.io.*;
public class Main {
  public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t= sc.nextInt();
        while(t-->0)
        {
            int n=sc.nextInt();
            ArrayList<Integer> arrayList = new ArrayList<>();
            arrayList = sieve(arrayList);
            System.out.println(arrayList.size());
            System.out.println(arrayList.get(n-1));
        }
    }
    private static ArrayList<Integer> sieve(ArrayList<Integer> arrayList) {
        boolean sieve[] = new boolean[1000001];
        sieve[1]=false;
        for(int i=2;i<1000001;i++)
            sieve[i]=true;
        for(int i=2;i<=Math.sqrt(1000001);i++)
        {
            if(sieve[i])
            {
                for(int j=i*i;j<1000001;j=j+i)
                    sieve[j]=false;
            }
        }
        ArrayList<Integer> arrayList1 = new ArrayList<>();
        for(int i=2;i<1000001;i++)
        {
            if(sieve[i])
                arrayList1.add(i);
        }
        return arrayList1;
    }
}