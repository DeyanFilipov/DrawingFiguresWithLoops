package DrawingFiguresWithLoops.MoreExercises;

import java.util.Scanner;

public class SquareFrame_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int rows = Integer.parseInt(scanner.nextLine());
        System.out.print("+");
        for (int i = 0; i < rows - 2; i++) {
            System.out.print(" -");
        }
        System.out.println(" +");

        for (int row = 0; row < rows - 2; row++) {
            System.out.print("|");
            for (int i = 0; i < rows - 2; i++) {
                System.out.print(" -");
            }
            System.out.println(" |");
        }
        System.out.print("+");
        for (int i = 0; i < rows - 2; i++) {
            System.out.print(" -");
        }
        System.out.println(" +");
    }
}
