package estruturascondicionais;
import java.util.Scanner;
public class Ex020 {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Em que ano você nasceu? ");
        int ano = keyboard.nextInt();
        int idade = 2022 - ano;
        System.out.printf("Você tem %d anos.\n", idade);
        if(idade < 16){
            System.out.println("Você ainda NÃO vota!");
        } else {
            if(idade > 18 && idade < 70){
                System.out.println("voto OBRIGATÓRIO!");
            } else {
                System.out.println("voto OPCIONAL!");
            }
        }
    }
}
