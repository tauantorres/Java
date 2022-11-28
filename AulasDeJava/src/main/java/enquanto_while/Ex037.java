package enquanto_while;
public class Ex037 {
    public static void main(String[] args) {
        int contador = 100;
        while (contador >= 0) {
            System.out.printf("%d ", contador);
            contador -= 5;
        }
        System.out.print("Acabou!");
    }
}
