package GeeksforGeeks;
import java.io.*;
public class middle_sum {
    public static void main(String []args)throws IOException
    {
        BufferedReader x=new BufferedReader(new InputStreamReader(System.in));
        int t=Integer.parseInt(x.readLine());
        for(int i1=0; i1<t; i1++)
        {
            int size=Integer.parseInt(x.readLine());
            int a[]=new int[size];
            int b[]=new int[size];
            int ab[]=new int[size*2];
            String input1[]=(x.readLine()).split(" ");
            String input2[]=(x.readLine()).split(" ");
            for(int i=0; i<size; i++)
            {
                a[i]=Integer.parseInt(input1[i]);
                b[i]=Integer.parseInt(input2[i]);
            }
            int i=0, j=0, index=0;
            while((i<size)&&(j<size))
            {
                if(a[i]<=b[j])
                ab[index]=a[i++];
                else
                ab[index]=b[j++];
                ++index;
            }
            for(;i<size; i++)
            ab[index++]=a[i];

            for(;j<size; j++)
            ab[index++]=b[j];

            System.out.println(ab[size]+ab[size+1]);
        }
    }
}
