import java.util.Scanner;

public class questao6 {
    public static void main(String[] args){
        Scanner teclado = new Scanner (System.in);
        System.out.println("Informe os metros: ");
        int metros = teclado.nextInt();
        double polegadas = metros * 39.3700787;
        System.out.println("A convercao transforma esses metros em "+polegadas+" polegadas");
    }  
}
