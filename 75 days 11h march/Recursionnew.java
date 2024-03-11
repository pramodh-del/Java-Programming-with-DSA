public class Recursionnew {
    public static void main(String[] args) {

        int[] arr = {1,2,3,4,5};
        int target = 5;
        System.out.println(search(arr, target, 0, arr.length-1));
    }

    static void helloworld(int n) {
        if (n == 10) {
            System.out.println("Hello Pramodh");
            return;
        }
        System.out.println("hello Pramodh");
        helloworld(n + 1);
    }

    static int fib(int n) {
        if (n < 2) {
            return n;
        }
        return fib(n - 1) + fib(n - 2);
    }
    static int search(int[] arr, int target, int s, int e) {
        if (s > e) {
            return -1;
        }
        int m = s + (e - s) / 2;
        if (arr[m] == target) {
            return m;
        }
        if (target < arr[m]) {
            return search(arr, target, s, m - 1);
        }
        return search(arr, target, m + 1, e);
    }
}