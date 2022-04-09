import java.util.Scanner;

/*
    - Declare um aray para tipos inteiro e tamanho igual a dez.
    Digite os valores via teclado e multiplique todos os valores por dois (2).
    Ao final, Exiba os valores armazenados no array.

*/

public class Ex02 {
    public static void main(String[] args) {
        
        int[] v = new int[10];
        Scanner teclado = new Scanner(System.in);
        
        //Entrada de dados e processamento

        for (int i = 0; i< v.length; i++){
            System.out.print("v["+i+"]= ");
            v[i] = teclado.nextInt();
            v[i] = 2* v[i];
        }

        //Saída de dados
        for (int i = 0; i<v.length; i++){
            System.out.println("v["+i+"]= " + v[i]);
        }

        teclado.close();
    }
}
