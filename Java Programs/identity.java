import java.util.*;
import java.lang.*;
public class identity 
{
    public static void main(String[] args) 
    {
        Scanner obj=new Scanner(System.in);
        int m=obj.nextInt();
        int n=obj.nextInt();
        int arr[][]=new int[m][n];
        int i,j;
        for(i=0;i<m;i++)
        {
            for(j=0;j<n;j++)
            {
                arr[i][j]=obj.nextInt();
            }
        }
        for(i=1;i<=m;i++)
        {
            for(j=1;j<=n;j++)
            {
                if(i==j)
                {
                    if(arr[i][j]==1)
                    {
                        System.out.println("Identity Matrix");
                    }
                    else 
                    {
                        System.out.println("Not Identity Matrix");
                    }
                }
                else 
                {
                    if(arr[i][j]==0)
                    {
                        System.out.println("Identity Matrix");
                    }
                    else 
                    {
                        System.out.println("Not Identity Matrix");
                    }
                }
            }
        }
    }   
}

// input 
// 3 3

// 1 0 0
// 0 1 0
// 0 0 1
// output
// Identity Matrix