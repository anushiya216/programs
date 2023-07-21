import java.util.*;
public class avg
{
    public static void main(String[] args) 
    {
        Scanner obj=new Scanner(System.in);
        int n=obj.nextInt();
        int i,sum=0;
        int arr[]=new int[n];
        for(i=0;i<n;i++)
        {
            arr[i]=obj.nextInt();
        }
        for(i=0;i<n;i++)
        {
            sum+=arr[i];
        }
        System.out.println(sum/n);
    }
}

// input
// 5
// 1 2 3 4 5
// output
// 3