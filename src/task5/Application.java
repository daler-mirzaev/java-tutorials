package task5;

public class Application {

    public static void main(String[] args) {
        int[][] matrix = {
                {1, 0, 0},
                {0, 5, 0},
                {0, 0, 9},
        };
        System.out.println("diogonal element");
        for (int i = 0; i < matrix.length; i++){
            System.out.println(matrix[i][i]);

        }


    }
}