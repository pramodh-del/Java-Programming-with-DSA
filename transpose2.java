import java.util.Scanner;

public class transpose2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int[][] old=new int[3][3];
        int[][] newa=new int[3][3];
        for (int i = 0; i < old.length ; i++) {
            for (int j = 0; j <old[i].length; j++) {
                old[i][j]= sc.nextInt();
            }

        }
        for (int i = 0; i < old.length ; i++) {
            for (int j = 0; j <old[i].length; j++) {
                newa[i][j]=old[j][i];
            }

        }
        for (int i = 0; i < newa.length ; i++) {
            for (int j = 0; j <newa[i].length; j++) {
                System.out.print(newa[i][j]+" ");
            }
            System.out.println();

        }
    }
}
