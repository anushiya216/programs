import java.util.*;
public class painter 
{
    public static void main(String[] args) 
    {
        Scanner obj=new Scanner(System.in);
        int t=obj.nextInt();
        for(int k=0;k<t;k++)
        {
            int n=obj.nextInt();
            int pa=obj.nextInt();
            int arr[]=new int[n];
            for(int i=0;i<n;i++)
            { 
                arr[i]=obj.nextInt();
            }
            int s=0,sum1=0,sum2=0;
            if(n%2==0)
            {
                s=n/pa;
            }
            else 
            {
                s=(n/pa)+1;
            }
            
            for(int i=0;i<s;i++)
            { 
                sum1+=arr[i];
            }
            for(int i=s;i<n;i++)
            { 
                sum2+=arr[i];
            }
            if(sum1>sum2)
            {
                System.out.println(sum1);
            }
            else 
            {
                System.out.println(sum2);
            }
        }
    }
}
