package vetores;
import java.util.Arrays;
public class T007 {
    public static void main(String[] args) {
        int vetor[] = {3, 4, 8, 1, 2, 9, 7};
        System.out.print("Antes:");
        for(int valor : vetor){
            System.out.printf("%d ",valor);
        }
        Arrays.sort(vetor);
        System.out.print("\nDepois:");
        for(int valor : vetor){
            System.out.printf("%d ",valor);
        }
        int posicao = Arrays.binarySearch(vetor, 2);
        System.out.printf("\nEncontramos o valor na posição %d.", posicao);
    }
}
