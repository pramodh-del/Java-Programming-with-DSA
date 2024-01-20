public class missingnumber {
    public static void main(String[] args) {
int[] arr={1,2,3,5};
        System.out.println(missingnumber(arr));
    }
    static int missingnumber(int[] arr){
        int n=arr.length-1;
        int sum=n*(n+1)/2;
        System.out.println(sum);
        return sum;
    }
}
