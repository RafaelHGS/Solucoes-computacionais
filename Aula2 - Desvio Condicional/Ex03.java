import java.util.Scanner;

/*
 -Faça um algoritmo que:
    - receba a idade de uma pessoa;
    - se for maior de idade imprima: "Maior de Idade"
    - senão imprima: "Menor de idade" 
*/

public class Ex03 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int idade = teclado.nextInt();

        teclado.close();

        if (idade >= 18){
            System.out.printf("Maior de idade");
        }
        else{
            System.out.printf("Menor de idade");
        }

    }
}
