import java.util.ArrayList;
import java.util.Arrays;

public class alphabets {
    public static void main(String[] args) {
        String str=" ";
        for (int i = 0; i <26; i++) {
            char str3=(char)('a'+i);
            System.out.print(str3);

        }
        System.out.println(str);
        StringBuilder builder=new StringBuilder();
        for (int i = 0; i <26 ; i++) {
            char ch=(char)('a'+i);
            builder.append(ch);
        }
        System.out.println(builder);
        //pretty printing
        float num=3.2784674f;
        String num3="fgjhjghg";

        System.out.printf("%.2f",num);
        System.out.println();
        System.out.printf("hello my name is %s and i am %s","pramodh","student");
        System.out.println();
        System.out.println("a"+"b");
        System.out.println('c'+4);
        System.out.println("c"+8);
        String name="pramodh";
        System.out.println(name.lastIndexOf(name));

    }
}
