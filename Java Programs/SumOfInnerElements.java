import java.util.*;
public class SumOfInnerElements 
{
    public static void main(String[] args) 
    {
        Scanner obj=new Scanner(System.in);
        int n=obj.nextInt();
        int sum=0;
        int arr[][]=new int[n][n];
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                arr[i][j]=obj.nextInt();
            }
        }
        for(int i=1;i<n-1;i++)
        {
            for(int j=1;j<n-1;j++)
            {
                sum+=arr[i][j];
            }
        }
        System.out.println(sum);
    }
}
