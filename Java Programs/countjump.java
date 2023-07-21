import java.util.*;
import java.io.*;
public class countjump 
{
  public static void main(String[] args) 
  {
    Scanner obj=new Scanner(System.in);
    int n=obj.nextInt();
    int count=0;
    while(n!=0)
    {
        if(n%2==0)
        {
            n=n-n/2;
            count++;
        }
        else 
        {
            n=n-1;
            count++;
        }
    }
    System.out.println(count);
  }
}
