import java.util.*;
public class parkingProblem 
{
    public static void main(String[] args) 
    {
        Scanner obj=new Scanner(System.in);
        int r=obj.nextInt();
        int c=obj.nextInt();
        int arr[][]=new int[r][c];
        for(int i=0;i<r;i++)
        {
            for(int j=0;j<c;j++)
            {
                arr[i][j]=obj.nextInt();
            }
        }
        int max=0,ans=0,count=0;
        for(int i=0;i<r;i++)
        {
            count=0;
            for(int j=0;j<c;j++)
            {
                if(arr[i][j]==1)
                {
                    count++;
                }
            }
            if(count>max)
            {
                max=count;
                ans=i;
            }
        }
        System.out.println(ans+1);
    }
    
}
