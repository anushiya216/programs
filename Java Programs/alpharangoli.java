import java.util.Scanner;
public class alpharangoli {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int rows = scanner.nextInt();
        scanner.close();
        printDiamond(rows);
    }
    private static void printDiamond(int rows) {
        int a=97;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < rows - i - 1; j++) {
                System.out.print("-");
            }
            for (int j = 0; j < 2 * i + 1; j++) {
                System.out.print((char)a);
            }
            System.out.println();
            a++;
        }
        a=0;
        for (int i = rows - 2; i >= 0; i--) {
            for (int j = 0; j < rows - i - 1; j++) {
                System.out.print("-");
            }
            for (int j = 0; j < 2 * i + 1; j++) {
                System.out.print((char)a);
            }
            System.out.println();
            a++;
        }
    }
}