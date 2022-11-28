package para_for;
import java.util.Scanner;
public class Ex051 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.print("Digite um número: ");
        int numero = read.nextInt();
        System.out.println("================");
        System.out.printf("  TABUADA DO %d\n", numero);
        System.out.println("================");
        for (int i = 1; i <= 10; i++) {
            System.out.printf("%d x %d = %d\n", numero, i, numero*i);
        }
        System.out.println("================");
    }
}
