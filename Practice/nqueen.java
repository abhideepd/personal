package Practice;

public class nqueen {
    static int soln[][];
    public static void main(String[] args) {
        
        int n=10;        //no. of squares in chessboard
        reset(n);
        rani(n);
        //driver(3, 2, n);
        //printx(n);
    }
    static void reset(int n)
    {
        soln=new int[n][n];
    }
    
    public static void rani(int n)
    {
        boolean xx;
        if(n<4)
        System.out.println("not possible");
        else
        xx=operation(n, 0, 0, 0);
    }

    public static boolean operation(int n, int i, int j, int pervj)
    {
       if(i==n)
       {
            printx(n);
            return true;
            //reset(n);
            //operation(n, 0, j+1);
       }
       if(j==n)
       {
           return false;
            //operation(n, i+1, pervj+1, pervj+1);
       }

       if(soln[i][j]==0)
       {
            soln[i][j]=1;
            driver(i, j, n);
            if(operation(n, i+1, 0, pervj));
            //undrive(i, j, n);
       }
       else{
            operation(n, i, j+1, pervj);
       }       
       return false;
    }

    static void printx(int n)
    {
        for(int i=0; i<n; i++)
        {
            for(int j=0; j<n; j++)
            System.out.print(soln[i][j]+" ");
            System.out.println();
        }
        System.out.println();
    }

    public static boolean safe(int i, int j, int n)
    {
        for(int j1=0; j1<n; j1++)
        {
            if(soln[i][j1]==0)
            {
                //driver(i, j, n);
                return true;
            }
        }
        return false;
    }

    public static void undrive(int i, int j, int n)
    {

    }

    public static void driver(int i, int j, int n)
    {
        soln[i][j]=1;

        for(int j1=0; j1<n; j1++)   //horizontal
        {
            if(j1!=j)
            soln[i][j1]=2;
        }
       
        
        for(int i1=0; i1<n; i1++)   //vertical
        {
            if(i1!=i)
            soln[i1][j]=2;
        }
        
        //diognal
        northeast(i+1, j+1, n);        
        northwest(i-1, j-1, n);        
        southeast(i+1, j-1, n);
        southwest(i-1, j+1, n);

        soln[i][j]=1;
    }
    static void northeast(int i, int j, int n)
    {
        //System.out.println(i+" "+j);//testing
        if((i==n)||(j==n)||(i==-1)||(j==-1))
        return;
        soln[i][j]=2;
        northeast(i+1, j+1, n);
    }    
    static void northwest(int i, int j, int n)
    {
        //System.out.println(i+" "+j);//testing
        if((i==n)||(j==n)||(i==-1)||(j==-1))
        return;
        soln[i][j]=2;
        northeast(i-1, j-1, n);
    }
    static void southeast(int i, int j, int n)
    {
        //System.out.println(i+" "+j);//testing
        if((i==n)||(j==n)||(i==-1)||(j==-1))
        return;
        soln[i][j]=2;
        southeast(i+1, j-1, n);
    }
    static void southwest(int i, int j, int n)
    {
        //System.out.println(i+" "+j);//testing
        if((i==n)||(j==n)||(i==-1)||(j==-1))
        return;
        soln[i][j]=2;
        southwest(i-1, j+1, n);
    }
}