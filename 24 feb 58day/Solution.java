import java.util.StringTokenizer;

class Solution {
    public static void main(String[] args) {

    }
    static String reverseWords(String s) {
        StringBuilder sc=new StringBuilder();
        for (int i = 0; i <s.length(); i++) {
            char ch=s.charAt(i);
            sc.append(ch);

        }
        sc.reverse();
        String a=sc.toString();
        int i=0;
        int r=0;
        int l=0;
        int n=a.length();
        String result="";
        while (i<n){
            char ch=s.charAt(i);
            char ch1=result.charAt(i);
            while (i<n&&ch!=' '){


            }
        }
        
    }

}