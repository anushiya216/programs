import java.util.*;
public class b {

	public static void main(String[] args) {
	
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i = sc.nextInt();
        int j = sc.nextInt();
        int p = sc.nextInt();

        int[][] board = new int[n][n];
        for (int k = 0; k < n; k++) {
            for (int l = 0; l < n; l++) {
                int dist = Math.max(Math.abs(i - k), Math.abs(j - l));
                int impact = p - dist;
                if (impact >= 0) {
                    board[k][l] = impact;
                }
            }
        }

        for (int[] row : board) {
            for (int col : row) {
                System.out.print(col + " ");
            }
            System.out.println();
        }
    }
}

// input

// 7
// 3 3
// 3
// output

// 0 0 0 0 0 0 0 
// 0 1 1 1 1 1 0
// 0 1 2 2 2 1 0
// 0 1 2 3 2 1 0
// 0 1 2 2 2 1 0 
// 0 1 1 1 1 1 0
// 0 0 0 0 0 0 0