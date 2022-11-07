package estruturascondicionais;
import java.util.Scanner;
public class Ex016 {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.print("N1 = ");
        float N1 = keyboard.nextFloat();
        System.out.print("N2 = ");
        float N2 = keyboard.nextFloat();
        float M = (N1 + N2)/2;
        
        if (M >= 9 ){
            System.out.println("PARABENS!");
            System.out.printf("Sua media foi de %.2f", M);
        }
    }
}
