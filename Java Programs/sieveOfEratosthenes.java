import java.util.*;
public class sieveOfEratosthenes
{
    public static void main(String[] args) 
    {
        Scanner obj=new Scanner(System.in);
        int n=obj.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=1;
        }
        for(int i=2;i<Math.sqrt(n);i++)
        {
            for(int j=i*i;j<n;j+=i)
            {
                arr[j]=0;
            }
        }
        for(int i=2;i<n;i++)
        {
            if(arr[i]==1)
            {
                System.out.println(i);
            }
        }
    }
}