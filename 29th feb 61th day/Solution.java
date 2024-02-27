class Solution {
    public static void main(String[] args) {
       String a= "ababc";
       String b="ba";
        System.out.println(maxRepeating(a,b));
    }
    static int maxRepeating(String a, String b) {
        int count=0;
        String sb="";
        if (a.contains(b)){
            count++;
            sb+=b;
            sb+=b;
        }
        else{
            return 0;
        }
        if (a.contains(sb)){
            count++;
        }
        return count;
        a.startsWith()
    }
}