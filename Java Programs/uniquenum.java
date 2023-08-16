import java.util.*;
public class uniquenum 
{
    public static void main(String[] args) 
    {
        Scanner obj=new Scanner(System.in);
        int t=obj.nextInt();
        
      for(int k=0;k<t;k++)
      {
        int n=obj.nextInt();
        int arr[]=new int[n];
        int arr2[]=new int[n];
        int ans=0,flag=0;
        for(int i=0;i<n;i++)
        {
            arr[i]=obj.nextInt();
        }
        for(int i=0;i<n;i++)
        {
            int count=1;
            for(int j=0;j<n;j++)
            {
                if(arr[i]==arr[j] && i!=j)
                {
                    arr2[i]=count++;
                }
            }
        }
        for(int i=0;i<n;i++)
        {
            if(arr2[i]!=1)
            {
                System.out.println(arr[i]);
            }
        }
      }
    }
}