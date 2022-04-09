package robo;

public class UsaRobo {
    public static void main(String[] args) {
        Robo robo = new Robo(); //Cirando o Robo
        robo.setDirecao(Direcao.O); //Definindo qual direção ele vai andar, dentro dos parâmetros

        //Ver direção atual do robo
        System.out.println("Direção Atual: "+ robo.getDirecao());
    }
}
