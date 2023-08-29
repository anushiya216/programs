import java.util.*;
public class HighestRevenue 
{
    public static void main(String[] args) 
    {
        Scanner obj=new Scanner(System.in);
        int n=obj.nextInt();
        int b=0,a=obj.nextInt();
        int arr2[]=new int[n];
        for(int i=0;i<n;i++)
        {
            int arr[]=new int[a];
            int max=0;
            for(int j=0;j<a;j++)
            {
                arr[i]=obj.nextInt();
                if(arr[i]>max)
                {
                    max=arr[i];
                }
            }
            arr2[b++]=max;
        }
        System.out.println();
        for(int i=0;i<n;i++)
        {
            System.out.print(arr2[i]+" ");
        }
    }
}