import java.util.*;
import java.io.*;
public class gcd
{
  public static void main(String[] args) 
  {
    Scanner obj=new Scanner(System.in);
    int n=obj.nextInt();
    int n1=obj.nextInt();
    int count=0,gcd=1,i;
    if(n<n1)
    {
        for(i=n;i>1;i--)
        {
            if(n%i==0 && n1%i==0)
            {
                gcd=i;
                break;
            }
        }
    }
    else if(n>n1)
    {
        for(i=n1;i>1;i--)
        {
            if(n%i==0 && n1%i==0)
            {
                gcd=i;
                break;
            }
        }
    }
    else
    {
        gcd=n;
    }
    System.out.println(gcd);
  }
}