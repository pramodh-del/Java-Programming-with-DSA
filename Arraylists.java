import java.util.ArrayList;
import java.util.Scanner;

public class Arraylists<I extends Number> {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        ArrayList<Integer> num=new ArrayList<>(5);
        for (int i = 0; i <5 ; i++) {
            num.add(sc.nextInt());

        }
        System.out.println(num);

    }
}
