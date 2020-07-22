import java.util.Arrays;
import java.util.Scanner;

public class GreenVsRed {

    public static int matrixRow;
    public static int matrixCol;

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("rows");

        matrixRow = scan.nextInt();

        System.out.println("columns");

        matrixCol = scan.nextInt();

        char[][] matrix = new char[matrixRow][matrixCol];

        enterMatrixData(scan, matrix, matrixRow, matrixCol);

        System.out.println("Enter coordinates of the cell: ");

        int[] cellCoordinates = new int[2];

        for(int i = 0; i < cellCoordinates.length; i++) {
            cellCoordinates[i] = scan.nextInt();
        }

        System.out.println(Arrays.toString(cellCoordinates));

        for(int i = 0; i < matrixRow; i++)
        {
            for(int j = 0; j < matrixCol; j++)
            {
                if(matrix[cellCoordinates[0]][cellCoordinates[cellCoordinates.length-1]] == '1') {
                   //условия за ред
                }else {
                    //условия за колона 0
                }

            }
        }

        CellsList neighbours = getNeighbors(matrixRow, matrixCol);
    }

    public static void enterMatrixData(Scanner scan, char[][] matrix, int matrixRow, int matrixCol) {
        System.out.println("enter data");

        for (int i = 0; i < matrixRow; i++) {
            String data = "";
            if (scan.hasNext()) {
                data = scan.next();
            } else {
                break;
            }
            for (int j = 0; j < matrixCol; j++)
                matrix[i][j] = data.charAt(j);
        }
        printMatrix(matrix);

    }

    public static void printMatrix(char[][] matrix) {
        System.out.println("matrix: ");
        System.out.println("[");
        for (char[] row : matrix) {
            System.out.println(Arrays.toString(row) + ",");
        }
        System.out.println("]");
    }

    private static CellsList getNeighbors(int  row, int col) {

        CellsList neighbors = new CellsList();

        for (int colNum = col - 1 ; colNum <= (col + 1) ; colNum +=1  ) {

            for (int rowNum = row - 1 ; rowNum <= (row + 1) ; rowNum +=1  ) {

                if(!((colNum == col) && (rowNum == row))) {

                    if(withinGrid(rowNum, colNum)  ) {

                        neighbors.add( new int[] {rowNum, colNum});
                    }
                }
            }
        }

        return neighbors;
    }

    private static boolean withinGrid(int colNum, int rowNum) {

        if((colNum < 0) || (rowNum < 0) ) {
            return false;
        }
        if((colNum >= matrixCol) || (rowNum >= matrixRow)) {
            return false;
        }
        return true;
    }

}

