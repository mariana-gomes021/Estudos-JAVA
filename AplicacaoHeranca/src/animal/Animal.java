/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package animal;

/**
 *
 * @author profslpa
 */
public class Animal {
    
    //declaração dos tipos de variáveis
    private String nome;
    private String tipo;
    
    //construtor: definir as caracteristicas das variaveis
    //tipo de construtor 1: Eu indico caracteristicas fixas
    public Animal(){
        //this indica onde o dado vai ser salvo
        this.nome = "Alberto";
        this.tipo = "Ser Humano";
    }
    
    //tipo de construtor 2: As características são dinâmicas
    public Animal(String nome, String tipo){
        this.nome = nome;
        this.tipo = tipo;
    
    }
    
    //get e set são para acessar os atributos(dados necessários)que estão private
    //os parenteses são para passar os argumentos
    //get mostra o dado salvo em uma variavel específica que eu indiquei
    public String getNome(){
        return this.nome;
    }
    
    // set insere um dado em uma variavel nova
    // this.nome = nomeNovo é igual nome = nomeNovo
    public void setNome(String nomeNovo){
        this.nome = nomeNovo;
    }

    public String getTipo(){
        return this.tipo;
    }
    
    //como retornar os dados de uma vez
    //String[] = Cria uma coleção (uma super váriavel que cabe outras váriaveis) de textos (lista)
    //Depois decrever os processos de getCaracteristicas
    
    public String[] getCaracteristicas(){
        String[] aux = new String[2];
        aux[0] = this.nome;
        aux[1] = this.tipo;
        
        return aux;
    }
    
    public String som(){
        return "lalala";
    }
}
