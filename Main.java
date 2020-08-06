import java.util.*;
import java.io.*;

public class Main {
  public static void main(String args[]) throws IOException {
    
    //write your code here
    BufferedReader x=new BufferedReader(new InputStreamReader(System.in));
    int T=Integer.parseInt(x.readLine());
    for(int i=0; i<T; i++)
    {
      int size=Integer.parseInt(x.readLine());
      String input[]=(x.readLine()).split(" ");
      int max=Integer.MIN_VALUE;
      int min=Integer.MAX_VALUE;
      for(int i1=0; i1<size; i1++)
      {
        int temp=Integer.parseInt(input[i1]);
        if(max<temp);
        max=temp;
        
        if(min>temp)
        min=temp;
      }
      System.out.println(min+" "+max);
    }
  }
}