/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ex04;

/**
 *
 * @author 125111374176
 */
public class Funcionario {
    public String nome;
    public String cargo;
    public double salario;
    
    @Override
    public String toString(){
        return "Nome: "+ this.nome + "\nCargo: " + this.cargo + "\nSalario: " + this.salario;
}
    
    public String exibirFuncionario(Funcionario f){
        return "Nome: "+ f.nome + "\nCargo: " + f.cargo + "\nSalario: " + f.salario;
    }
    
    
    
}
