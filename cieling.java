public class cieling {
    public static void main(String[] args) {
        int[] arr={2,3,4,6,8,14,16};
        int target=15;
        int ans=cilieng(arr,target);
        System.out.println(ans);
    }

    static int cilieng(int[] arr, int target) {
        int start=0;
        int end=arr.length-1;
        if (target>arr[arr.length-1]){
            return -1;
        }
        while (start<=end){
            int mid=start+(end-start)/2;
            if (target>arr[mid]){
                start=mid+1;
            }
            else {
                end=mid-1;
            }
        }
        return start;
    }
}
