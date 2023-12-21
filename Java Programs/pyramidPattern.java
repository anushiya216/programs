import java.util.*;
public class pyramidPattern
{
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        int n=obj.nextInt();
        int arr[][]=new int[n][n];
        int a=1;
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(j<=i)
                {
                    arr[i][j]=a;
                    a++;
                }   
            }
        }
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(arr[i][j]>0)
                {
                    System.out.print(arr[i][j]+" ");
                }
            }
            System.out.println();
        }
    }
    
}
