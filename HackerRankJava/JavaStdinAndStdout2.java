import java.util.Scanner;

public class JavaStdinAndStdout2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int i = scan.nextInt();
        double d = scan.nextDouble();
        String write = scan.nextLine();  
        if (write.isEmpty()) {
            write= scan.nextLine();
        } 
        // Write your code here.
        System.out.println("String: " + write);
        System.out.println("Double: " + d);
        System.out.println("Int: " + i);
    }
}
