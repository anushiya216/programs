import java.util.*;
import java.lang.*;

public class MersennePrime 
{
    public static void main(String[] args) 
    {
        Scanner obj=new Scanner(System.in);
        int n=obj.nextInt();
        int flag=0;
        for(int i=0;i<=n;i++)
        {
            if(((int)(Math.pow(2,i))-1)==n)
            {
                flag=1;
                break;
            }
        }
        if(flag==1)
        {
            System.out.println("Mersenne Prime Number");
        }
        else
        {
            System.out.println("Not a Mersenne Prime Number");
        }
    }
    
}
