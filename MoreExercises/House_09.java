package DrawingFiguresWithLoops.MoreExercises;

import java.util.Scanner;

public class House_09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int stars;

        if (n % 2 == 0) {
            stars = 2;
        }
        else
        {
            stars = 1;
        }
        int lines = (n - stars) / 2;
        System.out.printf("%s", repeatStr("-", lines));
        System.out.printf("%s", repeatStr("*", stars));
        System.out.printf("%s\n", repeatStr("-", lines));
        for (int i = 1; i < (n + 1) / 2; i++) {
            stars = stars + 2;
            lines = lines - 1;
            System.out.printf("%s", repeatStr("-", lines));
            System.out.printf("%s", repeatStr("*", stars));
            System.out.printf("%s\n", repeatStr("-", lines));
        }
        for (int i = 0; i <= n / 2 - 1; i++) {
            System.out.print("|");
            System.out.printf("%s", repeatStr("*", n - 2));
            System.out.print("|");
            System.out.println();
        }
    }
    static String repeatStr(String str, int count) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < count; i++) {
            sb.append(str);
        }
        return sb.toString();
    }
}
