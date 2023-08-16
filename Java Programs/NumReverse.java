
import java.util.*;
public class NumReverse 
{
    public static void main(String[] args) 
    {
        Scanner obj=new Scanner(System.in);
        long n=obj.nextLong();
        int ans=0;
        while(n<10)
        {
            int r=(int)n%10;
            ans=(ans*10)+r;
            n=n/10;
        }
        System.out.println(ans);
    }
    
}
