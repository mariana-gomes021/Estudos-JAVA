/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aplicacaossaladeaula2;

/**
 *
 * @author profslpa
 */
public class Notas {

    private double A1;
    private double A2;
    private double A3;

    public Notas() {
    }

    public boolean setA1(double nota) {
        if (nota >= 0 && nota <= 30) {
            this.A1 = nota;
            return true;
        }else{
            return false;
        }

    }
    
    public boolean setA2(double nota) {
        if (nota >= 0 && nota <= 30) {
            this.A2 = nota;
            return true;
        }else{
            return false;
        }

    }
    
    public boolean setA3(double nota) {
        if (nota >= 0 && nota <= 40) {
            this.A3 = nota;
            return true;
        }else{
            return false;
        }
        
    }
    
   /* public boolean salvaNota(double nota, int avaliacao){
        if (avaliacao == 1){
           if (nota>= 0 && nota <= 30){
               this.A1 = nota;
               return true;
                       
           }else{
               return false;
           }
              
        }
        
        if (avaliacao == 2){
           if (nota>= 0 && nota <= 30){
               this.A2 = nota;
               return true;
                       
           }else{
               return false;
           }
              
        }
        
        if (avaliacao == 3){
           if (nota>= 0 && nota <= 40){
               this.A3 = nota;
               return true;
                       
           }else{
               return false;
           }
              
        }else{
            return false;
        }
        
        
    
    }*/

    public boolean salvaNota(double nota, int avaliacao){
        if (avaliacao == 1){
            return setA1(nota);
        }else if (avaliacao == 2){
            return setA2(nota);
        }else if (avaliacao == 3){
            return setA3(nota);
        }else{
            return false;
        }
    
    }
    
    public double getA1(){
        return this.A1;
    
    }
    
    public double getA2(){
        return this.A2;
    
    }
    
    public double getA3(){
        return this.A3;
    
    }
    
    public double notaFinal(){
        return (this.A1 + this.A2 + this.A3);
    
    }
    
}
