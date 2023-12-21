import java.util.Scanner;

public class ElectricityBill {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("input total volts used in home appliciances");
        float volt=sc.nextFloat();
        System.out.println("input total amps used in home appliciances");
        float amps=sc.nextFloat();
        float watts=volt*amps;
        System.out.println("enter the usage");
        int usage=sc.nextInt();
        float kilowatthours=(watts*usage)/1000;
        float electricityrate=6.15f;
        float cost=kilowatthours*electricityrate;
        System.out.println("the total cost of elecrity is "+cost+"rs");
    }
}
