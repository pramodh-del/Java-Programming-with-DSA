public class reversestring {
    public static void main(String[] args) {
        String str1="Geeks";
       StringBuilder str=new StringBuilder();
       for (char ch:str1.toCharArray()){
           str.append(ch);
       }
       str.reverse();
       String ans=str.toString();
        System.out.println(ans);
    }
}
