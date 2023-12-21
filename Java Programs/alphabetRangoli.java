import java.util.*;
public class alphabetRangoli 
{
    public static void main(String[] args) 
    {
        Scanner obj=new Scanner(System.in);
        int n=obj.nextInt();
        char arr[][]=new char[n+n-1][n*n];
        for(int i=0;i<n+n-1;i++)
        {
            for(int j=0;j<n*n;j++)
            {
                arr[i][j]='-';
            }
        }
        int a=97,p=n+n-1,q=n*n;
        for(int i=0;i<n+n-1;i++)
        {
            for(int j=0;j<n*n;j++)
            {
                if(i==p/2 && j==q/2)
                {
                    arr[i][j]=(char)(97);
                    int c=0;
                    for(int k=1;k<=n-1;k++)
                    {
                        a++;
                        arr[i+k][j]=(char)a;
                        arr[i-k][j]=(char)a;
                        arr[i][j+(k+1+c)]=(char)a;
                        arr[i][j-(k+1+c)]=(char)a;
                        arr[i+k][j+(k+c+1)]=(char)(a+1);
                        arr[i+k][j-(k+c+1)]=(char)(a+1);
                        arr[i-k][j+(k+c+1)]=(char)(a+1);
                        arr[i-k][j-(k+c+1)]=(char)(a+1);
                        c++;
                    } 
                }
            }
        }
        for(int i=0;i<n+n-1;i++)
        {
            for(int j=0;j<n*n;j++)
            {
                if((i==0 && j==0) || (i==0 &&j==q-1)|| (i==p-1 && j==0) || (i==p-1 && j==q-1) || (i==0 && j!=q/2) || (i==0 && j!=q/2) )
                {
                    arr[i][j]='-';
                }
            }
        }
        for(int i=0;i<n+n-1;i++)
        {
            for(int j=0;j<n*n;j++)
            {
                System.out.print(arr[i][j]);
            }
            System.out.println();
        }
    }
}