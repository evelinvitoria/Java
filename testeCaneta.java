package POO;

public class testeCaneta {
    public static void main(String[] args) {
        Caneta c1 = new Caneta();
        c1.cor = "Verde";
        c1.ponta = 0.5f;
       c1.destampar();
        c1.status();
        c1.rabiscar();

        Caneta c2 = new Caneta();
        c2.cor = "Vermelha";
        c2.ponta = 1.0f;
        c2.carga = 10;
        c2.tampar();
        c2.status();
        c2.rabiscar();
    }
    
}
