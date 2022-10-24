package DrawingFiguresWithLoops.MoreExercises;

import java.util.Scanner;

public class SquareOfStars_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int stars = Integer.parseInt(scanner.nextLine());

        for (int outer = 1; outer <= stars; outer++) {
            for (int inner = 1; inner <= stars; inner++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
