import java.util.*;
class max1
{
    public static void main(String args[])
    {
        Scanner obj=new Scanner(System.in);
        int row,col,i,j,sum=0,max=0,ans=0;
        row=obj.nextInt();
        col=obj.nextInt();
        int arr[][]=new int[row][col];
        for(i=0;i<row;i++)
        {
            for(j=0;j<col;j++)
            {
                arr[i][j]=obj.nextInt();
            }
        }
        for(i=0;i<row;i++)
        {
            for(j=0;j<col;j++)
            {
               sum+=arr[i][j];
            }
            if(sum>(max))
            {
                max=sum;
                ans=i;
            }
            
        }
        System.out.println(ans);
    }
    
}
