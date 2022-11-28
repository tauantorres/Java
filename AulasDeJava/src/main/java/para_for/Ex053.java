package para_for;
import java.util.Scanner;
public class Ex053 {
    public static void main(String[] args) {
        for (int i = 1; i <=2; i++) {
            for (int j = 1; j <= 3; j++) {
                System.out.printf("[%d][%d] ", i, j);
            }
            System.out.println("");
        }
    }
}
