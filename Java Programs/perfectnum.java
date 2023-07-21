import java.util.*;
import java.lang.Math;
public class perfectnum
{
    public static void main(String[] args) 
    {
        Scanner obj=new Scanner(System.in);
        int i,j,sum=0,rem=0;
        int n=obj.nextInt();
        for(i=1;i<n;i++)
        {
            if(n%i==0)
            {
                sum+=i;
            }
        }
        if(sum==n)
        {
            System.out.println("Perfect Number");
        }
        else 
        {
            System.out.println("Not Perfect Number");
        }
    }
}