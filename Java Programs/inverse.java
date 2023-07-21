import java.util.*;
import java.lang.*;
public class inverse 
{
    public static void main(String[] args) 
    {
        Scanner obj=new Scanner(System.in);
        int i,j;
        int m=obj.nextInt();
        int n=obj.nextInt();
        float arr[][]=new float[m][n];
        for(i=0;i<m;i++)
        {
          for(j=0;j<n;j++)
          {
            arr[i][j]=obj.nextInt();
          }
        }
        float det=arr[0][0]*arr[1][1]-arr[1][0]*arr[0][1];
        float temp=arr[0][0];
        arr[0][0]=arr[1][1];
        arr[1][1]=temp;
        arr[1][0]=-arr[1][0];
        arr[0][1]=-arr[0][1];
        System.out.println(Arrays.deepToString(arr));

        for(i=0;i<n;i++)
        {
            System.out.println();
          for(j=0;j<n;j++)
          {
            System.out.printf(arr[i][j]/det +" ");
          }
        }     
    }
}