import java.util.Scanner;

public class questao11 {
    public static void main(String args []){
        Scanner teclado = new Scanner (System.in);
        System.out.println("Informe a quantidade de horas: ");
        int horas = teclado.nextInt();
        int segundos = horas * 3600;
        System.out.println("O equivalente em segundos é "+segundos);
    }
}
