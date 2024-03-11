import java.util.Scanner;

public class ex11 {
    public static void main (String[]args){
    Scanner scanner = new Scanner(System.in);
   
    double nota1, nota2, nota3, media;
    
    System.out.println("Informe a primeira nota");
    nota1 = scanner.nextDouble();

    System.out.println("Informe a segunda nota");
    nota2 = scanner.nextDouble();

    System.out.println("Informe a terceira nota");
    nota3 = scanner.nextDouble();

    media = (nota1 + nota2 + nota3) / 3;

    System.out.println("A media das notas são " + media);

    }

}