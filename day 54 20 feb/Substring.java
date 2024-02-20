import java.util.Arrays;

public class Substring {
    public static void main(String[] args) {
         String s = "GeeksForGeeks";
         String x="Fr";
        System.out.println(sub(s,x));
    }
    static int sub(String str,String str1){
        char[] charArray = str.toCharArray();
        char[] charArray1=str1.toCharArray();
        for (int i = 0; i <charArray.length ; i++) {
            for (int j = 0; j <charArray1.length ; j++) {
                if (charArray[i]==charArray1[j]){
                    return i;
                }
                else {
                    return -1;
                }
            }

        }
        str1.toUpperCase()
        return -1;
        Arrays.toString()
    }
}
