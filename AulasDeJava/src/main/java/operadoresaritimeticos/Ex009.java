package operadoresaritimeticos;
import java.util.Scanner;
public class Ex009 {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in); 
        System.out.print("Volume da esfera = ");
        double V = keyboard.nextDouble();
        double a = (double)1/3;
        double b = 3/(Math.PI * 4) ;
        double R = Math.pow(b * V, a);
        System.out.printf("Raio = %f", R);
    }
}