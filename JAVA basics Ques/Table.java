import java.util.Scanner;

public class Table {
    public static void main(String[] args) {
        Scanner inputNum = new Scanner(System.in);
        System.out.println("Enter NUM for your Table");
        int num = inputNum.nextInt();
        for (int i = 1; i < 11; i++) {
            System.out.println( num + " X " + i + "  = " + num*i);
        }
    }
}
