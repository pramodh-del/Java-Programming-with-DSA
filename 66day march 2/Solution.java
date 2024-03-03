import java.util.HashMap;
import java.util.Map;

public class Solution {

    public static void main(String[] args) {
        String word = "abcd";
        char ch = 'z';
        System.out.println(reversePrefix(word,ch));
    }
    static String reversePrefix(String word, char ch) {
        int start=0;
        int end=0;
        char[] arr=word.toCharArray();
        for (int i = 0; i <arr.length ; i++) {
            if (arr[i]==ch){
                end=i;
                break;
            }
        }
        while (start<end){
            char temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            start++;
            end--;
        }
        return new String(arr);
    }
}
