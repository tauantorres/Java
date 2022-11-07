package operadoreslogicoseralacionais;
import java.util.Scanner;
public class Ex013 {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Em que ano voce nasceu? ");
        int ano = keyboard.nextInt();
        int idade = 2022 - ano; 
        System.out.printf("Voce tem %d anos.\n", idade);
        System.out.printf("Maior de idade? %s", idade > 18 ? "MAIOR":"FALSO");
    }
}
