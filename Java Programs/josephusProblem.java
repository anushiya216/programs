import java.util.*;
public class josephusProblem 
{
    public static void main(String[] args) 
    {
        Scanner obj=new Scanner(System.in);
        int n=obj.nextInt();
        int arr[]=new int[n];
        int count=n;
        for(int i=0;i<n;i++)
        {
            arr[i]=1;
        }
        for(int i=0;i<n-1;i+=2)
        {
            if(arr[i]==1 && arr[i+1]==1)
            {
                arr[i+1]=0;
                count--;
            }
        }
        if(n%2==0)
        {
            
      while(count>1)
      {
        if(count%2==0)
        {
            for(int i=0;i<n;i++)
            {
                if(arr[i]==1)
                {
                    arr[i]=0;
                    count--;
                    break;
                }
            }
        }
        else 
        {
            for(int i=0;i<n;i++)
            {
              for(int j=i+1;j<n;j++)
              {
                if(arr[i]==1 && arr[j]==1)
                {
                    arr[j]=0;
                    count--;
                    break;
                }
              }
            }
        }
      }
        for(int i=0;i<n;i++)
        {
            if(arr[i]==1)
            {
                System.out.println(i+1);
            }
        }
        }
        else 
        {
            
      while(count>1)
      {
        if(count%2==1)
        {
            for(int i=0;i<n;i++)
            {
                if(arr[i]==1)
                {
                    arr[i]=0;
                    count--;
                    break;
                }
            }
        }
        else 
        {
            for(int i=0;i<n;i++)
            {
              for(int j=i+1;j<n;j++)
              {
                if(arr[i]==1 && arr[j]==1)
                {
                    arr[j]=0;
                    count--;
                    break;
                }
              }
            }
        }
      }
        for(int i=0;i<n;i++)
        {
            if(arr[i]==1)
            {
                System.out.println(i+1);
            }
        }
        }
    }
}