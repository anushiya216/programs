import java.util.*;
import java.lang.*;
public class countsubarr
{
    public static void main(String[] args) 
    {
        Scanner obj=new Scanner(System.in);
        int i,j,mul=0,count=0;
        int n=obj.nextInt();
        int arr[]=new int[n];
        for(i=0;i<n;i++)
        {
            arr[i]=obj.nextInt();
        }
        int k=obj.nextInt();
        for (i = 0; i < n; i++) 
        {
            if (arr[i] < k)
            {
                count++;
            }
            mul = arr[i];
            for (j = i + 1; j < n; j++) 
            {
                mul = mul * arr[j];
                if (mul < k)
                {
                    count++;
                }
                else
                {
                    break;
                }
            }
        }
        System.out.println(count);
    }
 
}