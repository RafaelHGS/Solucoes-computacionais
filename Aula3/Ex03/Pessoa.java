/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ex03;

/**
 *
 * @author 125111374176
 */
public class Pessoa {
    public String dizerInformacao(String nome){
        return "Meu nome é " + nome;
    }
    
    public String dizerInformacao(int idade){
        return "Minha idade é "+ idade;
    }
    
    public String dizerInformacao(double peso, double altura){
        return "Meu peso é " + peso + "\nMinha altura é " + altura;
    }
    
    
}
