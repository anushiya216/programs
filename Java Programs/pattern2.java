import java.util.*;
public class pattern2 
{
    public static void main(String[] args) 
    {
        Scanner obj=new Scanner(System.in);
        int n=obj.nextInt();
        int arr[][]=new int[n][n];
        for(int i=1;i<=n;i++)
        {
            for(int j=i;j>=1;j--)
            {
                System.out.print(j+ " ");
            }
            for(int j=2;j<=n-(i-1);j++)
            {
                System.out.print(j+ " ");
            }
            System.out.println();
        }   
    }
}
