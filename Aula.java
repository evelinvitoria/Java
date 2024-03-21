package POO;

public class Aula {
    String materia;
    String professor;
    Float tempo;
    int sala;

    void status(){
        System.out.println("Aula de "+this.materia);
        System.out.println("Professor: "+this.professor);
        System.out.println("Duração de aula: "+ this.tempo);
        System.out.println("Sala: "+this.sala);
    }
}
