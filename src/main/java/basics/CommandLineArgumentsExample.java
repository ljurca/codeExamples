package basics;

/** Specify command line arguments in the IntelliJ menu first:
 *  Run/Edit Configurations/Program Arguments */
public class CommandLineArgumentsExample {
    public static void main(String[] args) {
        if (args.length < 2) {
            System.out.println("Not enough arguments");
            return;
        }
        // Remember to parse ints when needed
        int x = Integer.parseInt(args[0]);
        int y = Integer.parseInt(args[1]);
        int sum = x + y;

        System.out.println("Average of the first two command line arguments");

        System.out.println(sum / 2.0);




    }
}
