package DrawingFiguresWithLoops.MoreExercises;

import java.util.Scanner;

public class Sunglasses_08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < n * 2; i++) {
            System.out.print("*");
        }
        for (int i = 0; i < n; i++) {
            System.out.print(" ");
        }
        for (int i = 0; i < n * 2; i++) {
            System.out.print("*");
            if (i == n * 2 - 1) {
                System.out.println();
            }
        }
        for (int i = 0; i < n - 2; i++) {
            System.out.print("*");
            for (int j = 0; j < (2 * n) - 2; j++) {
                System.out.print("/");
            }
            System.out.print("*");

            if (n % 2 == 0) {
                if (i == (n - 3) / 2) {
                    for (int k = 0; k < n; k++) {
                        System.out.print("|");
                    }
                } else {
                    for (int j = 0; j < n; j++) {
                        System.out.print(" ");
                    }
                }
            } else {
                double middle = Math.floor((n - 2.0) / 2);
                if (i == (int) (middle)) {
                    for (int k = 0; k < n; k++) {
                        System.out.print("|");
                    }
                } else {
                    for (int j = 0; j < n; j++) {
                        System.out.print(" ");
                    }
                }
            }
            System.out.print("*");
            for (int j = 0; j < (2 * n) - 2; j++) {
                System.out.print("/");
            }
            System.out.print("*");
            System.out.println();
        }
        for (int i = 0; i < n * 2; i++) {
            System.out.print("*");
        }
        for (int i = 0; i < n; i++) {
            System.out.print(" ");
        }
        for (int i = 0; i < n * 2; i++) {
            System.out.print("*");
            if (i == n * 2 - 1) {
                System.out.println();
            }
        }
    }
}
