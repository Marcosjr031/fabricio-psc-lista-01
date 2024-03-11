import java.util.Scanner;

public class ex10 {
    public static void main (String[]args){
    Scanner scanner = new Scanner(System.in);
   
    double celsius, fahrenheit;
    
    System.out.println("Informe a temperatura em Fahrenheit");
    fahrenheit = scanner.nextDouble();

    celsius = (fahrenheit - 32) * 5/9;

    System.out.println("A temperatua em Celsius é " + celsius);

    }

}