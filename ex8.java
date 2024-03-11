import java.util.Scanner;

public class ex8 {
    public static void main (String[]args){
    Scanner scanner = new Scanner(System.in);
   
    double metros, centimetros;
    
    System.out.println("Informe sua altura em metros");
    metros = scanner.nextDouble();

    centimetros = metros * 100;

    System.out.println("Sua altura em centímetros é " + centimetros);

    }

}