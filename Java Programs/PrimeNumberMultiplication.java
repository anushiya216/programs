import java.util.*;
import java.lang.*;
public class PrimeNumberMultiplication 
{
    public static void main(String[] args) 
    {
        Scanner obj=new Scanner(System.in);
        int m=obj.nextInt();
        int n=obj.nextInt();
        int flag=0,ans=0;
        for(int i=m;i<=n;i++)
        {
            flag=0;
            for(int j=2;j<=(Math.sqrt(Math.abs(i)));j++)
            {
                if(i%j==0 )
                {
                    flag=1;
                    break;
                }
            }
            if(flag==0)
            {
                ans=ans+i;
                System.out.println(i);
            }
           
        }
        System.out.println(ans);
    }   
}