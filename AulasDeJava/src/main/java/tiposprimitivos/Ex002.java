package tiposprimitivos;

public class Ex002 {
    public static void main(String[] args) {
       
       int numero = 42;
       String valor = Integer.toString(numero);
       System.out.printf("%s\n", valor);
       
       String valor2 = "42";
       int numero2 = Integer.parseInt(valor2);
       System.out.println(numero2);
        
       String valor3 = "42.1";
       float numero3 = Float.parseFloat(valor3);
       System.out.println(valor3);
    }   
}
