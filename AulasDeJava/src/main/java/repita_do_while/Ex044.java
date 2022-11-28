package repita_do_while;
import java.util.Scanner;
public class Ex044 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int contador_numeros = 0, contador_pares = 0, contador_impares = 0, acima_de_cem = 0;
        float media, soma = 0;
        float numero;
        do{
            System.out.print("Digite um valor [0 to exit]: ");
            numero = read.nextFloat();
            soma += numero;
            
            if (numero != 0) {
                contador_numeros++;
            }
            
            if (numero % 2 == 0 && numero != 0){
                contador_pares++;
            } else {
                contador_impares++;
            }
            
            if (numero >= 100){
                acima_de_cem++;
            }
            
        } while (numero != 0);
        
        media = soma/contador_numeros;
        System.out.printf("O total de valores digitados foi: %d\n", contador_numeros);
        System.out.printf("O total de pares: %d\n", contador_pares);
        System.out.printf("O total de impares: %d\n", contador_impares);
        System.out.printf("Acima de 100: %d\n", acima_de_cem);
        System.out.printf("Média =  %.2f\n", media);
    }
}
