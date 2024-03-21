package faculdade;
import java.util.Scanner;
/*- Escreva um programa que exiba os primeiros N números pares, onde N é fornecido pelo
usuário.
 */
public class ex2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       int [] vetor = new int[5];

        for(int i=0; i<5; i++){
            System.out.println("Digite um numero inteiro: ");
            vetor[i] = sc.nextInt();
        }
        for(int n : vetor){
            if(n % 2==0){
                System.out.println(n+ " É PARRRRR!!");
            }else{
                System.out.println(n+ " É IMPAR PORRA");
            }
        }
        sc.close();
    }
}
 