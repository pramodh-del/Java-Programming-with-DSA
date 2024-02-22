public class checkString {
    public static void main(String[] args) {

    }
    static boolean check(String s){
        for (int i = 0; i <s.length() ; i++) {
            char ch=s.charAt(i);
            char ch1=s.charAt(i+1);
            if (ch!=ch1){
                return false;
            }

        }
        return true;
    }
}
