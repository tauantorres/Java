package enquanto_while;
import java.util.Scanner;
public class Ex038 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.print("Digite um valor: ");
        int fim = read.nextInt();
        int contador = 1;
        while (contador <= fim){
            System.out.printf("%d ", contador);
            contador += 1;
        }
        System.out.print("Acabou! ");
    }
}
