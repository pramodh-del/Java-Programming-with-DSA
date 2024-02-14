public class specialx {
    public static void main(String[] args) {
        int[] arr={0,4,0,4,3};
        int ans=sepcial(arr);
        System.out.println(ans);
    }
    static int sepcial(int[] arr){
        int n=arr.length;
        for (int i = 0; i <=n ; i++) {
            int count=0;
            for(int j:arr){
               if (arr[j]>=i){
                   count++;
               }
            }
            if (count==i){
                return i;
            }
        }
        return -1;
    }
}
