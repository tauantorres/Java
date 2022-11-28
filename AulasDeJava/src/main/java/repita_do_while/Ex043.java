package repita_do_while;
import java.util.Scanner;
public class Ex043 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int numero, soma = 0;
        String resposta;
        do{
            System.out.print("Digite um número inteiro: ");
            numero = read.nextInt();
            soma += numero;
            System.out.print("Deseja continuar [S/N]? ");
            resposta = read.next();
        } while (resposta.equals("S"));
        System.out.printf("A soma de todos os números foi %d.", soma);
    }
}
