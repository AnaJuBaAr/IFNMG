import java.util.Scanner;

public class questao1 {
    public static void main (String args[]){
     Scanner teclado = new Scanner(System.in);
     System.out.println("Informe o primeiro número: ");
        int numero1 = teclado.nextInt();
        System.out.println("Informe o segundo número: ");
        int numero2 = teclado.nextInt();
        int soma = numero1 + numero2;
        System.out.println("A soma dos valores é igual a "+soma);
    }
}
