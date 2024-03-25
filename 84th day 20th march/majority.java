public class majority {
    public static void main(String[] args) {
        int[] arr={1,1,2,2,2,3,4,2,2};
        System.out.println(majority(arr));
    }
    static int majority(int[] arr){
        int count=0;
        int candidate=0;
        for (int num:arr){
            if (count==0){
                candidate=num;
            }
            else if (num==candidate){
                count++;
            }
            else {
                count--;
            }
        }
        return candidate;
    }
}
