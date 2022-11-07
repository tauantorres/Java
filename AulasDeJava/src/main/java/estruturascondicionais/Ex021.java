package estruturascondicionais;
import java.util.Scanner;
public class Ex021 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.print("Qual a quantidade de produtos em estoque? ");
        int produtos = read.nextInt();
        
        if(produtos >= 100){
            System.out.println("Produtos em quantidade suficiente!\n");
        } else if (produtos < 100 && produtos >= 50) {
            System.out.println("ALERTA: Avaliar a possibilidade de novo pedido!\n");
        } else {
            System.out.println("ATENÇÃO! Faça um novo pedido!\n");
        }
    }
}

