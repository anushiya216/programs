import java.util.*;
import java.lang.*;
public class cubeAndBeetle 
{
    public static void main(String[] args) 
    {
        Scanner obj=new Scanner(System.in);
        int n=obj.nextInt();
        int X[]=new int[n];
        int Y[]=new int[n];
        int Z[]=new int[n];
        for(int i=0;i<n;i++)
        {
            X[i]=obj.nextInt();
            Y[i]=obj.nextInt();
            Z[i]=obj.nextInt();
        }
        double dist=0;
        for(int i=0;i<n-1;i++)
        {
            if(Z[i]==Z[i+1])
            {
                double b=2*Math.PI/6;
                dist+=Math.round(b*100.0)/100.0;   
            }
            else
            {
                double a=Math.sqrt((Math.pow(X[i+1]-X[i],2))+(Math.pow(Y[i+1]-Y[i],2))+(Math.pow(Z[i+1]-Z[i],2)));  
                dist+=Math.ceil(a);
            }
        }
        System.err.println(dist);
    }
}