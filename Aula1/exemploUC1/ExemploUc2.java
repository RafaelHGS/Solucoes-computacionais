
//Programa Exemplo2: Lendo um valor fornecido por usuário:

import java.util.Scanner;


public class ExemploUc2 {
    
public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in); //Criando variável "teclado", responsável por ler os valores/caracterers digitados pelo usuário.

    System.out.println("Digite o nome:");
    String nome = teclado.nextLine(); //.nextLine Captura a String digitada, até o final da linha (considera espaços), e armazenar em "nome".

    System.out.println("Digite a idade: ");

    int idade = teclado.nextInt(); //nextInt é o responsável por capturar um valor do tipo inteiro digitado pelo usuário, que será lido pelo "teclado" e armazenado em "idade".

    teclado.close(); //.close() fecha o método Scanner em aberto, resolve o erro " never closed" em algumas IDE's

    //Mostrando no terminal
    System.out.println("Nome: " + nome); //Uso de concatenação de String e valor de variável
    System.out.println("Idade: " + idade);


}
}
