import java.util.*;
public class FindDiscount 
{
    public static void main(String[] args) 
    {
        Scanner obj=new Scanner(System.in);
        int n=obj.nextInt();
        int sum=0;
        while(n>9)
        {
            int r=n%10;
            n=n/10;
            if(r%2==1)
            {
                sum+=r;
            }
        }
        if(n%2==1)
        {
            sum+=n;
            System.out.println(sum);
        }
        else 
        {
            System.out.println(sum);
        }
    }
}
