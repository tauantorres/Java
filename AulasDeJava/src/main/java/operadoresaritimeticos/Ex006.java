package operadoresaritimeticos;
import java.util.Scanner;
public class Ex006 {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        
        System.out.print("Raio = ");
        float raio = keyboard.nextFloat();
        double C = 2 * Math.PI *raio;
        System.out.printf("Comprimento da circunfencia: 2.pi.raio = %f", C);
    }
}
