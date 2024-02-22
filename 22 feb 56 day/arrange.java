public class arrange {
    public static void main(String[] args) {
           String command = "G()(al)";
        System.out.println(interpret(command));
    }
    static String interpret(String command) {
        return command.replace("()", "o").replace("(al)", "al");
    }
}
