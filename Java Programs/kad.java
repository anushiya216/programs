import java.util.*;
import java.lang.*;
public class kad
{
    public static void main(String[] args) 
    {
        int i,count=0,k;
        Scanner obj=new Scanner(System.in);
        int n=obj.nextInt();
        int arr[]=new int[n];
        for(i=0;i<n;i++)
        {
            arr[i]=obj.nextInt();
        }
        for(i=n;i>=1;i--)
        {
            if(arr[i]==1)
            {
                System.out.println(i);
            }
        }
    }
}
