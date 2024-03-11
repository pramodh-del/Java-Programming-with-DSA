public class Solution {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5};
        int target=5;
        nums(5);
    }
    static int bs(int[] arr,int s ,int e,int target){
        if (s>e){
            return -1;
        }
        int mid=s+(e-s)/2;
        if (arr[mid]==target){
            return mid;
        }
        if (arr[mid]<target){
            return bs(arr,mid+1,e,target);
        }
        return bs(arr,s,mid-1,target);
    }

    static void nums(int n){
        if (n==5){
            System.out.println(5);
            return;
        }
        System.out.print(n);
        nums(n+1);
    }
}
