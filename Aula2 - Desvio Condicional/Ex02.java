import java.util.Scanner;

//Verifica par ou ímpar, aproveitando uso de "módulo" (resto da divisão)

public class Ex02 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int numero = teclado.nextInt();

        teclado.close();

        if (numero % 2 == 0){
            System.out.printf("O numero par: %d", numero);
        }
        else{
            System.out.printf("O numero impar: %d", numero);
        }

    }
}
