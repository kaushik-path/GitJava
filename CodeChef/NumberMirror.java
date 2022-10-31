import java.util.Scanner;

/**
 * NumberMirror
 */
public class NumberMirror {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        if ((n>0)&&(n<10000)) {
            System.out.println(n);
        }
    }    
}