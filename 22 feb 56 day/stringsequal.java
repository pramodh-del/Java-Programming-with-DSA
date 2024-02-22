import java.util.Arrays;

public class stringsequal {
    public static void main(String[] args) {
       String[] word={"ab", "c"};
       String[] word1={"a", "bc"};
       Boolean ans=arrayStringsAreEqual(word,word1);
        System.out.println(ans);
    }
    static boolean arrayStringsAreEqual(String[] word1,String[] word2) {
        String sc= "";
        for(int i=0;i<word1.length;i++){
            sc+=word1[i];
        }
        String sc1="";
        for (int i = 0; i <word2.length; i++) {
           sc1+=word2[i];
        }
        return sc.equals(sc1);
    }
}
