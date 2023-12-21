import java.util.*;
public class BestBank 
{
    public static void main(String[] args) 
    {
        Scanner obj=new Scanner(System.in);
        int amount=obj.nextInt();
        int n=obj.nextInt();
        int n1=obj.nextInt();
        double time[]=new double[n1];
        double rate[]=new double[n1];
        for(int i=0;i<n1;i++)
        {
            time[i]=obj.nextDouble();
            rate[i]=obj.nextDouble();
        }
        int n2=obj.nextInt();
        double time2[]=new double[n2];
        double rate2[]=new double[n2];
        for(int i=0;i<n2;i++)
        {
            time2[i]=obj.nextDouble();
            rate2[i]=obj.nextDouble();
        }
        double bank1=0,bank2=0;
        for(int i=0;i<n1;i++)
        {
            double a=time[i],b=rate[i];
            bank1+=(amount*b)/(1-(1/Math.pow((1+b),(a*12))));
        }
        for(int i=0;i<n2;i++)
        {
            double a2=time2[i],b2=rate2[i];
            bank2+=(amount*b2)/(1-(1/Math.pow((1+b2),(a2*12))));
        }
        if(bank1<bank2)
        {
            System.out.println("Bank A");
        }
        else 
        {
            System.out.println("Bank B");
        }
    }
}