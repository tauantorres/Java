package vetores;
import java.util.Arrays;
import java.util.Scanner;
public class T009 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int vetor[] = new int[4];
        for (int i = 0; i < vetor.length; i++) {
            System.out.printf("v[%d] = ", i);
            vetor[i] = read.nextInt();
        }
        System.out.println("===========");
        System.out.println("   VETOR   ");
        System.out.println("===========");
        for(int i = 0; i < vetor.length; i++){
            System.out.printf("%d ", vetor[i]);
            if (i % 2 != 0){
                System.out.println("\n");
            }
        }
    }
}
