import java.util.*;
public class pattern3 
{
    public static void main(String[] args) 
    {
        Scanner obj = new Scanner(System.in);
        int n=obj.nextInt();                                 
        int a[][] = new int[n][n];
        for (int i = 1; i <= n; i++) 
        {
            System.out.println();
            for (int j =1; j<=n-i; j++) 
            {
                System.out.print("1 ");
            }
            for(int j=1;j<=i;j++)
            {
                System.out.print(i+" ");
            }
        }
    }
}


// 1 1 1 1 1 1 1
// 1 1 1 1 1 2 2
// 1 1 1 1 3 3 3
// 1 1 1 4 4 4 4
// 1 1 5 5 5 5 5
// 1 6 6 6 6 6 6
// 7 7 7 7 7 7 7
