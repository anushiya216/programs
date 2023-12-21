import java.util.*;
public class fibonacciSubsetArray 
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
        int arr2[]=new int[10];
        arr2[0]=0;arr2[1]=1;
        for(int i=2;i<10;i++)
        {
            arr2[i]=arr2[i-1]+arr2[i-2];
        }
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<arr2.length;j++)
            {
                if(arr[i]==arr2[j])
                {
                    System.out.print(arr[i]+" ");
                    break;
                }
            }
        }
    }
    
}
