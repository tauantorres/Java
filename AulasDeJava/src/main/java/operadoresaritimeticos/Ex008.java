package operadoresaritimeticos;
import java.util.Scanner;
public class Ex008 {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Cateto 1 = ");
        double C1 = keyboard.nextDouble();
        System.out.print("Hipotenusa = ");
        double H = keyboard.nextDouble();
        double C2 = Math.sqrt(Math.pow(H, 2) - Math.pow(C1, 2));
        System.out.printf("Cateto 2 = %.0f", C2);   
    }
}
