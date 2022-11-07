package estruturascondicionais;
import java.util.Scanner;
public class Ex017 {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Em que ano voce nasceu? ");
        int ano = keyboard.nextInt();
        int idade = 2022 - ano;
        System.out.printf("Sua idade é %d anos!\n", idade);
        if(idade >= 18){
            System.out.println("MAIOR DE IDADE!");
        } else {
            System.out.println("MENOR DE IDADE!");
        }   
    }  
}
