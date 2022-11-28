package enquanto_while;
public class Ex031 {
    public static void main(String[] args) {
        int contador = 0;
        while (contador < 10){
            contador ++;
            if (contador == 5 || contador == 4){
                continue;
            }
            System.out.printf("Contador = %d\n", contador);
        }
    }
}
