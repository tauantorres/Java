package estruturascondicionais;
import java.util.Scanner;
import java.util.Random;
public class Ex029 {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner read = new Scanner(System.in);
        System.out.println("=======================");
        System.out.println("       JoKenPo         ");
        System.out.println("=======================");
        System.out.println("[1] - PEDRA");
        System.out.println("[2] - PAPEL");
        System.out.println("[3] - TESOURA");
        System.out.println("=======================");
        System.out.print("Qual a sua jogada? ");
        int escolha = read.nextInt();
        int computador = 1 + random.nextInt(3);
        
        switch (escolha) {
            case 1:
                System.out.println("Você escolheu PEDRA!");
                break;
            case 2:
                System.out.println("Você escolheu PAPEL!");
                break;
            case 3:
                System.out.println("Você escolheu TESOURA!");
                break;
        }
        
        switch (computador) {
            case 1:
                System.out.println("O computador escolheu PEDRA!");
                break;
            case 2:
                System.out.println("O computador escolheu PAPEL!");
                break;
            case 3:
                System.out.println("O computador escolheu TESOURA!");
                break;
        }
        
        if (escolha == 1) {
            switch (computador) {
                case 1:
                    System.out.println("EMPATE!");
                    break;
                case 2:
                    System.out.println("PERDEU!");
                    break;
                default:
                    System.out.println("GANHOU!");
                    break;
            }
        }
        
        if (escolha == 2) { 
            switch (computador) {
                case 1:
                    System.out.println("GANHOU!");
                    break;
                case 2:
                    System.out.println("EMPATE!");
                    break;
                default:
                    System.out.println("PERDEU!");
                    break;
            }
        }
        
        if (escolha == 3) {
            switch (computador) {
                case 1:
                    System.out.println("PERDEU!");
                    break;
                case 2:
                    System.out.println("GANHOU!");
                    break;
                default:
                    System.out.println("EMPATE!");
                    break;
            }
        }
        
    }
}
