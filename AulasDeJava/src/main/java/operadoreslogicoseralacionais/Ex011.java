package operadoreslogicoseralacionais;
import java.util.Scanner;
public class Ex011 {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.print("N1 = ");
        int N1 = keyboard.nextInt();
        System.out.print("N2 = ");
        int N2 = keyboard.nextInt();
        int maior = N1 > N2 ? N1:N2;
        System.out.printf("O maior valor é %d", maior);
    }
}
