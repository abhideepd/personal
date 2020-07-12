package Prepbytes;
import java.io.*;
public class INSRTNODE {
    public static void main(String[] args)throws IOException {
        BufferedReader x=new BufferedReader(new InputStreamReader(System.in));
        int T=Integer.parseInt(x.readLine());
        for(int i1=0; i1<T; i1++)
        {
            int size=Integer.parseInt(x.readLine());
            String input[]=(x.readLine()).split(" ");
            int K=Integer.parseInt(x.readLine());
            lll xyz=new lll();
            lll head=xyz;
            for(int i=0; i<input.length; i++)
            {
                lll temp=new lll();
                int tempo=Integer.parseInt(input[i]);
                temp.a=tempo;
                temp.next=null;
                xyz.next=temp;
                xyz=xyz.next;
            }

            if(K>=xyz.a)
            {
                lll temp=new lll();
                temp.a=K;
                temp.next=null;
                xyz.next=temp;
            }
            else if(K<=head.next.a)
            {
                lll temp=new lll();
                temp.a=K;
                temp.next=head.next;
                head.next=temp;
            }
            else
            {
                lll temp=head.next;
                lll prev=temp;
                while(temp!=null)
                {
                    if(temp.a>K)
                    {
                        lll temp1=new lll();
                        temp1.a=K;                        
                        temp1.next=prev.next;
                        prev.next=temp1;
                        break;
                    }
                    prev=temp;
                    temp=temp.next;
                }
            }

            lll l=head.next;
            while(l!=null)
            {
                System.out.print(l.a+" ");
                l=l.next;
            }
            System.out.println();
        }
    }
}
class lll{
    int a;
    lll next;
}