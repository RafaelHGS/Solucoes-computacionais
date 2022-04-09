import java.util.Scanner;

//Array, um conjunto de valores, uma espécie de "lista" indexada (tem um indíce para cada valor) e com tamanho definido.

public class Ex00 {
    public static void main(String[] args) {
        int[] idade = { 2, 3, 45, 23, 45, 12, 44, 31, 2 }; // Identficador do tipo array int

        float[] salario = { 40000.23f, 56000.56f };

        float[] v = new float[5]; // Primeiro índice: 0
                                  // Último índice: 11
        int a[] = new int[5];

        // "Charopada" par explicação:

        // Selecionando um índice qualquer do Array, usa-se nome_do_aray["indice"]
        System.out.println(idade[5]);
        System.out.println(salario[1]);

        // Armazenando valores num array, para exemplo, um array de tamanho 5
        v[0] = 4;
        v[1] = 25;
        v[2] = 60;
        v[3] = 77;
        v[4] = 11;

        // Armazenando valores, exemplo 2:
        Scanner teclado = new Scanner(System.in);
        int i = 0, b;
        while (i <=4){
            b = teclado.nextInt();
            a[i] = b;
            i++;
        }

        //Exibindo valores (do array criado com scanner), exemplo1:
        System.out.println("\n\n Exibindo\n");
        int j = 0;
        while (j <=4){
            System.out.println(a[j]);
            j++;
        }

        teclado.close();
    }
}
