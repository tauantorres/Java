package metodos;
public class Operacoes {   
    public static String contador(int inicio, int fim) {
        String s = "";
        for (int contador = inicio; contador <= fim; contador++ ){
            s += contador + " ";
        }
        return s;
    } 
}
