package teste;

public class maingato {
public static void main(String[] args) {
    gato gato1 = new gato();
    gato1.nome = "phoebe";
    gato1.idade = 1;

    System.out.println("nome:"+gato1.nome+ " idade: "+gato1.idade);
    gato1.sound();
    gato1.eat();
}
    
}