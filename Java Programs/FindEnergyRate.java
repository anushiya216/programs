import java.util.*;
public class FindEnergyRate 
{
    public static void main(String[] args) 
    {
        Scanner obj=new Scanner(System.in);
        int n=obj.nextInt();
        int a=0,b=0;
        for(int i=0;i<n;i++)
        {
            int m=obj.nextInt();
            a+=m;
            b+=a;
        }
        System.out.println(b);
    }
}
