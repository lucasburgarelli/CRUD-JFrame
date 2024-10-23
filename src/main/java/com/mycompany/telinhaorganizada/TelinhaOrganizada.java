/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.telinhaorganizada;

/**
 *
 * @author paulo
 */
public class TelinhaOrganizada {

    /*
        Para criar uma tela cujo gerenciamento dos eventos é
        feito dentro de uma classe específica para isso, os passos
        são:
        1-Crie uma classe para a tela (que herde de JFrame).
        2-Crie uma classe de gerenciamento que irá tratar
          os eventos de botão nela. Nesta classe de gerenciamento você terá que:
            a-Garantir que o nome certo do método seja usado. Para
              isso, a classe de gerenciamento deve herdar por implementação
              da interface ActionListener.
            b-Implementar o método ActionPerformed (será obrigatório porque você
              criou um contrato com a interface ActionListener
            c-Declarar e instanciar uma tela.
            d-Relacionar o gerenciador com o(s) botão(ões) que você
              quer tratar no gerenciador.
            e-Instancie um gerenciador aqui nesta classe, no método principal
    */
    
    public static void main(String[] args) {
       GerenciadorCliente gc = new GerenciadorCliente();
        
    }
}
