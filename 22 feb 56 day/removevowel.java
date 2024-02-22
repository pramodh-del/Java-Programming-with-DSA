public class removevowel {
    public static void main(String[] args) {
           String ans="welcome to geeksforgeeks";
        System.out.println(vowel(ans));
    }
    static String vowel(String S){
        StringBuilder ans=new StringBuilder();
        for (int i = 0; i <S.length() ; i++) {
            char ch=S.charAt(i);
            if (ch!='a'||ch!='e'||ch!='i'||ch=='o'||ch=='u'){
                ans.append(ch);
            }
        }
        return ans.toString();
    }
}
