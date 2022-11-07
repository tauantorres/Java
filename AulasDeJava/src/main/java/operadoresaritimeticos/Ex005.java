package operadoresaritimeticos;
import java.util.Scanner;
public class Ex005 {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.print("N1 = ");
        float N1 = keyboard.nextFloat();
        System.out.print("N2 = ");
        float N2 = keyboard.nextFloat();
        N1 += N2;
        System.out.printf("N1 += N2 -> N1 = %.0f\n", N1);
    }
}
