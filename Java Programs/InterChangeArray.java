import java.util.*;
public class InterChangeArray 
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
        for(int i=n/2-1;i>=0;i--)
        {
            System.out.print(arr[i]+" ");
        }
        for(int i=n-1;i>=n/2;i--)
        {
            System.out.print(arr[i]+" ");
        }
        
    } 
}