import java.util.*;
public class stockspan 
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
        System.out.print("1"+" ");
        for(int i=1;i<n;i++)
        {
            if(arr[i]<arr[i-1])
            {
                System.out.print("1"+" ");
            }
            else 
            {
                for(int j=i;j>=0;j--)
                {
                    if(arr[j]>arr[i])
                    {
                        System.out.print(i-j +" ");
                        break;
                    }
                }
            }
        }
    } 
}