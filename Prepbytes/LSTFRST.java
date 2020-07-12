package Prepbytes;
import java.io.*;
public class LSTFRST {
    public static void main(String[] args)throws IOException {
        BufferedReader x=new BufferedReader(new InputStreamReader(System.in));
        int T=Integer.parseInt(x.readLine());
        for(int i1=0; i1<T; i1++)
        {
            int size=Integer.parseInt(x.readLine());
            String input[]=(x.readLine()).split(" ");
            ll list=new ll();
            ll head=list;
            //System.out.println(head);
            ll hh=null;
            for(int i=0; i<input.length; i++)
            {
                if(i==input.length-1)
                hh=list;
                
                ll temp_node=new ll();
                int temp=Integer.parseInt(input[i]);
                temp_node.a=temp;
                temp_node.next=null;
                list.next=temp_node;
                list=list.next; 
            }
            
            //list-->last element
            //hhsecond last element
            /*hh.next=head.next;
            list.next=head.next.next;
            head.next.next=null;*/

            hh.next=null;
            list.next=head.next;
            //head=list;
            
            ll xyz=list;

            //output
            while(xyz!=null)
            {
                System.out.print(xyz.a+" ");
                xyz=xyz.next;
            }
            System.out.println();
        }
    }
}
class ll
{
    int a;
    ll next;
}