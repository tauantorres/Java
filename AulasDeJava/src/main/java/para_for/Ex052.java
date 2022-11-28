package para_for;
import java.util.Scanner;
public class Ex052 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);  
        System.out.print("Início: ");
        int inicio = read.nextInt();
        System.out.print("Fim: ");
        int fim = read.nextInt();
        System.out.print("Passo: ");
        int passo = read.nextInt();
        for (int i = inicio; i <= fim; i += passo) {
            System.out.printf("%d ", i);
        }
        System.out.print("Acabou!");
    }
}
