import java.util.*;
public class trainee 
{
    public static void main(String[] args) 
    {
        Scanner obj=new Scanner(System.in);
        int n=obj.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=obj.nextInt();
            if(arr[i]<0 || arr[i]>100 )
            {
                System.out.println("Invalid Input");
                break;
            }
        }
        int max=0,m=n/3;
        int avg[]=new int[m];
        for(int i=0;i<m;i++)
        {
            avg[i]=0;
        }
        for(int i=0;i<m;i++)
        { 
            for(int j=i;j<n;j+=3)
            {
                avg[i]=avg[i]+arr[j];
            }
            avg[i]=avg[i]/m;
            if(max<avg[i])
            {
                max=avg[i];
            }
        }
        if(max<70)
        {
            System.out.println("All are UNFIT");
        }
        else 
        {
            for(int i=0;i<m;i++)
            {
                if(max==avg[i])
                {
                    int a=i+1;
                    System.out.println("Trainee Number: " +a);
                }
            }
        }
    }
}