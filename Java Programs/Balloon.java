import java.util.*;
public class Balloon 
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
        for(int i=0;i<n;i++)
        {
            int count=1;
            for(int j=0;j<n;j++)
            {
                if(arr[i]==arr[j] && i!=j )
                {
                    count++;
                }
            }
            if(count==1)
            {
                System.out.println(arr[i]);
            }
        }
    }
}
