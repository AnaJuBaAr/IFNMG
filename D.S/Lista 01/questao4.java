import java.util.Scanner;

public class questao4 {
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);
        System.out.println("Informe a primeira nota:");
        double nota1 = teclado.nextDouble();
        System.out.println("Informe a segunda nota:");
        double nota2 = teclado.nextDouble();
        System.out.println("Informe a terceira nota");
        double nota3 = teclado.nextDouble();
        System.out.println("Informe a quarta nota");
        double nota4 = teclado.nextDouble();
        double media = (nota1+nota2+nota3+nota4)/4;
        System.out.println("A media do aluno eh "+media);
    }   
}
