class Solution {
    public static void main(String[] args) {
        String word1 = "abc";
         String word2 = "def";
        System.out.println(mergeAlternately(word1,word2));

    }
    static String mergeAlternately(String word1, String word2) {
        StringBuilder sb = new StringBuilder();
        int index1 = 0;
        int index2 = 0;
        while (index1 < word1.length() || index2 < word2.length()) {
            if (index1 < word1.length()) {
                sb.append(word1.charAt(index1++));
            }
            if (index2 < word2.length()) {
                sb.append(word2.charAt(index2++));
            }
        }
        return sb.toString();
    }

}