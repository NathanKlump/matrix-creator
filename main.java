import java.lang.Math;

public class main {
    public static void main (String[] args){
        boolean randomRowSize = true;
        createMatrix(6,6, randomRowSize);
    }
    public static int[][] createMatrix(int rowQuantity, int columnQuantitiy, boolean randomRowSize){
        int[][] matrix = new int[rowQuantity][];

            if (randomRowSize){
                for (int i = 0; i < rowQuantity; i++){
                    matrix[i] = new int[(int) (Math.random() * columnQuantitiy+1)];
                }
            } else {
                for (int i = 0; i < rowQuantity; i++){
                    matrix[i] = new int[columnQuantitiy];
                }
            }
        return matrix;
    }
    public static int[][] populateMatrix(int matrix[][]){


        return matrix;
    }

}
