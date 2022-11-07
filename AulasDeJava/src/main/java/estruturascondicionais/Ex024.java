package estruturascondicionais;
import java.util.Scanner;
public class Ex024 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        
        System.out.print("Primeira nota: ");
        float N1 = read.nextFloat();
        System.out.print("Segunda nota: ");
        float N2 = read.nextFloat();
        float M = (N1 + N2)/2;
        System.out.printf("A média do aluno é %.2f!\n", M);
       
        if (M < 5){
            System.out.println("REPROVADO!");
        } else {
            if (M >= 5 && M < 7){
                System.out.println("RECUPERACAO!");
            } else {
                System.out.println("APROVADO!");
            }
        }
    }
}

