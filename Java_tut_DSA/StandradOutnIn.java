import java.util.Scanner;

public class StandradOutnIn {
    public static void main(String[] args) {
        System.out.print("Standard Output and Input system");
        System.out.println("Standard Output and Input system");
        /*
        System: 
        out:
        print: print the output only
        println: print the output in next line
        */
        Scanner input = new Scanner(System.in);
        System.out.println(input.nextLine());

    }
}
