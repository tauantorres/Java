package estruturascondicionais;
import java.util.Scanner;
public class Ex025 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        
        System.out.print("Largura (m)= ");
        float L = read.nextFloat();
        System.out.print("Comprimento (m)= ");
        float C = read.nextFloat();
        float A = L * C;
        if(A < 100){
            System.out.println("TERRENO POPULAR!");
        } else {
            if(A >= 100 && A <= 500){
                System.out.println("TERRENO MASTER!");
            } else {
                System.out.println("TERRENO VIP!");
            }
        }
    }
}
