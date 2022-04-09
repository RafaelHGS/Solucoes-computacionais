
//Faça um algoritmo que exiba todos os caracteres minúsculos e maiúsculos. Dica: Use a tabela Unicode
public class Ex03 {

    /*
         Caracteres na Unicode:
         65- A
         122 - z
         exceto caracteres da faixa 91-96
    */

    public static void main(String[] args) {
        int i = 65;

        while(i <= 122){

            if(i >= 91 && i <=96){
                i += 1;
            }

            else{
                System.out.println((char)i); //Cast de um número para letra, o número será convertido para o respectivo caractere da tabela unicode
                i = i+1;
            }
            
        }
    }
}
