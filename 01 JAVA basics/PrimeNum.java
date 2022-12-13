import java.util.Scanner;

public class PrimeNum {
    public static void main(String[] args) {
        int num, c=2;
        Scanner sc = new Scanner(System.in);
        num = sc.nextInt();
        while (c<num) {
            if(num%c==0) {
                System.out.println("not Prime Num");
            }
            else {
                c =c+1;
                System.out.println("Prime Num");
            }
            break;
        }    
    }
}
