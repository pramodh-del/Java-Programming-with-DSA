public class GuessGame {
    public static void main(String[] args) {
        int n=10;

        int ans=guessgame(n);
        System.out.println(ans);

    }
    static int guessgame(int n){
        int num=guess(n);
        return num;

    }
    static int guess(int num)
    {
        int star=0;
        int end=num;
        for (int i = 1; i <num ; i++) {
            int mid=star+(end-star)/2;
            if (mid==num){
                return 0;
            }
            if (mid<num)
            {
                end=mid-1;
                return 1;
            }
            else if (mid>num)
            {
                star=mid+1;
                return -1;
            }

        }
        return num;
    }
}
