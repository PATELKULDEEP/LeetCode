import java.util.Arrays;

public class DiffBetweenOnesAndZerosInRowAndCol_6277 {

    public static void main(String[] args) {

        int[][] grid = {{0,1,1},{1,0,1},{0,0,1}};

        System.out.println(Arrays.deepToString(onesMinusZeros(grid)));

    }
    public static int[][] onesMinusZeros(int[][] grid) {

        int row = grid.length;
        int col = grid[0].length;

        int[] onesRow = new int[row];
        int[] onesCol = new int[col];

        for(int i=0;i<row;i++){

            for(int j=0;j<col;j++){

                if(grid[i][j] == 1){
                    onesRow[i]++;
                }

            }

        }

        for(int j=0;j<col;j++){

            for(int i=0;i<row;i++){

                if(grid[i][j] == 1){
                    onesCol[j]++;
                }

            }

        }

        int[][] diff = new int[row][col];

        for(int i=0;i<row;i++){

            for(int j=0;j<col;j++){
                int oneRow = onesRow[i];
                int zeroRow = Math.abs(oneRow - col);
                int oneCol = onesCol[j];
                int zeroCol = Math.abs(oneCol-row);
                diff[i][j] = oneRow + oneCol - zeroRow - zeroCol;


            }

        }


        return diff;

    }

}
