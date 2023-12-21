import java.util.*;
import java.lang.*;
public class findABusFare
{
    public static void main(String[] args)
    {
        Scanner obj=new Scanner(System.in);
        String busStop[]={"TH","GA","IC","HA","TE","LU","NI","CA"};
        int dist[]={800,600,750,900,1400,1200,1100,1500};
        String s1=obj.nextLine();
        String s2=obj.nextLine();
        double cost=0;int start=0,end=0;
        for(int i=0;i<busStop.length;i++)
        {
            if(s1.equals(busStop[i]))
            {
                start=i;
            }
            if(busStop[i].equals(s2))
            { 
                end=i;
            }
        }
        int dista=0;
        if(end<start)
        {
            for(int i=start;i>=end;i--)
            {
                dista+=dist[i];
            }
        }
        else if(start==end)
        {
            dista=0;
        }
        else
        {
            for(int i=start;i<=end;i++)
            {
                dista+=dist[i];
            }
        }
        cost=cost+(Math.rint((double)(dista*5/1000)));
        System.out.println(cost);
    }
}