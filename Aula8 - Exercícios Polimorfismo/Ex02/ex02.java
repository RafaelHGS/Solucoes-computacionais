/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ex02;

/**
 *
 * @author 125111374176
 */
public class ex02 {
    public static void main(String[] args) {
        Calculadora calc = new Calculadora();
        
        System.out.println(calc.operacao(2.2, 2.2));
        System.out.println(calc.operacao(2, 2.2));
        System.out.println(calc.operacao(2.2, 2));
        System.out.println(calc.operacao(2, 2));
        System.out.println(calc.operacao(2147483647, 2));
    }
}
