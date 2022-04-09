package projeto;

public class UsaCarro {
    public static void main(String[] args) {
        Carro carro = new Carro();
        Carro carro2 = new Carro();

        //Definindo as características do meu objeto, no caso, o carro.
        carro.modelo = "Fox";
        carro.cor = "Preta";
        carro.ano = 2014;
        carro.marca = "VW";
        carro.preco = 2000000;

        //Carro sonho
        carro2.modelo = "Fusca";
        carro2.cor = "Abóbora";
        carro2.ano = 1960;
        carro2.marca = "VW";
        carro2.preco = 23456;

        //Utilizando os métodos de classe, exemplo
        System.out.println("Preço do carro2 = " + carro2.preco);
        
        double precoDesconto = carro2.realizarDesconto();
        System.out.println("Preço do carro2 com desconto = " + precoDesconto);

        carro2.andar(Acoes.AVANÇAR);

        carro.transportar(54);
    }
}
