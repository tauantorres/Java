package operadoresaritimeticos;
import java.util.Scanner;

public class Ex003 {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Digite o primeiro numero: ");
        float N1 = keyboard.nextFloat();
        System.out.print("Digite o segundo numero: ");
        float N2 = keyboard.nextFloat();
        float M = (N1 + N2)/2;    
        System.out.printf("A sua media foi de %.2f", M);
    }
}