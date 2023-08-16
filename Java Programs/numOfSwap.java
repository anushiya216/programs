import java.util.*;
public class numOfSwap 
{
    public static void main(String[] args) 
    {
        Scanner obj=new Scanner(System.in);
        int n=obj.nextInt();
        int index=0,count=0,ans=0;
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=obj.nextInt();
        }
        int k=obj.nextInt();
        for(int i=0;i<n;i++)
        {
            if(k==arr[i])
            {
                index=i;
                break;
            }
        }
        for(int i=0;i<n;i++)
        {
            if(k>arr[i])
            {
                count++;
            }
        }
         if(index!=count)
        {
            int temp=arr[count];
            arr[count]=arr[index];
            arr[index]=temp;
            ans++;
        }
        if(index==count)
        {
            for(int i=0;i<count;i++)
            {
                if(arr[i]>k)
                {
                    ans++;
                }
            }
        }
       
        System.out.println(ans);
    }
}