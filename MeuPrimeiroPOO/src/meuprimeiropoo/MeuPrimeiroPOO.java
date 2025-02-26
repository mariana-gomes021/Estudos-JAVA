/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package meuprimeiropoo;

/**
 *
 * @author profslpa
 */
public class MeuPrimeiroPOO {
    
    public static void main(String[] args){
        
        Aluno aluno1 = new Aluno();
        aluno1.mudaNome("Victor");
        System.out.println(aluno1.perguntaNome());
        
        Aluno aluno2 = new Aluno();
        aluno2.mudaNome("Beatriz");
         System.out.println(aluno2.perguntaNome());
        
    }
    
}
