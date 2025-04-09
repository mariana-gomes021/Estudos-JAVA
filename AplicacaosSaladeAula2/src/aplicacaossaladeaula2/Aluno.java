/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aplicacaossaladeaula2;

/**
 *
 * @author profslpa
 */
public class Aluno {
    
    private String nome;
    private String RA;
    private Notas postit;
    
    //forma 1 de criar o aluno :
    public Aluno (String nome, String RA){
        this.nome = nome;
        this.RA = RA;
        this.postit = new Notas();
    
    }
    
    //forma 2 de criar o aluno : Aluno(String, String, Notas)
    public Aluno(String nome, String RA, Notas notaantiga){
        this.nome = nome;
        this.RA = RA;
        this.postit = notaantiga;
    
    }
    
    public boolean salvaA1(double nota){
        return this.postit.setA1(nota);
    
    }
    
    public boolean salvaA2(double nota){
        return this.postit.setA2(nota);
    
    }
    
    public boolean salvaA3(double nota){
        return this.postit.setA3(nota);
    
    }
    
    public double notaFinal(){
        return this.postit.notaFinal();
    }
    
    
}
