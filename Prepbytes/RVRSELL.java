package Prepbytes;
import java.io.*;
public class RVRSELL {
    public static void main(String[] args)throws IOException {
        BufferedReader x=new BufferedReader(new InputStreamReader(System.in));   
        int T=Integer.parseInt(x.readLine());
        for(int i1=0; i1<T; i1++)
        {
            int size=Integer.parseInt(x.readLine());
            String input[]=(x.readLine()).split(" ");
            node1 inputt=new node1();
            node1 head=inputt;
            
            for(int i=0;i<input.length; i++)
            {
                int temp=Integer.parseInt(input[i]);
                node1 xyz=new node1();
                xyz.a=temp;
                inputt.next=xyz;
                inputt=inputt=inputt.next;
            }

            node1 output=new node1();
            node1 crrnt=head;
            node1 prev=null;
            node1 head1=null;

            while(crrnt!=null)
            {
                node1 temp=new node1();
                temp.a=crrnt.a;
                temp.next=prev;
                prev=temp;
                crrnt=crrnt.next;
                head1=temp;
            }

            //output
            node1 xyz=head1;
            while(xyz.next!=null)
            {
                System.out.print(xyz.a+" ");
                xyz=xyz.next;
            }
            System.out.println();
        }
    }   
}
class node1{
    int a;
    node1 next;
}