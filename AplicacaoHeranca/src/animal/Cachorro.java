/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package animal;

/**
 *
 * @author profslpa
 */
public class Cachorro extends Animal {

    public Cachorro() {
        // O 'super' é como se a gente pedisse algo para a classe Animal.
        // A classe Cachorro diz: "Ei, Animal, ponha o nome 'Caramelo' e diga que sou um 'Cachorro'!"
        super("Caramelo", "Cachorro");

    }
    
    //costumização de uma ação que já tinha
    //usado para sobrescrever um dado já declarado anteriormente, mas o dado declarado anteriormente não foi esquecido, seu quiser retorna-lo novamente consigo
    @Override
    public String som() {
        return "auauau";
    }
    
    //recuperação da ação antiga
    public String escolheSom(int op){
        if (op == 1){
            return som();
        }else{
            return super.som();
        }
    
    }
    
    public String escolheSom(){
        return super.som();
    
    }
    //usa void quando vou fazer uma ação que não precisa de return
    //usa-se esse método para acessar uma váriavel private de uma outra classe, ele substitui o "this.nome = nome" para esse caso
    // esse construtor pede para o a clase Animal mudar a várivel private que possui o nome do cachorro para outro nome;
    public void setNome(){
        super.setNome(nome);
                
    }
          

}
