package Prepbytes;
import java.io.*;
public class PALNDRM {
    public static void main(String[] args)throws IOException {
        BufferedReader x=new BufferedReader(new InputStreamReader(System.in));
        int T=Integer.parseInt(x.readLine());
        for(int i1=0; i1<T; i1++)
        {
            int size=Integer.parseInt(x.readLine());
            String input[]=(x.readLine()).split(" ");
            node2 a=new node2();
            node2 b=new node2();
            node2 prev=null;
            node2 head2=null;
            node2 head1=a;
            for(int i=0; i<input.length; i++)
            {
                int temp=Integer.parseInt(input[i]);
                node2 tempo=new node2();
                node2 tempoo=new node2();
                tempoo.data=temp;
                tempoo.next=prev;
                prev=tempoo;
                head2=tempoo;
                tempo.data=temp;
                tempo.next=null;
                a.next=tempo;
                a=a.next;
            }

            node2 a1=head2;
            node2 b1=head1.next;
            boolean result=true;

            for(int i=0; i<input.length; i++)
            {
                //System.out.println(a1.data+" ----- "+b1.data);
                if(a1.data!=b1.data)
                {
                    result=false;
                    break;
                }
                a1=a1.next;
                b1=b1.next;
            }
            System.out.println(result);
        }
    }
}
class node2{
    int data;
    node2 next;
}