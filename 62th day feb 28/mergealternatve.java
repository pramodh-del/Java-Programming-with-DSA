public class mergealternatve {
    public static void main(String[] args) {
        String sb="abc";
        String sh="def";
        System.out.println(altermnatve(sb,sh));
    }
    static String altermnatve(String word,String word2){
        int index=0;
        int index1=0;
        StringBuilder sb=new StringBuilder();
        while (index<word.length() || index1<word2.length()){
            if (index<word.length()){
                sb.append(word.charAt(index++));
            }if (index1<word2.length()){
                sb.append(word2.charAt(index1++));
            }
        }
        return sb.toString();
    }
}
