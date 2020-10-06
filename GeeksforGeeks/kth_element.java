package GeeksforGeeks;
import java.io.*;
public class kth_element {
    public static void main(String []args)throws IOException
    {
        BufferedReader x=new BufferedReader(new InputStreamReader(System.in));
        int t=Integer.parseInt(x.readLine());
        for(int i1=0; i1<t; i1++)
        {
            String input[]=(x.readLine()).split(" ");
            int size_a=Integer.parseInt(input[0]);
            int size_b=Integer.parseInt(input[1]);
            int k=Integer.parseInt(input[2]);
            int a[]=new int[size_a];
            int b[]=new int[size_b];
            int ab[]=new int[size_a+size_b];
            String input1[]=(x.readLine()).split(" ");
            String input2[]=(x.readLine()).split(" ");
            for(int i=0; i<size_a; i++)
            {
                a[i]=Integer.parseInt(input1[i]);
                //b[i]=Integer.parseInt(input2[i]);
            }
            for(int i=0; i<size_b; i++)
            {
                //a[i]=Integer.parseInt(input1[i]);
                b[i]=Integer.parseInt(input2[i]);
            }
            int i=0, j=0, index=0;
            while((i<size_a)&&(j<size_b))
            {
                if(a[i]<=b[j])
                ab[index]=a[i++];
                else
                ab[index]=b[j++];
                ++index;
            }
            for(;i<size_a; i++)
            ab[index++]=a[i];

            for(;j<size_b; j++)
            ab[index++]=b[j];

            System.out.println(ab[k-1]);
        }
    }
}
