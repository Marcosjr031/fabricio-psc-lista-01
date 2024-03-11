import java.util.Scanner;

public class ex18 {
    public static void main (String[]args){
    Scanner scanner = new Scanner(System.in);
   
    double alturaDegrau, alturaDesejada, qtdDegraus;
    
    System.out.println("Insira a altura do degrau");
    alturaDegrau = scanner.nextDouble();

    System.out.println("Insira a altura desejada");
    alturaDesejada = scanner.nextDouble();

    qtdDegraus = alturaDegrau * alturaDesejada;

    System.out.println("A quantidade de graus que irá precisar subir é de: " + qtdDegraus);

    }

}
