/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ex04;

/**
 *
 * @author 125111374176
 */
public class Main {
    public static void main(String[] args) {
        Funcionario f =  new Funcionario();
        f.nome = "Agrevaldo silva";
        f.cargo = "Capinador";
        f.salario = 200.00;
        
        System.out.println(f.exibirFuncionario(f));
        
        System.out.println("");
        
        Gerente g = new Gerente();
        g.nome = "Ernesto";
        
        g.atualizar(f, "Condutor de trator");
        g.atualizar(f, 500.0);
        
        System.out.println(f.toString());

    }
    
}
