import java.util.Scanner;

public class SumofDigits {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        for(int i=0;i<n;i++){
            int a = scan.nextInt();
            int sum = 0 ;
            while(a>0){
            int temp = a%10;
            sum +=temp;
            a/=10;
            }
            System.out.println(sum);
        }
    }
}
