package POO;

public class produto {
    private String nome;
    private double preco;

    public void produto(String n, double p){
        this.nome = n;
        this.preco = p;
    }

    public void aumentarPreco(double vl){
        if(this.preco > 0){
            this.setPreco(getPreco()+ vl);
            System.out.println("Preço atual: "+ getPreco()+vl);
        }else{
            System.out.println("Valor insuficiente");
        }

    }
    public void diminuirPreco(double mvl){
    
        if( mvl > 0 && this.preco > 0){
            this.setPreco(getPreco()-mvl);
            System.out.println("Valor atual depois do desconto: "+ getPreco());
        }else{
            System.out.println("valor insuficiente");
        }

    }
    public String getNome(){
        return nome;
    }
    public double getPreco(){
        return preco;
    }
    public void setNome(String nome){
        this.nome = nome;
    }
    public void setPreco(double preco){
        this.preco = preco;
    }
}