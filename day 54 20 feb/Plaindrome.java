public class Plaindrome {
    public static void main(String[] args) {
         String str="aba";
        System.out.println(palindrome(str));
    }
    static Boolean palindrome(String str){
        int start=0;
        int end=str.length()-1;
        while (start<=end){
            char start1=str.charAt(start);
            char end1=str.charAt(end);
            if (start1!=end1){
                return false;
            }
            start++;
            end--;
        }
        return true;
    }
}

