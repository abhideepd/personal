    package Prepbytes;
    import java.io.*;
    import java.util.*;
    public class ARITHPRO {
        public static void main(String[] args)throws IOException {
            BufferedReader x=new BufferedReader(new InputStreamReader(System.in));
            int size=Integer.parseInt(x.readLine());
            String input[]=(x.readLine()).split(" ");
            int arr[]=new int[size];
            for(int i=0; i<size; i++)
            {
                arr[i]=Integer.parseInt(input[i]);
            }
            int sizi=100001;
            int prev_pos[]=new int[sizi];
            boolean valid[]=new boolean[sizi];
            int progression[]=new int[sizi];
            
            for(int i=0; i<sizi; i++)
            {
                prev_pos[i]=-1;
                progression[i]=-1;
            }
            int counter=0;
            for(int i=0; i<size; i++)
            {
                if(prev_pos[arr[i]]==-1)
                {
                    prev_pos[arr[i]]=i;
                    progression[arr[i]]=0;
                    valid[arr[i]]=true;
                    ++counter;
                }
                else{
                    if(progression[arr[i]]==0)
                    {
                        int temp=i-prev_pos[arr[i]];
                        progression[arr[i]]=temp;
                        int i2=i-temp-temp;
                        if(i2>=0)
                            {
                                if(arr[i2]!=arr[i])
                                valid[arr[i]]=false;
                                --counter;
                            }
                    }
                    else{
                        int temp=i-prev_pos[arr[i]];
                        if(temp!=progression[arr[i]])
                        {
                            valid[arr[i]]=false;
                            --counter;
                        }
                        else 
                        {
                            int i1=temp+i;
                            
                            if(i1<size)
                            {
                                if(arr[i1]!=arr[i])
                                valid[arr[i]]=false;
                                --counter;
                            }                            
                        }
                    }
                }
                prev_pos[arr[i]]=i;
            }
            System.out.println(counter);
            for(int i=0; i<sizi; i++)
            {
                if(valid[i]==true)
                {
                    System.out.println(i+" "+progression[i]);
                }
            }
        }
    }