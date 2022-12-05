import java.lang.Math;

public class main {
    public static void main (String[] args){
        //array conditions
        int rowQuantity = 6;
        int columnQuantity = 10;
        //makes the rows have a random length between 1 and the columnQuantity value
        boolean randomRowSize = true;
        findConditions(
                populateMatrix(
                        createMatrix(
                                rowQuantity,
                                columnQuantity,
                                randomRowSize
                        )
                )
        );
    }

    //find the number in the array that is the LARGEST in its row but SMALLEST in its column,
    //or it might be the other way around idk
    //print -1 if no such number exists

    public static void findConditions(int[][] matrix){
        int solution = -1;
        //write your code below
        int l = 0;
        for(int row = 0; row < matrix.length; row++){
            l = matrix[row].length;
        }
        int[] pointer = new int[2];
        int[] largestInColumn = new int[l];
        for(int i = 0; i < l;i++){
            largestInColumn[i] = 0;
        }

        //find the largest in every row
        for(int row = 0; row < matrix.length; row++){
            pointer[0] = 0;
            for(int column = 0; column < matrix[row].length; column++){
                if (matrix[row][column] > pointer[0]){
                    pointer[0] = matrix[row][column];
                    pointer[1] = column;
                }
                if (largestInColumn[column] < matrix[row][column]){
                    largestInColumn[column] = matrix[row][column];
                }
            }
            System.out.println(pointer[0] + "" + pointer[1]);
        }
        for(int i = 0; i < largestInColumn.length;i++){
            System.out.print(largestInColumn[i]);
        }

        System.out.print(solution);
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
                matrix[row][column] = (int)(Math.random()*9+1);
            }
        }
        printMatrix(matrix);
        return matrix;
    }

    public static void printMatrix(int matrix[][]){
        System.out.print("The Matrix looks like: \n");
        for(int row = 0; row < matrix.length; row++){
            for(int column = 0; column < matrix[row].length; column++){
                System.out.print(matrix[row][column]);
                System.out.print('\t');
            }
            System.out.print('\n');
        }
        System.out.print("\nThe result of query is: \n");
    }


}
