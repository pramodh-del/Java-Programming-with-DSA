import java.util.Locale;

public class ValidPalindrome {
    public static void main(String[] args) {
       String s = "A man, a plan, a canal: Panam";
        System.out.println(validpalindorme(s));
    }
    static boolean validpalindorme(String s){
        String s1=s.toLowerCase();
        StringBuilder sc=new StringBuilder();
        for (int i = 0; i <s1.length(); i++) {
            char ch=s1.charAt(i);
            if (Character.isLetterOrDigit(ch)){
                sc.append(ch);
            }
        }
        String a=sc.toString();
        for (int i = 0; i <a.length() ; i++) {
            char ch=a.charAt(i);
            char ch1=a.charAt(a.length()-1-i);
            if (Character.toLowerCase(ch)!=Character.toLowerCase(ch1)){
                return false;
            }

        }
        return true;
    }
}
