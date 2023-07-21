import java.util.*;
public class largestprimeno
{
    public static void main(String args[])
    {
        Scanner obj=new Scanner(System.in);
        int a=obj.nextInt();
        int b=obj.nextInt();
        int sol=0;
        for(int i=a;i<b;i++)
        {
            for(int j=i+1;j<b;j++)
            {
               if(i%2!=0 && i%3!=0 || i==2 || i==3)
               {
                sol=i;
               }
            }
        }
        System.out.print(sol);
        
    }
}