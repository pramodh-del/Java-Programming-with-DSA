import java.util.Arrays;

public class transpose {
    public static void main(String[] args) {
        int[][] arr = {{3, 4, 5, 6}, {45, 6, 7, 4, 35, 6,}, {5, 6, 7, 7}};
        int[][] ans=transpose(arr);
        System.out.print(Arrays.deepToString(ans));
    }

    static int[][] transpose(int[][] arr) {
        int rows= arr.length;
        int cols=arr[0].length;
        int[][] newmatrix=new int[cols][rows];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j <cols ; j++) {
                newmatrix[j][i]=arr[i][j];

            }

        }
        return newmatrix;
    }

}
