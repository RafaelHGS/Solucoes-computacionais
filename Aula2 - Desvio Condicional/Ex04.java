import java.util.Scanner;

/*
 -Desvio condicional encadeado:

    if(condição){
        instrução;      
    }
    else if(condição2){
        instrução;      
    }
    else{
        instrução;      
    }

*/

/*
 - Exercício: Ler dois valroes inteiros
    - e se forem iguais, mostrar "Números iguais";
    - caso contrário, apresentar a diferença do maior pelo menor.
*/
public class Ex04 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int n1, n2;

        n1 = teclado.nextInt();
        n2 = teclado.nextInt();


        teclado.close();

        if (n1 == n2){
            System.out.println("Os números são iguais");
        }
        else if (n1 > n2){
            System.out.printf("O numero %d é maior que %d", n1, n2);
        }
        else{
            System.out.printf("O numero %d é maior que %d", n2, n1);
        }
    }
}
