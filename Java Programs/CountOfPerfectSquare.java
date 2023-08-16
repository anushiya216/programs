import java.util.*;
public class CountOfPerfectSquare 
{
    public static void main(String[] args) 
    {
        Scanner obj=new Scanner(System.in);
        int n=obj.nextInt();
        int arr[]=new int[n];
        int count=0;
        for(int i=0;i<n;i++)
        {
            arr[i]=obj.nextInt();
            for(int j=0;j<=arr[i];j++)
            {
                if(j*j==arr[i])
                {
                    count++;
                    break;
                }
            }
        }
        System.out.println(count);
    }
    
}
