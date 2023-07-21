import java.util.*;

public class arrpattern4
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int n = 3;
        int a[][] = new int[n + 1][n + 1];
        for (int i = 1; i <= n; i++) 
        {
            for (int j = 1; j <= n; j++) 
            {
                a[i][j] = sc.nextInt();
            }
        }
        int val = a[2][2];
        for (int i = 1; i <= n; i++) 
        {
            for (int j = 1; j <= n; j++) 
            {
                if (i == 2 && j == 2)
                    System.out.print(a[i][j] + " ");
                else if (j == 2) 
                {
                    if (i < 2) 
                    {
                        if (a[i][j - 1] + val > 10)
                            System.out.print("D ");
                        else
                            System.out.print("S ");
                    } 
                    else 
                    {
                        if (a[i][j + 1] + val > 10)
                            System.out.print("D ");
                        else
                            System.out.print("S ");
                    }
                }

                else if (i == 2) 
                {
                    if (j < i) {
                        if (a[i + 1][j] + val > 10)
                            System.out.print("D ");
                        else
                            System.out.print("S ");
                    } 
                    else 
                    {
                        if (a[i - 1][j] + val > 10)
                            System.out.print("D ");
                        else
                            System.out.print("S ");
                    }
                } 
                else
                    System.out.print(a[i][j] + val + " ");
            }
            System.out.println();
        }
    }
}

// input
// 3 3
// 1 2 3 
// 4 5 6
// 7 8 9
