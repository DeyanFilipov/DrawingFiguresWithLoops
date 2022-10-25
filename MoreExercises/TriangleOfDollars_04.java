package DrawingFiguresWithLoops.MoreExercises;

import java.util.Scanner;

public class TriangleOfDollars_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int symbol = Integer.parseInt(scanner.nextLine());

        for (int row = 1; row <= symbol; row++) {
            System.out.print("$ ");
            for (int col = 1; col < row; col++) {
                System.out.print("$ ");
            }
            System.out.println();
        }
    }
}
