import java.util.Scanner;

public class Temp {
    public static void main(String[] args) {
        Scanner inputTemp = new Scanner(System.in);
        System.out.println("Enter Temperature in Celsius :");
        float tempC = inputTemp.nextFloat();
        float tempF = (tempC *9/5) + 32;
        System.out.println("Temperature in farenheit " + tempF );
    }
}
