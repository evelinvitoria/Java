package faculdade;
import java.util.Scanner;
/*Desenvolva um programa que simule um jogo de adivinhação. Escolha um número
aleatório entre 1 e 100 e permita que o usuário faça palpites. Forneça dicas como "maior"
ou "menor" até que o usuário adivinhe corretamente. */

public class ex4 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num = 35;
        int advi;
       
       do { System.out.println("Advinhe um número inteiro entre 1 e 100: ");
             advi = sc.nextInt();
        if( advi > num){
            System.out.println("MENOR");
        }else if( advi < num){
            System.out.println("MAIOR");
        }else if (advi == num){
            System.out.println("NUMERO CERTO!!!!");
        }
        
    }while( advi != num);
    sc.close();
    }
}
