import java.util.*;
public class numberSeries2 
{
    public static void main(String[] args) 
    {
        Scanner obj=new Scanner(System.in);
        int n=obj.nextInt();
        int a=1;
        if(n%2==0)
        {
            for(int i=1;i<n-2;i+=2)
            {
                a*=3;
            }
            System.out.println(a);
        }
        else 
        {
            for(int i=0;i<n-2;i+=2)
            {
                a*=2;
            }
            System.out.println(a);
        }
    }
    
}
