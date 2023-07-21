import java.util.*;
public class tripletsum 
{
    public static void main(String[] args) 
    {
        Scanner obj=new Scanner(System.in);
        int n=obj.nextInt();
        int arr[]=new int[n];
        int sum=0,flag=0;
        for(int i=0;i<n;i++)
        {
            arr[i]=obj.nextInt();
        }
        for(int i=0;i<n;i++)
        {
            for(int j=i+1;j<n;j++)
            {
                for(int k=j+1;k<n;k++)
                {
                    if(((arr[i]+arr[j]+arr[k])==sum) && (i!=j) && (j!=k))
                    {
                        flag=1;
                        System.out.println(arr[i]+" "+arr[j]+ " "+arr[k]);
                    }
                }
            }
        }
        if(flag==0)
        {
            System.out.print("No Elements");
        }
    }
}