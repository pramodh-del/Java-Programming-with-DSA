class Solution {
    public static void main(String[] args) {
       String s = "A man, a plan, a canal: Panama";
        System.out.println(isPalindrome(s));
    }
    static boolean isPalindrome(String s) {
        StringBuilder sb=new StringBuilder();
        for (int i = 0; i <s.length() ; i++) {
            char ch=s.charAt(i);
            if (Character.isLetterOrDigit(ch)){
                sb.append(ch);
            }
        }
        String a=sb.toString();
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
