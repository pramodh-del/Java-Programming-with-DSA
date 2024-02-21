import java.util.Arrays;

public class sortedarraynew {
    public static void main(String[] args) {
        int[][] arr={
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };
        System.out.println(Arrays.toString(search(arr,9
        )));
    }
    static int[] search(int[][] arr,int target){
        int rows=arr.length;
        int cols=arr[0].length;
         if (rows==1){
             return binarysearch(arr,0,0,cols-1,target);
         }
         int rstart=0;
         int rend=rows-1;
         int cmid=cols/2;
         while (rstart<(rend-1)){
             int mid=rstart+(rend-rstart)/2;
             if (arr[mid][cmid]==target){
                 return new int[]{mid,cmid};
             }
             else if (arr[mid][cmid]<target){
                 rstart=mid;
             }
             else {
                 rend=mid;
             }
         }
         if (arr[rstart][cmid]==target){
             return new int[]{rstart,cmid};
         }
         if (arr[rstart+1][cmid]==target){
             return new int[]{rstart+1,cmid};
         }
         if (target<=arr[rstart][cmid-1]){
             return binarysearch(arr,rstart,0,cmid-1,target);
         }
         if (target>=arr[rstart][cmid+1]&&target<=arr[rstart][cols-1]){
             return binarysearch(arr,rstart,cmid+1,cols-1,target);
         }
         if (target<=arr[rstart+1][cmid-1]){
             return binarysearch(arr,rstart+1,0,cmid-1,target);
         }
         else {
             return binarysearch(arr,rstart+1,cmid+1,cols-1,target);
         }
    }
    static int[] binarysearch(int[][]arr,int row,int cstart,int cend,int target){
        while (cstart<=cend){
            int mid=cstart+(cend-cstart)/2;
            if (arr[row][mid]==target){
                return new int[]{row,mid};
            }
            else if(arr[mid][row]<target){
                cstart=mid+1;
            }
            else {
                cend=mid-1;
            }
        }
        return new int[]{-1,-1};
    }
}
