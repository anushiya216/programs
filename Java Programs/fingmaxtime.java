import java.util.*;
public class fingmaxtime 
{
    public static void main(String[] args) 
    {
        Scanner obj=new Scanner(System.in);
        int t=obj.nextInt();
        for(int k=0;k<t;k++)
        {
            int day=obj.nextInt();
            int n=obj.nextInt();
            int arr[]=new int[n];
            for(int i=0;i<n;i++)
            {
                arr[i]=obj.nextInt();
            }
            int s=0,sum[]=new int[day];
            for(int i=0;i<day;i++)
            {
                sum[i]=0;
            }
            if(n%2==0)
            {
                s=n/2;

            }
            else 
            {
                s=n/2+1;
            }
            int d=0;
            for(int i=0;i<s/2;i++)
            {
                sum[d]+=arr[i];
                d++;
            }
            for(int i=s/2;i<s;i++)
            {
                sum[d]+=arr[i];
                d++;
            }
            for(int i=s;i<(n-s)/2;i++)
            {
                sum[d]+=arr[i];
                d++;
            }
            for(int i=(n-s)/2;i<n;i++)
            {
                sum[d]+=arr[i];
            }
            Arrays.sort(sum);
            System.out.println(sum[d]);
        }
    }
}