/* 
 -Laços de repetição:
    -While : "Enquanto" ... (irá repetir a tarefa)
    -Do While: "Faça Enquanto"... (irá repetir a tarefa ao menos uma vez até realizar a sua condição)
    -for each: "Para cada" (irá executar uma tarefa um número "limitado" de vezes)
*/

//Faça um algoritmo que gere uma sequencia 100, 98, 96, ... , 0.
public class Ex02 {
    public static void main(String[] args) {
        int i = 100;

        do{
            System.out.println(i);
            i = i - 2;
        }while(i >=0);

    }
}
