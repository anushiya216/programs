import java.util.*;
import java.lang.*;
public class max3
{
    public static void main(String[] args) 
    {
        Scanner obj=new Scanner(System.in);
        int i,j,max=0;
        int n=obj.nextInt();
        int arr[]=new int[n];
        for(i=0;i<n;i++)
        {
            arr[i]=obj.nextInt();
        }
        int k=obj.nextInt();
        for(i=0;i<n-2;i++)
        {
            System.out.print((int)Math.max(Math.max(arr[i],arr[i+1]),arr[i+2])+" ");
        }
        
        
    }
}