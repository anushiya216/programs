import java.util.*;
import java.lang.*;
public class bulb 
{
    public static void main(String[] args) 
    {
        int i,count=0,k;
        Scanner obj=new Scanner(System.in);
        int n=obj.nextInt();
        int arr[]=new int[n+1];
        for(i=1;i<=n;i++)
        {
            arr[i]=obj.nextInt();
        }
        if(arr[0]==0)
        {
           count++;
        }
        for(i=0;i<n-1;i++)
        {
            if(arr[i]!=arr[i+1])
            {          
                count++;
            }
        }
        System.out.println(count);
    }
}

// input
// 4
// 1 0 1 0
// output
// 4