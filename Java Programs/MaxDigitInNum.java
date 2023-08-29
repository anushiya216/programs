import java.util.*;
public class MaxDigitInNum 
{
    public static void main(String[] args) 
    {
        Scanner obj=new Scanner(System.in);
        int n=obj.nextInt();
        int max=0;
        while(n!=0)
        {
            int r=n%10;
            if(r>max)
            {
                max=r;
            }
            n/=10;
        }
        System.out.println(max);
    }
    
}
