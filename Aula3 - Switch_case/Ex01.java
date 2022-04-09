import java.util.Scanner;

/*
 -Switch Case:
     Parecido com o if/else, é feita para testar condicionais,
    porém deixando o código mais simples, sem a necessidade de 
    "uma tonelada" de "else if" escritas
*/
public class Ex01 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        //Menu improvisado no terminal
        System.out.println("=== Calculadora ===");
        System.out.println("[1] - Adição");
        System.out.println("[2] - Subtração");
        System.out.println("[3] - Multiplicação");
        System.out.println("[4] - Divisão");
        System.out.println("<<");

        int op = teclado.nextInt();

        System.out.println("Digite dois números:");
        float a = teclado.nextFloat();
        float b = teclado.nextFloat();
        float c;

        //Estrutura de switch/case
        switch(op){
            case 1:
                c = a + b;
                System.out.println("Resultado: "+ c);
                break;
            case 2:
                c = a - b;
                System.out.println("Resultado: "+ c);
                break;
            case 3:
                c = a * b;
                System.out.println("Resultado: "+ c);
                break;
            case 4:
                if (b == 0){
                    System.out.println("Não é possível realizar a divisão por 0");
                }
                else{
                    c = a / b;
                    System.out.println("Resultado: "+ c);
                }
                break;
            default:
                System.out.println("Operação inválida");
                break;
        }
     
        teclado.close();
    }
}
