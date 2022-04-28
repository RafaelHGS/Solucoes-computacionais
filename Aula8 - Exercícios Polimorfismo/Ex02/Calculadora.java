/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ex02;

/**
 *
 * @author 125111374176
 */
public class Calculadora {
    public double operacao(double n1, double n2){
        return n1 + n2;
    }
    
    public double operacao(int n1, double n2){
        return n1 - n2;
    }
    
    public double operacao(double n1, int n2){
        return n1 * n2;
    }
    
    public double operacao(int n1, int n2){
        return n1 / n2;
    }
    
    public double operacao(int n1, short n2){
        return n1 % n2;
    }
    
}
