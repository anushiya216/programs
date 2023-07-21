import java.util.*;
public class num 
{
    public static void main(String[] args) 
    {
        int m,n,r,q,sum=0;
        Scanner obj=new Scanner(System.in);
        n=obj.nextInt();
        m=(int)(Math.pow(n,2 ));
            if(m>0 && m<10000)
            {
                r = m%100;
                q = m/100;
                sum = r+q;
            }
            else if(m>=10000)
            {
                r = m%1000;
                q = m/1000;
                sum = r+q;
            }
            else 
            {
                System.out.println();
            }
        if(sum==n)
        {
            System.out.println(sum);
            System.out.println("Yes");
        }
        else 
        {
            
            System.out.println(sum);
            System.out.println("No");
        }
    }
}
