package robo2;

//Em robô 2, mudamos a forma que definimos a direção em que o robô anda.
//Definimos isso com base nos índices de "Direcao", pois ele pode ser acessado como um "array"
import java.util.Scanner;

public class UsaRobo {
    public static void main(String[] args) {
        Robo robo = new Robo(); //Cirando o Robo
        
        //Definindo qual direção ele vai andar, dentro dos parâmetros
        Scanner teclado = new Scanner(System.in);

            //menu improvisado
        System.out.println(" 0 - Norte\n 1 - Sul\n 2 - Leste\n 3 - Oeste");
        System.out.println("Digite a direção do Robô: ");
        robo.setDirecao(teclado.nextInt()); 

        teclado.close();

        //Ver direção atual do robo
        System.out.println("\nDireção Atual: "+ robo.getDirecao());
    }
}
