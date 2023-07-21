import java.util.*;
import java.lang.*;
public class lucid1 
{
  public static void main(String[] args) 
  {
    Scanner obj=new Scanner(System.in);
    int n=obj.nextInt();
    int flag=0,k=0,d=0;
    for(int i=0;i<n;i++)
    {
        int a=n-((int)Math.pow(i,2));
        for(int j=0;j<=a;j++)
        {
            for(int r=0;r<=a;r++)
            {
                if((int)Math.pow(j,r)==a && j==r )
                {
                    flag=1;
                    k=r;
                    d=i;
                    break;
                }
            }
        }
    }
    if(flag==1)
    {
        System.out.print("Yes"+"\nk="+k+"\nd="+d);
    }
    else
    {
        System.out.print("No");
    }
  }
}