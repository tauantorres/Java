package repita_do_while;
import java.util.Scanner;
public class Ex046 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int idade, qtd_idade = 0, mais_vinte_um = 0;
        float media, soma = 0;
        String resposta;
        do{
            System.out.print("Digite uma idade: ");
            idade = read.nextInt();
            qtd_idade++;
            soma += idade;
            if (idade >= 21){
                mais_vinte_um++;
            }
            System.out.print("Deseja continuar [S/N]? ");
            resposta = read.next();
        } while (resposta.equals("S"));
        media = soma/qtd_idade;
        System.out.printf("Foram digitadas %d idades.\n", qtd_idade);
        System.out.printf("A média entre as idades vale %.2f.\n", media);
        System.out.printf("Há %d pessoas com ou acima de 21 anos.\n", mais_vinte_um);
    }
}
