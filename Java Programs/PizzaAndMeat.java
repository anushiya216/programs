import java.util.*;
public class PizzaAndMeat 
{
    public static void main(String[] args) 
    {
        Scanner obj=new Scanner(System.in);
        int n=obj.nextInt();
        int k=obj.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=obj.nextInt();
        }
        int c=0;
        for(int i=0;i<=n-k;i++)
        {
            c=0;
            for(int j=i;j<i+k;j++)
            {
                if(arr[j]<0)
                {
                    c=arr[j];
                    break;
                }
                else 
                {
                    continue;
                }
            }
            System.err.println(c+" ");
        }
    }
}
