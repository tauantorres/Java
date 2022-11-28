package vetores;
import java.util.Arrays;
public class T006 {
    public static void main(String[] args) {
        int vetor[] = {3, 7, 2, 8, 5};
        System.out.print("Antes: ");
        for(int valor: vetor){
            System.out.printf("%d ", valor);
        }
        Arrays.sort(vetor);
        System.out.print("\nDepois: ");
        for(int valor: vetor){
            System.out.printf("%d ", valor);
        }
    }
}
