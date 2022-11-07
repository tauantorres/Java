package operadoreslogicoseralacionais;
import java.util.Scanner;
public class Ex015 {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        double n = 1 + Math.random()*(6-1);
        int computador = (int)n;
        String resposta1 = "ACERTOU!";
        String resposta2 = "ERROU! Eu pensei em " + computador;
        System.out.print("Qual o seu o palpite? ");
        int user = keyboard.nextInt();
        System.out.println(user == computador? resposta1 : resposta2);
    }
}
