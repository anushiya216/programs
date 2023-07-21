import java.util.*;
import java.lang.*;
class sock
{
    public static void main(String args[])
    {
        Scanner obj=new Scanner(System.in);
        int n=obj.nextInt();
        int i,j,count=0;
        int arr[]=new int[n];
        for(i=0;i<n;i++)
        {
            arr[i]=obj.nextInt();
        }
        for(i=0;i<n;i++)
        {
            for(j=i+1;j<n;j++)
            {
                if(arr[i]==arr[j])
                {
                    count=count+1;
                    break;
                }
            }
        }
        System.out.println(count);
    }
}