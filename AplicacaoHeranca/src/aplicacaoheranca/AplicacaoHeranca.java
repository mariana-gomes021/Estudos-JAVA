/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aplicacaoheranca;

import animal.*;

/**
 *
 * @author profslpa
 */

//aula 7, estudar sobre herança
public class AplicacaoHeranca {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Animal = modelo ou plano que define como o objeto vai ser
        // coisa = nome da variável que vai armazenar o objeto (o animal que foi criado) criado
        // new Animal() = cria um novo objeto (cria o animal) com base no modelo Animal
        Animal coisa = new Animal();
        System.out.println(coisa.getNome());
        System.out.println(coisa.getTipo());
        
        Cachorro doguinho = new Cachorro();
        System.out.println(doguinho.getNome());
        System.out.println(doguinho.getTipo());
        System.out.println(doguinho.som());
        System.out.println(doguinho.escolheSom());

    }

}
