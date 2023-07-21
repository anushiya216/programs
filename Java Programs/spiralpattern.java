import java.util.*;  
public class spiralpattern  
{  
  
static void prints(int m, int n, int arr[][])  
{  
    int i, k = 0, l = 0;  
    while (k < m && l < n)   
    {  
        for (i = l; i < n; ++i)   
        {  
            System.out.print(arr[k][i] + " ");  
        }  
        k++;  
  
        for (i = k; i < m; ++i)   
        {  
            System.out.print(arr[i][n - 1] + " ");  
        }  
        n--;  

        if (k < m)   
        {  
            for (i = n - 1; i >= l; --i)   
            {  
                System.out.print(arr[m - 1][i] + " ");  
            }  
            m--;  
        }  
  
        if (l < n)   
        {  
            for (i = m - 1; i >= k; --i)   
            {  
                System.out.print(arr[i][l] + " ");  
            }  
            l++;  
        }  
    }  
}  

public static void main(String args[])  
{  
    Scanner o=new Scanner(System.in);
    int row=o.nextInt();
    int col=o.nextInt();
    int i,j;
    int arr[][]=new int[row][col];
    for(i=0;i<row;i++)
    {
        for(j=0;j<col;j++)
        {
            arr[i][j]=o.nextInt();
        }
    }  
    prints(row, col, arr);  
}  
}