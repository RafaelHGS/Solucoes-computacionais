import java.util.Scanner;

//Inicio de Desvio condicional

/*
 Faça um algoritmo que leia um número inteiro.
    -Se o número for maior que 20...
        -Calcular e imprimir metade dele
*/

public class Ex01 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int numero = teclado.nextInt();

        teclado.close();


        //Desvio condicional if/else
        if (numero > 20){
            double resultado = numero/2;
            System.out.println(resultado);
        }
        else{
            System.out.println(numero);
        }
    }
}
