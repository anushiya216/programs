import java.util.*;
public class addarr 
{
    public static void main(String[] args) 
    {
        Scanner obj=new Scanner(System.in);
        int n,i,a=0,b=0,q;
        n=obj.nextInt();
        int arr[]=new int[n];
        for(i=0;i<n;i++)
        {
            arr[i]=obj.nextInt();
        }
        q=obj.nextInt();
        if(q==1)
        {
            int arr2[]=new int[2];
            for(i=0;i<2;i++)
            {
                arr2[i]=obj.nextInt();
                a=arr2[0];
                b=arr2[1];
            }
        }
        else if(q==2)
        {
            int arr2[]=new int[1];
            for(i=0;i<1;i++)
            {
                arr2[i]=obj.nextInt();
                a=arr2[0];
            }
        }
        else 
        {
            System.out.println();
        }
        int arr2[]=new int[n+1];
        int l=arr2.length;
        for(i=0;i<=a;i++)
        {
            arr2[i]=arr[i];
        }
        arr2[a]=b;
        for(i=a+1;i<l;i++)
        {
            arr2[i]=arr[a];
            a++;
        }
        for(i=0;i<l;i++)
        {
           System.out.print(arr2[i]+" ");
        }
    }
}
