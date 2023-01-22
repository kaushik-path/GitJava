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
        Scanner input = new Scanner(System.in); //-- Input method through Keyboard
        // System.out.println(input.nextLine());

        int num = input.nextInt(); // input decleared 
        System.out.println(num); // output the input varible
        float makrs = input.nextFloat();
        System.out.println(marks);// output the input varible


    }
}
