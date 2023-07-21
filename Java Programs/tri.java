import java.util.*;
import java.lang.*;
public class tri
{
    public static void main(String[] args) 
    {
        Scanner obj=new Scanner(System.in);
        int i,j,k,n;
        n=20;
        long arr[]=new long[n];
        for(i=1;i<n;i++)
        {
            arr[i]=i*(i+1)/2;
        }
        long arr1[]=new long[n];
        for(i=1;i<n;i++)
        {
            arr1[i]=i*(2*i-1);
        }
        long arr2[]=new long[n];
        for(i=1;i<n;i++)
        {
            arr2[i]=i*(3*i-1)/2;
        }
        for(i=0;i<n;i++)
        {
            for(j=0;j<n;i++)
            {
                for(k=0;k<n;i++)
                {
                    if(arr[i]==arr1[j] && arr[i]== arr2[k])
                    {
                        System.out.println(arr[i]+" ");
                    }
                }
            }
        }
    }
}