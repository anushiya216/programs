import java.util.*;
import java.lang.*;
public class arrsum
{
    public static void main(String[] args) 
    {
        Scanner obj=new Scanner(System.in);
        int n=obj.nextInt();
        int arr[]=new int[n];
        int m=obj.nextInt();
        int arr1[]=new int[m];
        int i,temp=0,sum=0;
        for(i=0;i<n;i++)
        {
            arr[i]=obj.nextInt();
        }
        for(i=0;i<m;i++)
        {
            arr1[i]=obj.nextInt();
        }
        for(i=0;i<n;i++)
        {
            sum+=arr[i];
        }
        for(i=0;i<m;i++)
        {
            temp+=arr1[i];
        }
        if(temp<sum)
        {
            System.out.println(Arrays.toString(arr));
        }
        else
            System.out.println(Arrays.toString(arr1));
    }
}

// input
// 5
// 1 2 3 4 5
// 4
// 1 2 3 4
// output
// [2, 3, 4, 5, 4]