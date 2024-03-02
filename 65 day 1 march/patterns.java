public class patterns {
    public static void main(String[] args) {
        pattern30(5);
    }

    static void pattern1(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void pattern2(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void pattern3(int n) {
        int count = 0;
        for (int i = 0; i < n; i++) {
            int spaces = n - i;
            for (int s = 0; s < spaces; s++) {
                System.out.print(" ");
            }
            for (int j = 0; j < i; j++) {
                System.out.print(count + " ");

            }
            count++;

            System.out.println();
        }
    }

    static void pattern4(int n) {
        for (int i = 0; i < n; i++) {
            for (int s = 0; s < i; s++) {
                System.out.print(" ");
            }
            for (int j = 0; j < n - i; j++) {
                System.out.print("*");
            }
            System.out.println();

        }
    }

    static void pattern28(int n) {
        for (int i = 0; i < 2 * n; i++) {
            int index = i > n ? 2 * n - i : i;
            int spaces = n - index;
            for (int s = 0; s < spaces; s++) {
                System.out.print(" ");
            }
            for (int j = 0; j < index; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void pattern17(int n) {
        for (int i = 0; i < 2 * n; i++) {
            int index = i > n ? 2 * n - i : i;
            int spaces = n - index;
            for (int s = 0; s < spaces; s++) {
                System.out.print("  ");
            }
            for (int j = index; j >= 1; j--) {
                System.out.print(j + " ");
            }
            for (int j = 2; j <= index; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }

    static void pattern30(int n) {
        for (int i = 0; i < n; i++) {
              int spaces=n-i;
            for (int s = 0; s <spaces ; s++) {
                System.out.print("  ");
            }
            for (int j = i; j >= 1; j--) {
                System.out.print(j + " ");
            }
            for (int j = 2; j <= i; j++) {
                System.out.print(j + " ");
            }

            System.out.println();
        }
    }
}
