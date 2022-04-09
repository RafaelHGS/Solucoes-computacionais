/* 
 -Laços de repetição:
    -While : "Enquanto" ... (irá repetir a tarefa)
    -Do While: "Faça Enquanto"... (irá repetir a tarefa ao menos uma vez até realizar a sua condição)
    -for each: "Para cada" (irá executar uma tarefa um número "limitado" de vezes)
*/

//Faça um algoritmo que gere uma sequencia de 1 a 100.
public class Ex01 {
    public static void main(String[] args) {
        int i = 1;

        System.out.println("\nCom uso do While");
        while(i <= 100){
            System.out.println(i);
            i += 1; //Ou "i = i + 1"
        }

        //Ou

        System.out.println("\n\nCom uso do for each");
        for (int n= 1; n <=100 ; n = n +1 ){
            System.out.println(n);
        }

    }
}
