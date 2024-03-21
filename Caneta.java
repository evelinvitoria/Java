package POO;

public class Caneta {
    String modelo;
    String cor;
    float ponta;
    int carga;
    boolean tampada;

    void status(){
        System.out.println("Uma caneta "+ this.cor);
        System.out.println("Esta tampada? "+ this.tampada);
        System.out.println("Qual a ponta da caneta? "+ this.ponta);
        System.out.println("Carga: "+ this.carga);
    }

    void rabiscar(){
        if (this.tampada == true){
            System.out.println("ERRO! Não posso rabiscar.");
        }else{
            System.out.println("Estou rabiscando!");
        }

    }
    void tampar(){
        this.tampada = true;
    }
    void destampar(){
        this.tampada = false;
    }
}
