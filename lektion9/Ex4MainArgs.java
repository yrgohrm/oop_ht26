public class Ex4MainArgs {
    public static void main(String[] args) {

        if (args.length > 0 && args[0].equals("--help")) {
            System.out.println("Tyvärr finns ingen hjälp att få.");
        }

        for (String arg : args) {
            System.out.println(arg);
        }
    }        
}
