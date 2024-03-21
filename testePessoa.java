package POO;

public class testePessoa {
    public static void main(String[] args) {
        Pessoa estudante = new Pessoa();
        estudante.nome = "Evelin";
        estudante.idade = 20;
        estudante.sexo = 'F';

        System.out.println(estudante.nome);
        System.out.println(estudante.idade);
        System.out.println(estudante.sexo);
        System.out.println(estudante);

    }

    
}
