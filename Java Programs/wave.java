import java.util.*;
class wave
{
    public static void main(String[] args)
    {
	    Scanner obj = new Scanner(System.in);
        int n=obj.nextInt();
        int i,j;
        int arr[][]=new int[n][n];
        for(i=0;i<n;i++)
        {
            for(j=0;j<n;j++)
            {
                arr[i][j]=obj.nextInt();
            }
        }
        int list[]=new int[n*n];
        int a=0;
        for (i=0;i<3;i++)
        {
            if (i%2==0)
            {
                for (j=0;j<3;j++) 
                {
                    list[a++]=arr[j][i];
                }
            } 
            else 
            {
                for (j=2;j>=0;j--) 
                {
                    list[a++]=arr[j][i];
                }
            }
        }
        for(i=0;i<n*n;i++)
        {
            System.out.print(list[i]+" ");
        }   
    }
}
