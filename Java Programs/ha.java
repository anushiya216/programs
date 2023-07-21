import java.util.*;
public class ha 
{
    public static void main(String[] args) 
    {
        Scanner obj=new Scanner(System.in);
        int n,i,j,a,b,s;
        n=obj.nextInt();
        a=n;b=n;s=n;
        char arr[][]=new char[n][n];
        for(i=0;i<s;i++)
        {
            for(j=0;j<s;j++)
            {
                if(i==0 && j==0)
                {
                    arr[i][j]=(char)(91-(n));
                    n--;
                }
                else if(i==1 && j==0)
                {
                    arr[i][j]=(char)(91-(i+(n-c)));
                }
                else if(i==j && i>0)
                {
                    arr[i][j]=(char)(91-(i+(n-c)));
                }
                else if(j<i && i>0)
                {
                    int c=n-3;
                    arr[i][j]=(char)(91-(i+c));
                    a=a-2;
                }
                else 
                {
                    arr[i][j]=' ';
                }
            }
        }
        for(i=0;i<s;i++)
        {
            for(j=0;j<s;j++)
            {
                System.out.print(arr[i][j]);
            }
            System.out.println();
        }
    }
}
