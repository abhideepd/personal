import java.util.*;
public class ratmaze {
    static int soln[][];
    static ArrayList<String> arr;
    static ArrayList<String> finale;
    public static void main(String[] args)
    {
        int maze[][]={
            {1, 0, 1, 1, 1},
            {1, 0, 1, 0, 1},
            {1, 1, 1, 1, 1},
            {0, 0, 0, 0, 1},
            {0, 0, 0, 0, 1}
        };
        /*int maze[][]={
            {1, 1, 1, 1},
            {1, 1, 1, 0},
            {1, 1, 1, 0},
            {1, 0, 0, 0}
        };*/
        /*int maze[][]={
            {1,0},
            {1,0}
        };*/

        int n=maze.length;
        soln=new int[n][n];
        arr=new ArrayList<String>();
        finale=new ArrayList<String>();

        ArrayList<String> x=output(maze, n);
        if(x.size()!=0)
        {
            for(String s:x)
            System.out.print(s);
        }
        else
            System.out.println(-1);
    }
    static ArrayList<String> output(int [][]maze, int n)
    {
        if(operation(maze, n, 0, 0, 0 ,0)==false)
        {
           /* if(finale.size()==0)
            System.out.println(-1);
            else{
                for(String s:finale)
                System.out.print(s);
            }*/
            return finale;
        }
        return finale;
    }
    static boolean operation(int [][]maze, int n, int i, int j, int previ, int prevj)
    {
        if((i==n-1)&&(j==n-1)&&(maze[i][j]==1))
        {
            soln[i][j]=1;

            if(i>previ)
            arr.add("D");
            else if(i<previ)
            arr.add("U");
            else if(j>prevj)
            arr.add("R");
            else if(j<prevj)
            arr.add("L");   

            printx();
            arr.remove(arr.size()-1);
            //return true;
        }
        if(safe(maze, n, i, j))
        {
            soln[i][j]=1;

            if(i>previ)
            arr.add("D");
            else if(i<previ)
            arr.add("U");
            else if(j>prevj)
            arr.add("R");
            else if(j<prevj)
            arr.add("L");

            if(operation(maze, n, i+1, j, i, j));
            else if(operation(maze, n, i-1, j, i, j));
            else if(operation(maze, n, i, j+1, i, j));
            else if(operation(maze, n, i, j-1, i, j));

            soln[i][j]=0;
            if(arr.size()!=0)
            arr.remove(arr.size()-1);
        }
        return false;
    }
    static boolean safe(int [][]maze, int n, int i, int j)
    {
        if((i>-1)&&(j>-1)&&(i<n)&&(j<n)&&(soln[i][j]!=1)&&(maze[i][j]==1))
        return true;
        return false;
    }
    static void printx()
    {
        /*for(int i=0; i<soln.length; i++)
        {
            for(int j=0; j<soln.length; j++)
            System.out.print(soln[i][j]+" ");
            System.out.println();
        }
        System.out.println();
        System.out.println(arr);
        System.out.println();*/

        for (String string : arr) {
            finale.add(string);
        }
        finale.add(" ");
    }
}