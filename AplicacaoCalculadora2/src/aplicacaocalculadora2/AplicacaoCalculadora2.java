/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package aplicacaocalculadora2;
import calculadora.Calculadora;

/**
 *
 * @author profslpa
 */
public class AplicacaoCalculadora2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Calculadora calc = new Calculadora();
        calc.soma(3,20);
        
        System.out.println(calc.ultimoResultado());
    }
    
}
