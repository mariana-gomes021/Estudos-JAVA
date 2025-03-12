/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aulalogica1103;
import java.util.Scanner;

/**
 *
 * @author profslpa
 */
public class AulaLogica1103 {
    
    public static void main(String[] args){
    
        double x,y,z,resultado = 0;
        Scanner ler = new Scanner(System.in);
        
        System.out.println("Digite o valor de x");
        x = ler.nextDouble();
        System.out.println("Digite o valor de y");
        y = ler.nextDouble();
        
        z = x + y;
        resultado = z/2;
         System.out.println("A media vale " + resultado);
    }
    
}
