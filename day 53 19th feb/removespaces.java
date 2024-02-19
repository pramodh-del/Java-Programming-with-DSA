public class removespaces {
    public static void main(String[] args) {
          String s="geeks  for geeks";
          String ans=removespaces(s);
        System.out.println(ans);
    }
    static String removespaces(String str){
        StringBuilder sc=new StringBuilder();
        for(char c:str.toCharArray()){
            if (!Character.isWhitespace(c)){
                sc.append(c);
            }
        }
        String ans=sc.toString();
        return ans;
    }
}
