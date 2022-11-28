package enquanto_while;
import java.util.Scanner;
public class Ex033 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.print("Digite um valor: ");
        int numero = read.nextInt();
        int fatorial = numero;
        int produto = 1;
        while (fatorial != 1){
            produto = produto * fatorial;
            fatorial--;
        }     
        System.out.printf("%d! = %d", numero, produto);
    }
}
