package vetores;
import java.util.Arrays;
public class T008 {
    public static void main(String[] args) {
        int vetor[] = new int[5];
        Arrays.fill(vetor, 1);
        for (int valor : vetor) {
            System.out.printf("%d ", valor);
        }
    }
}
