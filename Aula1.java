package teste;

public class Aula1 {
    public int a;

    // Construtor
    public Aula1(int a) {
        this.a = a;
    }

    public int qualquer(int z, int k) {
        if (z == k || z == 0) {
            return 1;
        } else {
            return qualquer(z - 1, k) + qualquer(z - 1, k - 1);
        }
    }

    public static void main(String[] args) {
        // Criando uma instância da classe Aula1
        Aula1 objeto = new Aula1(4);

        // Chamando o método qualquer para teste
        int resultado = objeto.qualquer(4, 4-1);
        System.out.println("Resultado: " + resultado);
    }
}