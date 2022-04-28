/*

    Exercíco 1) Desenvolva um programa que:
        -Leia a média final de 5 alunos diferentes, armazenando essas nota_medias em um vetor;
        -Calcule a média da Turma;
        -Percorra o vetor de nota_medias e compare com a média da turma. Para aqueles que tiverem nota_medias maiores
        ou iguais à média da turma, imprima a fras e"Parabéns". Para aqueles abaixo, imprima a fras e"Estude mais


*/


package Ex01;
import java.util.Scanner;


public class Ex01 {
    public static void main(String[] args) {
        //Configuração de Variáveis
        Scanner teclado = new Scanner(System.in);
        float[] medias = new float[5];
        float nota_media = 0, media_turma = 0, aux;
        int contador = 1;
        

        //Lendo a média final de 5 alunos:
        do{
            System.out.println("Digite a média final do " + contador +"º Aluno: ");
            nota_media = teclado.nextFloat();

            if (nota_media < 0 || nota_media > 10){
                System.out.println("\n\nnota_media Inválida! Insira uma nota_media entre 0 e 10!\n\n");;
            }
            else{
                medias[contador-1] = nota_media;
                contador += 1;
                System.out.println("\n\nPróximo aluno \n\n");;
            }
        }
        while (contador <= 5);

        teclado.close();
        

        //Processamento
            //Calculando a média da turma
        for (int i = 0; i < medias.length; i++){
            media_turma = media_turma + medias[i];
        }
        media_turma = media_turma/5;

        System.out.printf("\nA média da turma é: %.2f", media_turma);


            //Percorrendo as notas da turma e atribuindo à um aluno
        contador = 1;
        for (int j = 0; j < medias.length; j++){
            aux = medias[j];

            //Saída de dados
            if (aux >= media_turma){
                System.out.println("\n\nO "+ contador + "º Aluno teve a média: " + aux);
                System.out.println("Parabéns");
            }
            else{
                System.out.println("\n\nO "+ contador + "º Aluno teve a média: " + aux);
                System.out.println("Estude mais");                
            }

            contador++;
        }
        
    }
}
