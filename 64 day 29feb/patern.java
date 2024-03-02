public class patern {
    public static void main(String[] args) {
        pattern5new(5 );
    }
   static void pattern1(int n){
       for (int i =0; i <n ; i++) {
           for (int j = 0; j <n ; j++) {
               System.out.print("* ");
           }
           System.out.println();
       }
   }
   static void pattern2(int n){
       for (int i = 1; i <=n ; i++) {
           for (int j = 1; j <=i ; j++) {
               System.out.print("* ");
           }
           System.out.println();

       }
   }

   static void pattern3(int n){
       for (int i = 0; i <n ; i++) {
           for (int j = 0; j <n-i ; j++) {
               System.out.print("* ");
           }
           System.out.println();

       }
   }
   static void pattern4(int n){
       for (int i = 1; i <=n ; i++) {
           for (int j = 1; j <=i ; j++) {
               System.out.print(j+" ");
           }
           System.out.println();

       }
   }
  static void pattern5(int n){
      for (int i = 0; i < 2*n; i++) {
          int totalsols=i>n?2*n-i:i;
          for (int j = 0; j <totalsols ; j++) {
              System.out.print("* ");
          }
          System.out.println();
      }
  }
    static void pattern28(int n){
        for (int i = 0; i < 2*n; i++) {
            int totalsols=i>n?2*n-i:i;
            int spaces=n-totalsols;
            for (int s = 0; s <spaces ; s++) {
                System.out.print(" ");
            }
            for (int j = 0; j <totalsols ; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    static void pattern30(int n){
        for (int row = 1; row <=n ; row++) {
             for (int space=0;space<n-row;space++){
                 System.out.print("  ");
             }
            for (int j = row; j >=1 ; j--) {
                System.out.print(j+" ");
            }
            for (int j = 2; j <=row; j++) {
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
    static void pattern17(int n){

        for (int i = 1; i <2*n ; i++) {
            int totalcols=i>n?2*n-i:i;
            for (int spaces = 0; spaces<n-totalcols  ; spaces++) {
                System.out.print("  ");
            }
            for (int j = totalcols; j>=1; j--) {
                System.out.print(j+" ");
            }
            for (int j = 2; j <=totalcols ; j++) {
                System.out.print(j+" ");
            }
            System.out.println();

        }
    }
    static void pattern31(int n){
        int orginal=n;
        n=2*n;
        for (int i = 0; i <=n ; i++) {
            for (int j = 0; j <=n ; j++) {
                int evrryindex=orginal-Math.min(Math.min(i,j),Math.min(n-i,n-j));
                System.out.print(evrryindex);
            }
            System.out.println();

        }
    }
    static void pattern6(int n){
        for (int i = 0; i <=n ; i++) {
            int space=n-i;
            for (int j = 0; j <space ; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j <=i ; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    static void pattern8(int n){
        for (int i = 0; i <=n ; i++) {
            int space=n-i;
            for (int j = 0; j <space ; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j <=i ; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    static void pattern7(int n){
        for (int i = 0; i <=n ; i++) {
            for (int k = 0; k <i; k++) {
                System.out.print(" ");
            }
            for (int j = i; j <=n ; j++) {

                System.out.print("*");
            }
            System.out.println();

        }
    }static void pattern9(int n){
        for (int i = 0; i <=n ; i++) {
            for (int k = 0; k <i; k++) {
                System.out.print(" ");
            }
            for (int j = i; j <=n ; j++) {

                System.out.print("* ");
            }
            System.out.println();

        }
    }
    static void pattern10(int n){
        for (int i = 0; i <=n ; i++) {
            int spaces=n-i;
            for (int j = 0; j <=spaces ; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j <=i ; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    static void pattern11(int n){
        for (int i = 0; i <n ; i++) {

            for (int s = 0; s <i ; s++) {
                System.out.print(" ");
            }

            for (int j = 0; j <n-i; j++) {

                System.out.print("* ");
            }
            System.out.println();

        }
    }
    static void pattern12(int n) {

        // Loop for upper part
        for (int i = 0; i < n; i++) {
            for (int s = 0; s < i; s++) {
                System.out.print(" ");
            }
            for (int j = i; j <n ; j++) {
                System.out.print("* ");
            }
            System.out.println();

        }
        for (int i = n-1; i>=0; i--) {
            for (int s = 0; s <i ; s++) {
                System.out.print(" ");
            }
            for (int j = i; j <n ; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    static void pattern13(int n) {
        // Print upper triangle
        for (int i = 0; i < n - 1; i++) {
            // Print spaces
            for (int j = i; j < n - 1; j++) {
                System.out.print(" ");
            }
            // Print stars
            if (i == 0) {
                System.out.println("*");
            } else {
                System.out.print("*");
                // Print spaces inside triangle
                for (int k = 0; k < (2 * i - 1); k++) {
                    System.out.print(" ");
                }
                System.out.println("*");
            }
        }

        // Print base line
        for (int i = 0; i < (2 * n - 1); i++) {
            System.out.print("*");
        }
        System.out.println();
    }
    static void inversePattern(int n) {
        // Print upper triangle
        for (int i = n; i >= 1; i--) {
            // Print spaces
            for (int j = n; j > i; j--) {
                System.out.print(" ");
            }
            // Print stars
            for (int k = 1; k <= i * 2 - 1; k++) {
                if (k == 1 || k == i * 2 - 1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    static void pattern21(int n){
        int count=1;
        for (int i = 0; i <n ; i++) {
            for (int j = 0; j <=i ; j++) {
                System.out.print(count+" ");
                count++;
            }
            System.out.println();

        }
    }
 static void pattern5new(int m){
     for (int i = 0; i <2*m ; i++) {
         int totalcols=i>m?2*m-i:i;
         int spaces=m-totalcols;
         for (int s = 0; s <spaces ; s++) {
             System.out.print(" ");
         }
         for (int j = 0; j < totalcols; j++) {
             System.out.print("* ");
         }
         System.out.println();
     }
 }


}
