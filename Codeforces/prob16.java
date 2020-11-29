package Codeforces;
import java.io.*;
import java.util.*;
public class prob16 {
    public static void main(String args[])throws IOException
    {
        BufferedReader x=new BufferedReader(new InputStreamReader(System.in));
        int t=Integer.parseInt(x.readLine());

        for(int i1=0; i1<t; i1++)
        {
            int size=Integer.parseInt(x.readLine());
            String inp_arr[]=(x.readLine()).split(" ");
            int arr[]=new int[size];

            for(int a=0; a<size; a++)
            {
                arr[a]=Integer.parseInt(inp_arr[a]);
            }

            if(size==1)
            System.out.println(0);

            else if(size==2)
            System.out.println(1);

            else
            {
                Arrays.sort(arr);

                int s=arr[0]+arr[1];
                int limit=arr[size-1]+arr[size-2];
                int ans=0;

                while(s<=limit)
                {
                    int temp_ans=0;
                    int i=0, j=size-1;
                    while(i<j)
                    {
                        int diff=s-arr[i];

                        if(diff==arr[j])
                        {
                            ++i;
                            --j;
                            ++temp_ans;
                        }
                        else if(diff>arr[j])
                        ++i;
                        else if(diff<arr[j])
                        --j;
                    }
                    ++s;
                    ans=Math.max(temp_ans, ans);
                }
                ///*testing*/System.out.print("Answer: ");
                System.out.println(ans);
            }
        }
    }
}
