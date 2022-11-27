import java.lang.Math;

public class main {
    public static void main (String[] args){
        //array conditions
        int rowQuantity = 6;
        int columnQuantity = 6;
        //makes the rows have a random length between 1 and the columnQuantity value
        boolean randomRowSize = true;

        findConditions(populateMatrix(createMatrix(rowQuantity,columnQuantity, randomRowSize)));
    }

    //find the number in the array that is the LARGEST in its row but SMALLEST in its column,
    //or it might be the other way around idk
    //return -1 if no such number exists

    public static int findConditions(int[][] ints){
        int solution = -1;
        //write your code here




        return solution;
    }


    //code to set up and populate the 2d array
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
        for(int row = 0; row < matrix.length; row++){
            for(int column = 0; column < matrix[row].length; column++){
                matrix[row][column] = (int)(Math.random()*10+1);
            }
        }

        return matrix;
    }

}
