/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package calculadora;

/**
 *
 * @author profslpa
 */
public class Calculadora {
    private double ultimoValor;
    
/*toda classe precisa de um construtor, olhe abaixo*/
    public Calculadora(){
        this.ultimoValor = 0;
    }
    /*as váriaveis numero1 e numero2 são os que vão salvar os numeros da soma*/
    public double soma(double numero1, double numero2){
        double resultado = numero1 + numero2;
        this.ultimoValor = resultado;
        
        return resultado;
    }
    
    public double subtrair(double numero1, double numero2){
        double resultado = numero1 - numero2;
        this.ultimoValor = resultado;
        
        return resultado;
    }
    
    /*resto da divisão só funciona com número inteiro*/
    
    public int resto(int numero1, int numero2){
        double resultado = numero1%numero2;
        this.ultimoValor = resultado;
        
        return (int)resultado;
    }
    
    public double ultimoResultado(){
        return this.ultimoValor;
    }
}
