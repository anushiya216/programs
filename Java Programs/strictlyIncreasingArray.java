import java.util.*;
public class strictlyIncreasingArray 
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
        int flag=0;
        for(int i=0;i<n;i++)
        {
            for(int j=i+1;j<n;j++)
            {
                if(arr[i]>arr[j])
                {
                    flag=1;
                    break;
                }
            }
        }
        if(flag==1)
        {
            System.out.println("Array is Strictly Not Increasing");
        }
        else 
        {
            System.out.println("Array is Strictly Increasing");
        }
    }   
}