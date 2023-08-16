import java.util.*;
public class correctNum 
{
      public static void main(String[] args) 
    {
        Scanner obj=new Scanner(System.in);
        int n=obj.nextInt();
        int n2=n*n,count=0,count2=0,sum=1;
        int a=n,b=n2;
        while(a!=0)
        {
           count++;
           a=a/10;
        }
        while(count!=0)
        {
            sum=sum*10;
            count--;
        }
        n2=n2%sum;
        if(n2==n)
            {
                System.out.println("Correct Number");
            }
            else 
            {
                System.out.println("Incorrect Number");
            }
    }
}
