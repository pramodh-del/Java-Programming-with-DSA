import java.util.Arrays;

public class search2d {
    public static void main(String[] args) {
             int[][] arr={
                     {10,20,30,40},
                     {15,21,32,42},
                     {27,24,38,50}
             };
        System.out.println(Arrays.toString(search(arr,344)));
    }
    static int[] search(int[][] arr, int target){
        int start=0;
        int end=arr.length-1;
        while (start<end&&end>=0){
            if (arr[start][end]==target){
                return new int[]{start,end};
            }
            else if (arr[start][end]<target){
                start++;
            }
            else {
                end--;
            }

        }

        return new int[]{-1,-1};
    }
}
