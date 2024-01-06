import java.util.Arrays;

public class darray {
    public static void main(String[] args) {
        int[][] arr={{334,555,66,77},{567,89,65,33},{345,678,433,678}};
        int target=65;
        int[] ans=search(arr,target);
        System.out.println(Arrays.toString(ans));
    }
    static int[] search(int[][] arr, int target){
        for (int rows = 0; rows <arr.length ; rows++) {
            for (int cols = 0; cols <arr[rows].length ; cols++) {
                if (target==arr[rows][cols]){
                    return new int[]{rows,cols};
                }

            }
        }
        return new int[]{-1,-1};
    }
}
