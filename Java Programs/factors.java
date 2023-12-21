import java.util.*;
public class factors 
{
    public static void main(String[] args) 
    {
        Scanner obj=new Scanner(System.in);
        int n=obj.nextInt();
        int ans=1,r=0,flag=0;
        for(int i=n;i<1000;i++)
        {
            int a=i;
            while(a>9)
            {
                r=a%10;
                ans*=r;
                a=a/10;
            }
            if(ans*a==n)
            {
                flag=1;
                System.out.println(i);
                break;
            }
            else 
            {
                ans=1;
            }
        }   
        if(flag==0)
        {
            System.out.println("Not Possible");
        }
    }
}