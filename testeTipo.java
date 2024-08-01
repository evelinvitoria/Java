package teste;

public class testeTipo {
    
    public static void main(String[] args) {
       /*  int idade = 30;
        String valor = idade;  */
        //converter int em str:
        int idade = 30;
        String valor = Integer.toString(idade);
        System.out.println(valor);
        // str para int
        String valor2 = "30";
        int idade2 = Integer.parseInt(valor2);
        System.out.println(idade2);
    }
}
