import java.util.*;
public class sumOfBoundaryElements 
{
    public static void main(String[] args) 
    {
        Scanner obj=new Scanner(System.in);
        int n=obj.nextInt();
        int arr[][]=new int[n][n];
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                arr[i][j]=obj.nextInt();
            }
        }
        int sum=0;
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(i==0 || j==0 || j==n-1 || i==n-1)
                {
                    sum=sum+arr[i][j];
                }
            }
        }
        System.out.println(sum);
    }
}