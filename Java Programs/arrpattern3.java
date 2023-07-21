import java.util.*;
import java.lang.*;
public class arrpattern3
{
    public static void main(String[] args) 
    {
        Scanner obj=new Scanner(System.in);
        int i,j;
        int m=obj.nextInt();
        int n=obj.nextInt();
        int arr[][]=new int[m][n];
        for(i=0;i<m;i++)
        {
          for(j=0;j<n;j++)
          {
            arr[i][j]=obj.nextInt();
          }
        }
        for(i=0;i<m;i++)
        {
            System.out.println();
          for(j=0;j<n;j++)
          {
            if(j==0)
            {
                System.out.print(arr[i][j]*arr[i][j+2] +" ");
            }
            else if(j==1)
            {
                System.out.print("* ");
            }
            else 
            {
                System.out.print(arr[i][j-1] * arr[i][j]+" ");
            }
          }
        }
    }
}

// input
// 3 3

// 1 2 3
// 4 5 6
// 7 8 9

// output
// 3 * 6
// 24 * 30
// 63 * 7