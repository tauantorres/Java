package estruturascondicionais;
import java.util.Scanner;
public class Ex019 {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("======================");
        System.out.println("   Ax² + Bx + C = 0   ");
        System.out.println("======================");
        System.out.print("A = ");
        double A = keyboard.nextDouble();
        System.out.print("B = ");
        double B = keyboard.nextDouble();
        System.out.print("C = ");
        double C = keyboard.nextDouble();
        
        double D = Math.pow(B, 2) -4*A*C;
        double x1 = (-B + Math.sqrt(D))/(2*A);
        double x2 = (-B - Math.sqrt(D))/(2*A);
        
        if (D < 0) {
            System.out.println("NÃO EXISTEM RAÍZES REIAS!\n");
        } else {
            System.out.printf("As raízes são x1 = %.2f e x2 = %.2f", x1, x2);
        }
    }
}
