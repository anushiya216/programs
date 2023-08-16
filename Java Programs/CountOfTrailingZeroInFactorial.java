import java.util.*;
public class CountOfTrailingZeroInFactorial 
{
    public static void main(String[] args) 
    {
        Scanner obj=new Scanner(System.in);
        int n=obj.nextInt();
        int sum=1,count=0;
        for(int i=1;i<=n;i++)
        {
            sum=sum*i;
        }
        while(sum>9)
        {
            int r=sum%10;
            if(r!=0)
            {
                break;
            }
            else 
            {
                count++;
            }
            sum/=10;
        }
       System.out.println(count);
    }   
}
