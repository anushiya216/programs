import java.util.*;
public class countOfGreaterElement 
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
        int count=1;
        for(int i=1;i<n;i++)
        {
            int temp=0;
            for(int j=0;j<i;j++)
            {
                if(arr[i]>arr[j])
                {
                    temp++;
                }
                else{
                    break;
                }
            }
            if(temp==i)
            {
                count++;
            }
        }
        System.out.println(count);
    }
}