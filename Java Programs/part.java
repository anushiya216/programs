import java.util.*;
public class part {
	public static void main(String[] args)
	{
        Scanner obj=new Scanner(System.in);
		int n=obj.nextInt();
		int arr[][]  = new int[n + 1][n + 1];
		for (int i = 0; i < n + 1; i++) {
			for (int j = 0; j < n + 1; j++) {
				if (j > i)
					arr[i][j] = 0;
				else if (i == j)
					arr[i][j] = 1;
				else if (i == 0 || j == 0)
					arr[i][j] = 0;
				else {
					arr[i][j]
						= j * arr[i - 1][j] + arr[i - 1][j - 1];
				}
			}
		}
		int ans = 0;
		for (int i = 0; i < n + 1; i++) {
			ans += arr[n][i];
		}
		System.out.println(ans);
	}
}
