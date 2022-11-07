package estruturascondicionais;
import java.util.Scanner;
public class Ex026 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        
        System.out.print("Nome do funcionario: ");
        String nome = read.nextLine();
        System.out.printf("Quanto %s recebe (R$)? ", nome);
        float salario = read.nextFloat();
        System.out.printf("Há quanto tempo %s trabalha na empresa? ", nome);
        int tempo = read.nextInt();
        
        if( tempo < 3){
            System.out.printf("Novo salário de %s: R$%.2f", nome, salario * 1.03);
        } else if (tempo >= 3 && tempo < 10){
            System.out.printf("Novo salário de %s: R$%.2f", nome, salario * 1.125);
        } else {
            System.out.printf("Novo salário de %s: R$%.2f", nome, salario * 1.2);
        }
    }
}
