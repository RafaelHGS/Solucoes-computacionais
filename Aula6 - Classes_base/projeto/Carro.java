package projeto;

//Fábrica de instâncias (objetos)
public class Carro {
    //Atributos de Classe, ou seja, as caracteristícas da classe, as variáveis da classe.
    String modelo, marca, cor;
    double preco;
    int ano;
    int passageiros;

    //Métodos de Classe, ou seja, as ações (funções) dentro da classe, "O que o objeto vai fazer".

    public void andar(Acoes direcao){
        System.out.println("Carro em movimento: "+ direcao);
    }

    public double realizarDesconto(){
        return this.preco - this.preco*0.1; // Ou "return this.preco*0.9"
    }

    public void transportar(int passageiros){
        if (passageiros <= 4){
            this.passageiros = passageiros;
        }
        else{
            System.out.println("Número de passageiros inválido");   
        }
    }

}
