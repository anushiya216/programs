import java.util.*;
public class DifferentElementCount 
{
    public static void main(String[] args) 
    {
        Scanner obj=new Scanner(System.in);
        int m=obj.nextInt();
        int n=obj.nextInt();
        int arr[]=new int[m];
        int arr2[]=new int[n];
        int count=0;
        for(int i=0;i<m;i++)
        {
            arr[i]=obj.nextInt();
        }
        for(int i=0;i<n;i++)
        {
            arr2[i]=obj.nextInt();
        }
        for(int i=0;i<m;i++)
        {
            int flag=0;
            for(int j=0;j<n;j++)
            {
                if(arr[i]==arr2[j])
                {
                    flag=1;
                    break;
                }
            }
            if(flag==0)
            {
                count++;
            }
        }
        for(int i=0;i<n;i++)
        {
            int flag2=0;
            for(int j=0;j<m;j++)
            {
                if(arr2[i]==arr[j])
                {
                    flag2=1;
                    break;
                }
            }
            if(flag2==0)
            {
                count++;
            }
            
        }
        System.out.println(count);
    }  
}