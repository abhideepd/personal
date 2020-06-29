package Practice;

class Res {
    static String max = "";
}

public class kswaps {
    public static void main(String[] args) {        

                //Input
                int k = 3;                  //no. of swaps
                String str = "4551711527";      //Number

                Res r = new Res();
                r.max = str;
                new Solution().findMaximumNum(str.toCharArray(), k, r);

                //Output
                System.out.println(r.max);
    }
}

class Solution {
    // function to find maximum integer possible by
    // doing at-most K swap operations on its digits
    static void findMaximumNum(char ar[], int k, Res r) {
        // add your code here

        char a[]=output(ar, k, 0, ar.length);
        String s=new String(a);
        r.max=s;
    }
    static char[] output(char []ar, int k, int i, int j)
    {
        if(k==0)
        return ar;

        if(i==j)
        return ar;


        for(int i1=i+1; i1<j; i1++)
        {
            char temp[];
            int x=Integer.parseInt(ar[i]+"");
            int y=Integer.parseInt(ar[i1]+"");
            if(x<y)
            {
                temp=swap(ar, i, i1);
                return output(ar, k-1, i+1, j);
            }
            else
            return output(ar, k, i+1, j);
        }
        return ar;
    }
    static char[] swap(char []ar, int i, int j)
    {
        char temp=ar[j];
        ar[j]=ar[i];
        ar[i]=temp;
        return ar;
    }
}