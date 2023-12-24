import java.util.Scanner;

public class Marklist {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a= sc.nextInt();
        int ans=Gradesheet(a);
        System.out.println(ans);

    }
    static int Gradesheet(int a){

            if (a<=40)
            {
                System.out.println("fail");
                return a;
            }
            if (a>=41||a<=50) {
                System.out.println("DD");
                return a;
            }
            if (a>=51||a<=60)
            {
                System.out.println("CD");
                return a;
            }
            if (a<=61||a>=70) {
                System.out.println("BC");
                return a;
            }
            if (a<=71||a>=80) {
                System.out.println("BB");
                return a;
            }
            if (a<=81||a>=90) {
                System.out.println("AB");
                return a;
            }
            if (a<=91||a>=100) {
                System.out.println("AA");
                return a;
            }
            return 0;
        }


    }

