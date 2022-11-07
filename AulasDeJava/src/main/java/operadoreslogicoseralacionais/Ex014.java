package operadoreslogicoseralacionais;
import java.util.Scanner;
public class Ex014 {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Em que ano voce nasceu? ");
        int ano = keyboard.nextInt();
        int idade = 2022 - ano;
        boolean resposta = (idade >= 16 && idade < 18) || (idade > 70)? true:false;
        System.out.printf("Voce esta na faixa de voto opcional? %b", resposta);
    }
}
