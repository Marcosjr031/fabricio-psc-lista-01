import java.util.Scanner;

public class ex3 {
    public static void main (String[]args){
    Scanner input = new Scanner(System.in);
    String nome;
    System.out.println("Informe seu nome");
    nome = input.nextLine();
    System.out.println("Bom dia! " + nome);
    input.close();
    }
}