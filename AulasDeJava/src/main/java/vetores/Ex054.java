package vetores;
import java.util.Scanner;
public class Ex054 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        String mes[] = {"Janeiro","Fevereiro","Março","Abril","Maio",
            "Junho","Julho","Agosto","Setembro","Outubro","Novembro","Dezembro"};
        int dias[] = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        System.out.print("Digite um número: ");
        int numero = read.nextInt();
        System.out.printf("Esse valor representa o mês de %s.\n", mes[numero - 1]);
        System.out.printf("%s tem %d dias.",mes[numero - 1], dias[numero - 1]);
    }
}
