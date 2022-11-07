package estruturascondicionais;
import java.util.Scanner;
public class Ex023 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        
        System.out.print("N1 (inteiro): ");
        int N1 = read.nextInt();
        System.out.print("N2 (inteiro): ");
        int N2 = read.nextInt();
        
        if(N1 > N2){
            System.out.printf("%d é maior que %d!", N1, N2);
        } else if (N1 < N2) {
            System.out.printf("%d é maior que %d!", N2, N1);
        } else {
            System.out.printf("%d é igual a %d!", N1, N2);
        }
    }
}
