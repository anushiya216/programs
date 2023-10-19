import java.util.Scanner;

public class primcia 
{
    public static void main(String[] args) 
    {
        Scanner obj=new Scanner(System.in);
        int t=obj.nextInt();
        int sum=1;
        for(int k=0;k<t;k++)
        {
            int ans=0;
            int n=obj.nextInt();
            int arr[]=new int[n];
            int arr2[]=new int[n];
            for(int i=0;i<n;i++)
            {
                arr[i]=obj.nextInt();
            }
            for(int i=0;i<n;i++)
            {
                arr2[i]=obj.nextInt();
            }
            for(int i=0;i<n;i++)
            {
                sum*=(int)(Math.pow(arr[i],arr2[i]));
                // System.out.println(sum);
            }
            for(int i=sum;i>0;i--)
            {
                int count=0;
                for(int j=0;j<n;j++)
                {
                    if(i%arr[j]==0)
                    {
                        count++;
                    }
                }
                if(count==n)
                {
                    ans+=i;
                }
            }
            System.out.println("Final Ans is : "+ans%((int)(Math.pow(10,9))+7));
        }  
    }
}