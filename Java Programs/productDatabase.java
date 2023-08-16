import java.util.*;
public class productDatabase 
{
    public static void main(String[] args) 
    {
        Scanner obj=new Scanner(System.in);
        System.out.print("Enter products size:");
        int n=obj.nextInt();
        String pro[]=new String[n+1];
        int a=0,count=0;
        System.out.print("Enter products:");
        for(int i=0;i<n+1;i++)
        {
            pro[i]=obj.nextLine();
        }
        System.out.print("Enter rates:");
        double rate[]=new double[n];
        for(int i=0;i<n;i++)
        {
            rate[i]=obj.nextDouble();
        }
        System.out.print("Enter new products size:");
        int m=obj.nextInt();
        System.out.print("Enter new products:");
        String newpro[]=new String[m+1];
        for(int i=0;i<m+1;i++)
        {
            newpro[i]=obj.nextLine();
        }
        System.out.print("Enter new rate:");
        double newrate[]=new double[m];
        for(int i=0;i<m;i++)
        {
            newrate[i]=obj.nextDouble();
        }
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(newpro[i]==pro[j])
                {
                    a=j;
                    break;
                }
            }
            if(rate[a]!=newrate[i])
            {
                count+=1;
            }
        }
        System.out.println(count);
    }
    
}
