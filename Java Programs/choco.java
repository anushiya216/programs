import java.io.*;
import java.util.*;
public class choco
{
    public static void main(String[] args) 
    {
        Scanner obj=new Scanner(System.in);
        int t=obj.nextInt();
       
        for(int i=0;i<t;i++)
        {
             int ans=0;
            int n=obj.nextInt();
            int target=obj.nextInt();
            int arr[]=new int[n];
            for(int j=0;j<n;j++)
            {
                arr[j]=obj.nextInt();
            }
            int max=arr[0];
            for(int j=1;j<n-1;j++)
            {
                if(arr[j]>max)
                {
                    max=arr[j];
                    ans=j;
                }
            }
            if(max>=target)
            {
                System.out.println(arr[ans]);
            }
            else
            {
                if(arr[ans]+arr[ans-1]>target )
                {
                    System.out.println(arr[ans-1]+" "+ arr[ans]);
                }
                // else 
                // {
                //     if(arr[ans]+arr[ans-1]+arr[ans+1]>target)
                //     {
                //         System.out.println(arr[ans-1]+" "+ arr[ans]+" "+ arr[ans+1]);
                //     }
                // }
            }
        }
    }
}