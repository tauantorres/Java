package repita_do_while;
import java.util.Scanner;
public class Ex047 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        String resposta;
        float soma = 0, menor = 120000, media;
        int qtd_pares = 0, contador = 0, numero;
        do{
            System.out.print("Digite um valor: ");
            numero = read.nextInt();
            soma += numero;
            contador++;
            if (contador == 0) {
                menor = numero;
            }
            if (contador != 0 && numero < menor){
                menor = numero;
            }
            if (numero % 2 == 0){
                qtd_pares++;
            }
            System.out.print("Deseja continuar [S/N]? ");
            resposta = read.next();   
        } while (resposta.equals("S"));
        media = soma/contador; 
        System.out.printf("Somatorio = %.2f\n", soma);
        System.out.printf("Menor valor = %.2f\n", menor);
        System.out.printf("Media = %.2f\n", media);
        System.out.printf("Há %d valores pares.\n", qtd_pares);
    }
}
