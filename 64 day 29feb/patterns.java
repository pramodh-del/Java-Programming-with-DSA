public class patterns {

    public static void main(String[] args) {
        pattern1(5);
    }
    static void pattern(int n){
        for (int i = 0; i <2*n ; i++) {
            int index=i>n?2*n-i:i;
            for (int s = 0; s < index; s++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
     static void pattern1(int n){
         for (int i = 0; i <2*n ; i++) {
             int index=i>n?2*n-i:i;
             int space=n-index;
             for (int j = 0; j < space; j++) {
                 System.out.print(" ");
             }
             for (int j = 0; j < index; j++) {
                 System.out.print("* ");
             }
             System.out.println();
         }
     }static void pattern2(int n){
         for (int i = 0; i <2*n ; i++) {
             int index=i>n?2*n-i:i;
             int spaces=n-index;
             for (int j = 0; j <spaces ; j++) {
                 System.out.print(" ");
             }
             for (int j = index; j >=1 ; j--) {
                 System.out.print(j);
             }
             for (int j = 2; j <= index; j++) {
                 System.out.print(j);
             }
             System.out.println();
         }
     }
}
