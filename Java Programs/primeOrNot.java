import java.util.*;
import java.lang.*;
public class primeOrNot 
{
    public static void main(String[] args) 
    {
        Scanner obj=new Scanner(System.in);
        int n=obj.nextInt();
        if(n<0)
        {
            System.out.println("Enter a positive integer...!!!");
        }
        else 
            prime(n);
    }
    public static void prime(int n)
    {
        int count=0;
        for(int i=2;i<=(int)Math.sqrt(n);i++)
        {
            if(n%i==0)
            {
                count++;
            }
        }
        if(count>0)
        {
            System.out.println("It is not a prime number");
        }
        else 
        {
            System.out.println("It is a prime number");
        }
    }
}