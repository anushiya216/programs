import java.util.*;
import java.lang.*;
public class binarytodecimal 
{
  public static void main(String[] args) 
  {
    Scanner obj=new Scanner(System.in);
    int i=0,ans=0,a=0,b=0,c=0;
    int n=obj.nextInt();
    while(n>9)
    {
        a=n%(n/10);
        b=(int)(Math.pow(2,i));
        c=a*b;
        i++;
        ans+=c;
        n=n/10;
    }
    ans+=n*(int)(Math.pow(2,i));
    System.out.print(ans);
  }
}
