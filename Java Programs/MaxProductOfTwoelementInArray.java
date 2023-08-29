import java.util.*;
public class MaxProductOfTwoelementInArray 
{
    public static void main(String[] args) 
    {
        Scanner obj=new Scanner(System.in);
        int n=obj.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=obj.nextInt();
        }
        int max=0,ans=0;
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                if((arr[i]*arr[j]>max)&& i!=j)
                {
                    max=arr[i]*arr[j];
                    ans=arr[i]+arr[j];
                }
            }
        }
        System.out.println(ans);
    }
    
}
