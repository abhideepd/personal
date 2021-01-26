package Hackerrank;
import java.io.*;
import java.util.*;
public class castle_on_grid
{
    public static void main(String []args)throws IOException
    {
        BufferedReader x=new BufferedReader(new InputStreamReader(System.in));
        int size=Integer.parseInt(x.readLine());
        String matrix[][]=new String[size][size];
        String inputt[]=new String[size];
        for(int i=0; i<size; i++)
        {
            inputt[i]=(x.readLine());
            /*for(int j=0; j<size; j++)
            {
                matrix[i][j]=(input[j]);
            }*/
        }
        String input[]=(x.readLine()).split(" ");
        int startX=Integer.parseInt(input[0]);
        int startY=Integer.parseInt(input[1]);
        int goalX=Integer.parseInt(input[2]);
        int goalY=Integer.parseInt(input[3]);
        System.out.println("\nAnswer:");
        System.out.println(minimumMoves(inputt, startX, startY, goalX, goalY));
    }
    static int ans;
    static int minimumMoves(String[] grid, int startX, int startY, int goalX, int goalY) 
    {
        int x=startX, y=startY;
        ans=Integer.MAX_VALUE;
        int matrix[][]=new int[grid.length][grid.length];
        dfs(grid, x, y, goalX, goalY, 0, ' ', matrix);
        return ans;
    }
    static void dfs(String []grid, int x, int y, int goalX, int goalY, int temp_ans, char prev, int matrix[][])
    {
        System.out.println("AA-->"+x+" "+y);
        if((x==goalX)&&(y==goalY))
        {
            System.out.println(x+" "+y);
            ans=Math.min(temp_ans, ans);
            return;
        }
        if((x<0)||(y<0)||(x>=grid.length)||(y>=grid.length)||(grid[y].charAt(x)=='X')||(matrix[x][y]==1))
        return;
        matrix[x][y]=1;
        if(prev=='x')
        {
            System.out.println(x+" "+y);

            if((x+1<0)||(y<0)||(x+1>=grid.length)||(y>=grid.length)||(grid[y].charAt(x+1)=='X')||(matrix[x+1][y]==1))
            return;
            else
            dfs(grid, x+1, y, goalX, goalY, temp_ans, 'x', matrix);

            // dfs(grid, x-1, y, goalX, goalY, temp_ans, 'x', matrix);

            if((x<0)||(y+1<0)||(x>=grid.length)||(y+1>=grid.length)||(grid[y+1].charAt(x)=='X')||(matrix[x][y+1]==1))
            return;
            else
            dfs(grid, x, y+1, goalX, goalY, temp_ans+1, 'y', matrix);

            if((x<0)||(y-1<0)||(x>=grid.length)||(y-1>=grid.length)||(grid[y-1].charAt(x)=='X')||(matrix[x][y-1]==1))
            return;
            else
            dfs(grid, x, y-1, goalX, goalY, temp_ans+1, 'y', matrix);
        }
        else if(prev=='y')
        {
            System.out.println(x+" "+y);

            if((x+1<0)||(y<0)||(x+1>=grid.length)||(y>=grid.length)||(grid[y].charAt(x+1)=='X')||(matrix[x+1][y]==1))
            return;
            else
            dfs(grid, x+1, y, goalX, goalY, temp_ans+1, 'x', matrix);

            if((x-1<0)||(y<0)||(x-1>=grid.length)||(y>=grid.length)||(grid[y].charAt(x-1)=='X')||(matrix[x-1][y]==1))
            return;
            else
            dfs(grid, x-1, y, goalX, goalY, temp_ans+1, 'x', matrix);

            if((x<0)||(y+1<0)||(x>=grid.length)||(y+1>=grid.length)||(grid[y+1].charAt(x)=='X')||(matrix[x][y+1]==1))
            return;
            else
            dfs(grid, x, y+1, goalX, goalY, temp_ans, 'y', matrix);
            //dfs(grid, x, y-1, goalX, goalY, temp_ans, 'y', matrix);
        }
        else
        {
            System.out.println(x+" "+y);
            dfs(grid, x+1, y, goalX, goalY, temp_ans+1, 'x', matrix);
            //dfs(grid, x-1, y, goalX, goalY, temp_ans+1, 'x', matrix);
            dfs(grid, x, y+1, goalX, goalY, temp_ans, 'y', matrix);
            //dfs(grid, x, y-1, goalX, goalY, temp_ans, 'y', matrix);
        }
    }
}
