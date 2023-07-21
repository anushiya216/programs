import java.util.*;
public class fibonacci 
{
    public static void main(String[] args) 
    {
        Scanner obj=new Scanner(System.in);
        int n=obj.nextInt();
        int arr[]=new int[n];
        arr[0]=1;
        arr[1]=1;
        for(int i=2;i<n;i++)
        {
            arr[i]=arr[i-1]+arr[i-2];
        }
        System.out.print(arr[n-1]);
    }
}
