/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package meuprimeiropoo;

/**
 *
 * @author profslpa
 */
public class Aluno {
    
    String nome;
    double A1;
    double A2;
    double A3;
    
    public Aluno(){}
    
    public String perguntaNome(){
    
        return this.nome;
        
    }
    
    public void mudaNome(String nomeNovo){
    
        this.nome = nomeNovo;
        
    }
    
}
