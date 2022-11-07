package operadoresaritimeticos;
import java.util.Scanner;
public class Ex004 {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
  
        System.out.print("Digite um valor inteiro: ");
        int valor1 = keyboard.nextInt();
        System.out.print("Digite outro valor: ");
        int valor2 = keyboard.nextInt();
        
        int N;
        N = valor1 + valor2++;
        System.out.printf("Resposta 1 = %d\n", N);
        System.out.printf("valor1 = %d\n",valor1);
        System.out.printf("valor2 = %d\n", valor2);
        
        N = 0;
        N = valor1 + ++valor2;
        System.out.printf("Resposta 2 = %d\n", N);
        System.out.printf("valor1 = %d\n",valor1);
        System.out.printf("valor2 = %d\n", valor2);
    }
}
