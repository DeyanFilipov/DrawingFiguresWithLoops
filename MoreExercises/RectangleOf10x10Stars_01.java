package DrawingFiguresWithLoops.MoreExercises;

public class RectangleOf10x10Stars_01 {
    public static void main(String[] args) {
        for (int row = 1; row <= 10; row++) {
            for (int col = 1; col <= 10; col++)
                System.out.print('*');
            System.out.println();
        }
    }
}