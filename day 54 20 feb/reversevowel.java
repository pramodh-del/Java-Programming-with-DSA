public class reversevowel {
    public static void main(String[] args) {
        String ans="geeksforgeeks";
        System.out.println(reversevowel(ans));
    }
    static String reversevowel(String str){
        StringBuilder sc=new StringBuilder();
        for (char ch:str.toCharArray()){
            if (ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'){
                sc.append(ch);
                sc.reverse();
            }
            sc.append(ch);
        }
        String ans=sc.toString();
        return ans;
    }
}
