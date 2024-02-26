public class solution {
    public static void main(String[] args) {
         String[] names = { "Geek", "Geeks", "Geeksfor", "GeeksforGeek", "GeeksforGeeks" };
        System.out.println(longest(names.length,names));
    }

    static String longest(int n, String[] names) {
        // code here
        String Long_name = names[0];
        for (int i = 1; i < names.length; i++) {
            if (names[i].length()>Long_name.length()){
                Long_name=names[i];
            }
        }
        return Long_name;
    }
}
