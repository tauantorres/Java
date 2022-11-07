package estruturascondicionais;
import java.util.Scanner;
public class Ex018 {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Digite um numero: ");
        int N = keyboard.nextInt();
        
        if(N % 2 == 0){
            System.out.println("PAR");
        } else {
            System.out.println("IMPAR");
        }
    }
}
