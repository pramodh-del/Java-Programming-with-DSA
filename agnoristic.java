public class agnoristic {
    public static void main(String[] args) {
        int[] arr = {34, 56, 78, 90};
        int target = 23;
        int ans = argo(arr, target);
        System.out.println(ans);
    }

    static int argo(int[] arr, int target)
    {
        int start=0;
        int end=arr.length-1;
        boolean ans=arr[start]<arr[end];
        while (start<=end){
            int mid=start+(end-start)/2;
            if (target==arr[mid])
            {
                return mid;
            }
            if (ans)
            {
                if (target<arr[mid])
                {
                    end=mid-1;
                }
                else {
                    start=mid+1;
                }
            }
            else {
                if (target<arr[mid]){
                    start=mid+1;
                }
                else {
                    end=mid-1;
                }
            }
        }
        return -1;
    }

}