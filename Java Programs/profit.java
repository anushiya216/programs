import java.util.*;

public class profit 
{
    public static void main(String[] args) 
    {
        Scanner obj=new Scanner(System.in);
        int n=obj.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=obj.nextInt();
        } 
        int k=obj.nextInt();
        int a=0,b=0,c=0,d=0,sell=0,sell2=0;
        int arr2[]=Arrays.copyOf(arr,n);
        Arrays.sort(arr);
        for(int i=0;i<n;i++)
        {
            if(arr[1]==arr2[i])
            {
                b=arr2[i];
                d=i;
            }
            else if(arr2[i]==arr[0])
            {
                a=arr2[i];
                c=i;
            }
        }
        int e=a;
        for(int i=c+1;i<d;i++)
        {
            if(arr2[i]>e)
            {
                sell=arr2[i];
                e=arr2[i];
            }
        }
        int f=b;
        for(int i=d+1;i<n;i++)
        {
            if(arr2[i]>f)
            {
                sell2=arr2[i];
                f=arr2[i];
            }
        }
        int ans=(sell-a)+(sell2-b);
        System.out.print(ans);
    }
}
