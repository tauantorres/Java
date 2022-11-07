package tiposprimitivos;

import java.util.Scanner;
public class Ex001 {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        
        System.out.print("Digite o nome do aluno: ");
        String nome = keyboard.nextLine();
        
        System.out.print("Digite a nota do aluno: ");
        float nota = keyboard.nextFloat();
        
        System.out.printf("A nota do %s é %.2f", nome, nota);       
    }
}
