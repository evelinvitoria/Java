package faculdade;
import java.util.Scanner;
/*5- Crie um programa que recebe um vetor de números inteiros e encontra o maior e o
menor valor presente no vetor. Em seguida, troque a posição desses valores no vetor e o
imprima antes e depois da troca. */
public class ex5 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[] vetor = new int[5];

        for( int i =1; i<5; i++){
            System.out.println("Digite um numeros inteiro:");
            vetor[i] = sc.nextInt();
        }
        for(int vetores : vetor){
            System.out.println(vetores);
        }
        
    }
    
}
