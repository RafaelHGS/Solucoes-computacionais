package robo3XY;

//Em RoboXY ao invés de usarmos o "Direcao", usamos variável do tipo "char" em sua resolução, variável que aceita apenas um (1) caractere por vez
import java.util.Scanner;

public class UsaRobo {
    public static void main(String[] args) {
        RoboChar robo = new RoboChar(); //Cirando o Robo
        
        //Definindo qual direção ele vai andar
        Scanner teclado = new Scanner(System.in);


        while(true){  //Implementando "Deseja continuar ?"
                //menu improvisado
            System.out.println(" 0 - Norte\n 1 - Sul\n 2 - Leste\n 3 - Oeste");
            System.out.println("Digite a direção do Robô: ");
            robo.setDirecao(teclado.nextLine().charAt(0)); 

            //Ver direção atual do robo
            System.out.println(robo.mostrarPosicaoAtual());

            //Opção de encerramento do programa
            System.out.println("\nDeseja continuar (s/n) ?");
            char resp = teclado.nextLine().charAt(0);
            if(resp == 'n'){
                teclado.close();
                System.exit(0);
            }

        }
    }
}
