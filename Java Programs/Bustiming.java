import java.util.*;
public class Bustiming 
{
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        int n=obj.nextInt();
        int arr[][]=new int[n][2];
        int count=0;
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<2;j++)
            {
                arr[i][j]=obj.nextInt();
            }
        }
        for(int i=0;i<n-1;i++)
        {
            for(int j=1;j<2;j++)
            {
                if(arr[i][j]>arr[i+1][j-1])
                {
                    count++;
                }
            }
        }
        System.out.println(count);
    }
    
}
