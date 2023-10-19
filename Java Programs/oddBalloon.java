import java.util.*;
public class oddBalloon
{
    public static void main(String[] args) 
    {
        Scanner obj=new Scanner(System.in);
        int n=obj.nextInt();
        char arr[]=new char[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=obj.next().charAt(0);
        }
        int flag=0;
        for(int i=0;i<n;i++)
        {
            int count=0;
            for(int j=0;j<n;j++)
            {
                if(arr[i]==arr[j] || arr[i]==(char)((int)arr[i]+32) || arr[i]==(char)((int)arr[i]-32))
                {
                    count++;
                    flag=1;
                }
            }
            if(count%2==1)
            {
                System.out.println(arr[i]);
            }
        }
        if(flag==0)
        {
            System.out.println("All are Even");
        }
    }
}