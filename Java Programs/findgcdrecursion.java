import java.util.*;
import java.io.*;
public class findgcdrecursion
{
  public static void main(String[] args) 
  {
    Scanner obj=new Scanner(System.in);
    int n=obj.nextInt();
    int n1=obj.nextInt();
    System.out.println(gcd(n,n1));
  }
  public static int gcd(int n,int n1)
  {
    int gcd=0;
    if(n1!=0)
    {
        return gcd(n1,n%n1);
    }
    else
    {
        return n;
    }
  }
}