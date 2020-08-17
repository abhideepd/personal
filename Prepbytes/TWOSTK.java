package Prepbytes;
import java.io.*;
import java.util.*;
public class TWOSTK {
    public static void main(String[] args)throws IOException {
        BufferedReader x=new BufferedReader(new InputStreamReader(System.in));
        int T=Integer.parseInt(x.readLine());
        for(int i1=0; i1<T; i1++)
        {
            String input1[]=(x.readLine()).split(" ");
            String input2[]=(x.readLine()).split(" ");
            String input3[]=(x.readLine()).split(" ");
            int a=Integer.parseInt(input1[0]);
            int b=Integer.parseInt(input1[1]);
            int X=Integer.parseInt(input1[2]);

            Stack<Integer> A=new Stack<Integer>();
            Stack<Integer> B=new Stack<Integer>();

            for(int i=b-1; i>=0; i--)
            {
                B.push(Integer.parseInt(input3[i]));
            }

            for(int i=a-1; i>=0; i--)
            {
                B.push(Integer.parseInt(input2[i]));
            }

            int ans=0;

            while(X>0)
            {
                //System.out.println(X);
                if((A.size()!=0)&&(B.size()!=0))
                {
                    if(A.peek()<B.peek())
                    X=X-A.pop();
                    else if(A.peek()>B.peek())
                    X=X-B.pop();
                    else{
                        if(A.size()==1)
                        X=X-B.pop();
                        else if(B.size()==1)
                        X=X-A.pop();
                        else{
                            int temp_a=A.pop();
                            int temp_b=B.pop();
                            if(A.peek()<temp_a)
                            {
                                X=X-temp_a;
                                B.push(temp_b);
                            }
                            else{
                                X=X-temp_b;
                                A.push(temp_a);
                            }
                        }
                    }
                }
                else if((A.size()==0)&&(B.size()==0))
                {
                    break;
                }
                else if(A.size()==0)
                {
                    X=X-B.pop();
                }
                else{
                    X=X-A.pop();
                }
                //System.out.println(X);
                //if(X<0)
                //break;
                //System.out.println(X);
                ++ans;
            }
            System.out.println(ans+1);
        }
    }
}