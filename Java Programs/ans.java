import java.util.*;
public class ans
{
    public static void main(String[] args)
    {
        Scanner obj = new Scanner(System.in);
        int n = obj.nextInt();
        int[][] s = new int[n + 1][n + 1];
        for (int i = 0; i < n + 1; i++) {
            for (int j = 0; j < n + 1; j++) {
                if (j > i)
                    s[i][j] = 0;
                else if (i == j)
                    s[i][j] = 1;
                else if (i == 0 || j == 0)
                    s[i][j] = 0;
                else {
                    s[i][j]
                        = j * s[i - 1][j] + s[i - 1][j - 1];
                }
            }
        }
        int ans = 0;
        for (int i = 0; i < n + 1; i++) {
            ans += s[n][i];
        }
        System.out.println(ans);
    }
}