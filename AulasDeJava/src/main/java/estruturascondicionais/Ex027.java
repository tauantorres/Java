package estruturascondicionais;
import java.util.Scanner;
public class Ex027 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.print("L1 = ");
        float L1 = read.nextFloat();
        System.out.print("L2 = ");
        float L2 = read.nextFloat();        
        System.out.print("L3 = ");
        float L3 = read.nextFloat();

        boolean V1 = (L1 < L2 + L3);
        boolean V2 = (L2 < L1 + L3);
        boolean V3 = (L3 < L1 + L2);
        
        if (V1 && V2 && V3){
            System.out.print("L1, L2 e L3 conseguem gerar um triângulo!");
        } else {
            System.out.println("L1, L2 e L3 NÃO geram um triângulo!");
        }
    }
}

