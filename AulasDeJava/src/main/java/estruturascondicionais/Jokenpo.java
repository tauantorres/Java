package estruturascondicionais;
import java.util.Scanner;
import java.util.Random;
public class Jokenpo {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        Random random = new Random();
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
        String nome_user = null;
        String nome_comp = null;
        
        switch (escolha){
            case 1:
                nome_user = "PEDRA";
                break;
            case 2:
                nome_user = "PAPEL";
                break;
            case 3:
                nome_user = "TESOURA";
                break;
        }
        
        switch (computador){
            case 1:
                nome_comp = "PEDRA";
                break;
            case 2:
                nome_comp = "PAPEL";
                break;
            case 3:
                nome_comp = "TESOURA";
                break;
        }
        
        System.out.println(nome_user);
        System.out.println(nome_comp);
    }
}
