package faculdade;
import java.util.Scanner;
/*1 - Crie um programa que solicite ao usuário um número inteiro e verifique se ele é positivo,
negativo ou zero. Imprima uma mensagem apropriada de acordo com a condição. */

public class ex1 {
    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um numero inteiro: ");
        int num = sc.nextInt();

        if ( num > 0){
            System.out.println("Seu numero é positivo! ");
        }else if(num == 0){
            System.out.println("Seu numero é zero!");
        }else if(num < 0){
            System.out.println("Seu numero é negativo!");
        }else{
            System.out.println("INVALIDO!!");
        }
    sc.close();
    }
    
}
