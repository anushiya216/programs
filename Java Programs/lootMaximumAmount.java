import java.util.*;
public class lootMaximumAmount 
{
    public static void main(String[] args) 
    {
        Scanner obj=new Scanner(System.in);
        int n=obj.nextInt();
        int arr[]=new int[n];
        int sum1=0,sum2=0;
        for(int i=0;i<n;i++)
        {
            arr[i]=obj.nextInt();
        }
        for(int i=0;i<n;i+=2)
        {
            sum1+=arr[i];
        }
        for(int i=1;i<n;i+=2)
        {
            sum2+=arr[i];
        }
        if(sum1>=sum2)
            System.out.println(sum1);
        else
            System.err.println(sum2);
    }
    
}
