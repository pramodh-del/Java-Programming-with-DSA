import java.util.Arrays;

public class sorted2darray {
    public static void main(String[] args) {
                 int[][] arr={
                         {1,2,3},
                         {4,5,6},
                         {7,8,9}
                 };
        System.out.println(Arrays.toString(search(arr,6)));
    }
    static int[] search(int[][] arr, int target) {
        int rows = arr.length;
        int cols = arr[0].length;
        if (rows == 1) {
            return binarysearch(arr, 0, 0, cols - 1, target);
        }
        int rowstart = 0;
        int rowend = rows - 1;
        int cmid = cols / 2;
        while (rowstart < (rowend - 1)) {
            int mid = rowstart + (rowend - rowstart) / 2;
            if (arr[mid][cmid] == target) {
                return new int[]{mid, cmid};
            }
            if (arr[mid][cmid] < target) {
                rowstart = mid;
            } else {
                rowend = mid;
            }

        }
        if (arr[rowstart][cmid] == target) {
            return new int[]{rowstart, cmid};
        }
        if (arr[rowstart + 1][cmid] == target) {
            return new int[]{rowstart + 1, cmid};

        }
        if (target<=arr[rowstart][cmid-1]){
            return binarysearch(arr,rowstart,0,cmid-1,target);
        }
        if (target>=arr[rowstart][cmid+1]&&target<=arr[rowstart][cols-1]){
            return binarysearch(arr,rowstart,cmid+1,cols-1,target);
        }
        if (target<=arr[rowstart+1][cmid-1]){
            return binarysearch(arr,rowstart+1,0,cmid-1,target);
        }
        else {
            return binarysearch(arr,rowstart+1,cmid+1,cols-1,target);
        }
    }
    static int[] binarysearch(int[][] arr,int row,int cstart,int cend,int target){
        while (cstart<=cend){
            int mid=cstart+(cend-cstart)/2;
            if (arr[row][mid]==target){
                return new int[]{row,mid};
            }
            else if (arr[row][mid]<target){
                cstart=mid+1;
            }
            else {
                cend=mid-1;
            }
        }
        return new int[]{-1,-1};
    }
}
