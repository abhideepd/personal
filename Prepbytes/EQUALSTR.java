package Prepbytes;
import java.util.*;
import java.io.*;

public class EQUALSTR {
  public static void main(String args[]) throws IOException {
    
    //write your code here
    BufferedReader x=new BufferedReader(new InputStreamReader(System.in));
	int t=Integer.parseInt(x.readLine());

    for(int i1=0; i1<t; i1++)
    {
        //Input size of string
        int size=Integer.parseInt(x.readLine());
        String input[]=new String[size];
	
        //Input array of string
        for(int i=0; i<size; i++)
        input[i]=x.readLine();
     
        System.out.println(outsourcing(input, size));
    }
  }
  static int outsourcing(String []input, int size)
  {
    //int min=input[0].length()*2;
    int min=Integer.MAX_VALUE;
    for(int i=0; i<size; i++)
    {
        int ops=0;		

        for(int j=0; j<size; j++)
        {
			if(input[i].length()!=input[j].length())
			return -1;
			String temp=input[j]+input[j];
            int count=temp.indexOf(input[i]);
            if(count==-1)
            return -1;
  
            ops=ops+count;	
		}

        if(min>ops)
        min=ops;
    }
    return min;
  }
}