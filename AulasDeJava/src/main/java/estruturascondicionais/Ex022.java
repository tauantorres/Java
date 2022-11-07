package estruturascondicionais;
import java.io.PrintStream;
import java.util.Scanner;
public class Ex022 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.println("=============================");
        System.out.println("       CRIANÇA ESPERANÇA     ");
        System.out.println("=============================");
        System.out.println("Muito obrigado por ajudar:   ");
        System.out.println("[1] - para doar R$10,00;     ");
        System.out.println("[2] - para doar R$20,00;     ");
        System.out.println("[3] - para doar R$30,00;     ");
        System.out.println("[4] - Doar outros valores;   ");
        System.out.println("[5] - para cancelar.         ");
        System.out.println("=============================");
        System.out.print("Qual opção você deseja escolher? ");
        int escolha = read.nextInt();
        float valor;
        switch (escolha){
            case 1:
                valor = 10f;
                System.out.printf("Sua doação foi de  R$%.2f", valor);
                break;
            case 2:
                valor = 20f;
                System.out.printf("Sua doação foi de  R$%.2f", valor);
                break;
            case 3:
                valor = 30f;
                System.out.printf("Sua doação foi de  R$%.2f", valor);
                break;
            case 4:
                System.out.print("Qual valor você deseja doar? ");
                valor = read.nextFloat();
                System.out.printf("Sua doação foi de  R$%.2f", valor);
                break;
            case 5:
                System.out.println("Você cancelou a operação!\n");
                break;
        }
    }
}
