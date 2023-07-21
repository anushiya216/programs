import java.util.Scanner;

public class grid1 {


    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
       
        int row= scanner.nextInt();
        int col = scanner.nextInt();
        
        char[][] grid = new char[row][col];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                grid[i][j] = scanner.next().charAt(0);
            }
        }
        
     
        int count = 0;
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (grid[i][j] == 's' && j <= col- 4 && grid[i][j+1] == 'a' && grid[i][j+2] == 'b' && grid[i][j+3] == 'a') {
                    count++;
                }
                if (grid[i][j] == 's' && i <= row- 4 && grid[i+1][j] == 'a' && grid[i+2][j] == 'b' && grid[i+3][j] == 'a') {
                    count++;
                }
                if (grid[i][j] == 's' && i <= row - 4 && j <= col - 4 && grid[i+1][j+1] == 'a' && grid[i+2][j+2] == 'b' && grid[i+3][j+3] == 'a') {
                    count++;
                }
                if (grid[i][j] == 'a' && i >= 3 && j <= col- 4 && grid[i-1][j+1] == 's' && grid[i-2][j+2] == 'a' && grid[i-3][j+3] == 'b') {
                    count++;
                }
            }
        }
        
       
        System.out.println( count );
    }
}
