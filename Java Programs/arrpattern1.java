import java.util.*;
public class arrpattern1
{
    public static void main(String[] args) 
    {
        Scanner obj=new Scanner(System.in);
        int i,j;
        int m=obj.nextInt();
        int n=obj.nextInt();
        int arr[][]=new int[m][n];
        for(i=0;i<n;i++)
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
                System.out.print(arr[i][j] +" ");
            }
            else 
            {
                System.out.print("*" +" ");
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
// * * *
// * 5 * 
// * * *