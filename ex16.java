import java.util.Scanner;

public class ex16 {
    public static void main (String[]args){
    Scanner scanner = new Scanner(System.in);
   
    double distancia, combustivel, media;
    
    System.out.println("Informe a distância em KM");
    distancia = scanner.nextDouble();

    System.out.println("Informe a quantidade de combustivel");
    combustivel = scanner.nextDouble();

    media = distancia / combustivel;

    System.out.println("O consumo médio é de: " + media);

    }

}
