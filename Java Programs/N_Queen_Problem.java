import java.util.*;
import java.lang.*;
import java.io.*;
public class N_Queen_Problem {
    final int N = 4;
    void printBoard(int board[][])
    {
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++)
                if(board[i][j]==1)
                    System.out.print("Q ");
                else
                    System.out.print(". ");
            System.out.println();
        }
    }
    boolean isSafe(int board[][], int row, int col)
    {
        int i, j;
        /* Check this row on left side */
        for (i = 0; i < col; i++)
            if (board[row][i] == 1)
                return false;
        /* Check upper diagonal on left side */
        for (i = row, j = col; i >= 0 && j >= 0; i--, j--)
            if (board[i][j] == 1)
                return false;
        /* Check lower diagonal on left side */
        for (i = row, j = col; j >= 0 && i < N; i++, j--)
            if (board[i][j] == 1)
                return false;
        return true;
    }
    boolean solveNQ(int board[][], int col)
    {
        // base case
        if (col >= N)
            return true;
        for (int i = 0; i < N; i++) {
            /* Check if the queen can be placed on
            board[i][col] */
            if (isSafe(board, i, col)) {
                /* Place this queen in board[i][col] */
                board[i][col] = 1;
                /* recursively try to place rest of the queens */
                if (solveNQ(board, col + 1) == true)
                    return true;
                board[i][col] = 0; // Backtracking
            }
        }
        return false;
    }
    boolean solve()
    {
        int board[][] = { { 0, 0, 0, 0 },
                        { 0, 0, 0, 0 },
                        { 0, 0, 0, 0 },
                        { 0, 0, 0, 0 } };
        if (solveNQ(board, 0) == false) {
            System.out.print("No Possible Solution exist");
            return false;
        }
        printBoard(board);
        return true;
    }
    public static void main(String args[])
    {
        PrepBytes Queen = new PrepBytes();
        Queen.solve();
    }
}