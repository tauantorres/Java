package operadoresaritimeticos;
import java.util.Scanner;
public class Ex007 {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Cateto 1 = ");
        double C1 = keyboard.nextFloat();
        System.out.print("Cateto 2 = ");
        double C2 = keyboard.nextFloat();
        double H = Math.sqrt(Math.pow(C1, 2) + Math.pow(C2, 2));
        System.out.printf("Hipotenusa = %.0f", H);
    }
}
