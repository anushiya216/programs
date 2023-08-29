import java.util.*;
public class ProductOfSumOfOddNEvenNum 
{
    public static void main(String[] args) 
    {
        Scanner obj=new Scanner(System.in);
        int n=obj.nextInt();
        int a=0,b=0;
        while(n!=0)
        {
            int r=n%10;
            if(r%2==0)
            {
                b+=r;
            }
            else 
            {
                a+=r;
            }
            n=n/10;
        }
        System.out.println(a*b);
    }
    
}
