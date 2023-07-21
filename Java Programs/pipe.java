import java.util.*;
public class pipe 
{
    public static void main(String[] args) 
    {
        Scanner obj=new Scanner(System.in);
        int n=obj.nextInt();
        int m=obj.nextInt();
        int r=obj.nextInt();
        int arr[]=new int[n];
        int arr2[]=new int[m];
        int sum=0,sum2=0;
        for(int i=0;i<n;i++)
        {
            arr[i]=obj.nextInt()-r;
            sum+=arr[i];
        }
        for(int i=0;i<m;i++)
        {
            arr2[i]=obj.nextInt()-r;
            sum2+=arr2[i];
        }
        if(sum==sum2)
        {
            System.out.print("BALANCED");
        }
        else if(sum2>sum)
        {
            System.out.print("+"+(sum2-sum+r));
        }
        else
        {
            System.out.print("-"+(sum-sum2+r));
        }
    }
}
