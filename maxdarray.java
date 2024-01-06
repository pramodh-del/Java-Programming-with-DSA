import java.util.Arrays;

public class maxdarray {
    public static void main(String[] args) {
        int [][] arr={{34,55,6,67,57},{56,67,6,5,444,444}};
        int ans=maxint(arr);
        System.out.println(ans);

    }
    static int maxint(int[][] arr){
        int max=Integer.MIN_VALUE;
        for (int rows = 0; rows <arr.length ; rows++) {
            for (int cols = 0; cols <arr[rows].length ; cols++)
            {
                if (arr[rows][cols]>max){
                    max=arr[rows][cols];

                }
            }
        }
        return max;
    }
}
