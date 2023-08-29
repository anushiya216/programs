import java.util.*;
public class ProductOfDigits 
{
    public static void main(String[] args) 
    {
        Scanner obj=new Scanner(System.in);
        int n=obj.nextInt();
        int ans=1;
        while(n>9)
        {
            int r=n%10;
            ans=ans*r;
            n=n/10;
        }
        System.out.println(ans*n);
        
    }
    
}
