import java.util.*;
public class LCM_N_GCD 
{
    public static void main(String[] args) 
    {
        Scanner obj=new Scanner(System.in);
        int a=obj.nextInt();
        int b=obj.nextInt();
        int max=0,min=0;
        if(a>b)
        {
            max=a;
            min=b;
        }
        else
        {
            max=b;
            min=a;
        }
        for(int i=1;i<min;i++)
        {
            if((max*i)%min==0)
            {
                System.out.println("LCM: "+max*i);
                break;
            }
        }
        for(int i=min;i>=1;i--)
        {
            if((max % i==0) && (min % i==0))
            {
                System.out.println("GCD: "+i);
                break;
            }
        }
    }  
}