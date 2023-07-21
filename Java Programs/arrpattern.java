import java.util.*;
import java.lang.*;
public class arrpattern
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
            if(i==1 && j==1)
            {
              System.out.print(arr[i][j]);
            }
            else if(i==1 || j==1)
            {
                System.out.print(" * ");
            }
            else if((i==0 || i==2) && (j==0 || j==2))
            {
                System.out.print(arr[i][j]+arr[1][1] +" ");
            }
            else
            {
                System.out.print(arr[i][j] +" ");
            }
          }
        }
    }
}

// input
// 3 3

// 8 5 6
// 4 7 9
// 2 1 3

// output
// 15  * 13
//  * 7 *
// 9  * 10
