package enquanto_while;
import java.util.Scanner;
public class Ex040 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.print("Digite o primeiro valor: ");
        int inicio = read.nextInt();
        System.out.print("Digite o último valor: ");
        int fim = read.nextInt();
        System.out.print("Digite o incremento: ");
        int incremento = read.nextInt();
        
        while(inicio <= fim){
            System.out.printf("%d ", inicio);
            inicio += incremento;
        }
        System.out.print("Acabou!");
    }
}
