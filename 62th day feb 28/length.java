public class length {
    public static void main(String[] args) {
        String hello="        hello   bhai   ";
        System.out.println(lengthoflastword(hello));
    }
    static int lengthoflastword(String s){
        s=s.strip();
        int count=0;
        for (int i = s.length()-1; i>0; i--) {
            if (s.charAt(i)!=' '){
                count++;

            }
            else {
                break;
            }
        }
        return count;
    }
}
