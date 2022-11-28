package enquanto_while;
public class Ex032 {
    public static void main(String[] args) {
        int contador = 0;
        while (contador < 10){
            contador++;
            if (contador ==  4 || contador == 5){
                continue;
            }
            if (contador == 7){
                break;
            }
            System.out.printf("Contador = %d\n", contador);
       }
    }
}
