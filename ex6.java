import java.util.Scanner;

public class ex6 {
    public static void main (String[]args){
    Scanner scanner = new Scanner(System.in);
   
    int idade, dias;
    
    System.out.println("Informe a sua idade");
    idade = scanner.nextInt();

    dias = idade * 365; 

    System.out.println("Dias vividos são " + dias);
    
    }
}