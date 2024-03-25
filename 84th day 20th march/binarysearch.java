public class binarysearch {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5};
        int target=5;
        System.out.println(bs(arr,target));

    }
    static int bs(int[] arr,int target){
        int start=0;
        int end=arr.length;
        while (start<end){
            int mid=start+(end-start)/2;
            if (arr[mid]==target){
                return mid;
            }
            else if(arr[mid]<target){
                start=mid+1;
            }
            else{
                end=mid-1;
            }
        }
        return -1;
    }
}
