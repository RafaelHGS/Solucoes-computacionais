/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ex01;
import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author 125111374176
 */
public class Ex01 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        float[] medias = new float[5];
        float nota = 0, media, media_turma, aux;
        int contador = 1;
        
        for (int i = 1; i <=5; i++){
            do{
                System.out.println("Digite a " + contador + "ª nota do "+ i +"º Aluno: ");
                aux = teclado.nextFloat();

                if (aux < 0 || aux > 10){
                    nota = nota;
                }
                else{
                    nota += aux;
                    contador += 1;
                }
            }
            while (contador <= 5);
            
            media = nota/5;
            medias[i-1] = media;
            
            System.out.println("\n\nPróximo aluno \n\n");
            nota = 0;
            contador = 1;
        }
        
        media_turma
        
        System.out.println(nota);
        System.out.println(Arrays.toString(medias));

        
    }
}
