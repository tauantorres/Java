package operadoresaritimeticos;
import java.util.Scanner;
public class Ex010 {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Qual temperatura em Fahrenheit? ");
        double F = keyboard.nextDouble();
        double C = (F - 32) * (5/9.0);
        System.out.printf("%.2f °F = %.2f °C", F, C);
    }
}
