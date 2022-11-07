package operadoreslogicoseralacionais;
public class comparandostrings {
    public static void main(String[] args) {
        String nome1 = "Tauan";
        String nome2 = "Tauan";
        String nome3 = new String("Tauan");
        String resultado1;
        String resultado2;
        String resultado3;
        resultado1 = (nome1 == nome2) ? "IGUAL":"DIFENTE";
        System.out.println(resultado1);
        resultado2 = (nome1 == nome3) ? "IGUAL":"DIFENTE";
        System.out.println(resultado2);
        resultado3 = (nome1.equals(nome3)) ? "IGUAL":"DIFENTE";
        System.out.println(resultado3);
    }
}
