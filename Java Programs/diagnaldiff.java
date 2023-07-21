import java.io.*;
import java.math.*;
import java.util.*;


class diagnaldiff {
    public static void main(String[] args)
    {
        Scanner obj=new Scanner(System.in);
        int n,i,j,sum=0,sum1=0;
        n=obj.nextInt();
        int arr[][]=new int[n][n];
        for(i=0;i<n;i++)
        {
            for(j=0;j<n;j++)
            {
                arr[i][j]=obj.nextInt();
            }
        }
        for(i=0;i<n;i++)
        {
            for(j=0;j<n;j++)
            {
                if(i==j)
                {
                    sum+=arr[i][j];
                }
            }
        }
        System.out.println(sum);
        for(i=0;i<n;i++)
        {
            for(j=n-1;j>=0;j--)
            {
                if(i==j)
                {
                    sum1+=arr[i][j];
                }
            }
        }
        System.out.println(sum1);
        System.out.println(Math.abs(sum-sum1));
    }
}
