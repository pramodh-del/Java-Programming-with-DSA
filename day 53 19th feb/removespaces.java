public class removespaces {
    public static void main(String[] args) {
          String s="geeks  for geeks";
          String ans=removespaces(s);
        System.out.println(ans);
    }
    static String removespaces(String str){
        StringBuilder sc=new StringBuilder();
        for (char ch:str.toCharArray()){
            if (!Character.isWhitespace(ch)){
                sc.append(ch);
            }
        }
        String ans=sc.toString();
        return ans;
    }
}
