/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.telinhaorganizada;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.JButton;

/**
 *
 * @author paulo
 */
//A classe herda de ActionListener para garantir 
//a implementação do método de tratamente de eventos
//Esse método actionPerformed deverá ser executado
//automaticamente pela JVM quando o botão for
//apertado
public class GerenciadorCliente implements ActionListener{
    private TelaCliente tc;
    private ArrayList<Cliente> clientes;
    
    public GerenciadorCliente(){
        clientes = new ArrayList<>();
        tc = new TelaCliente();
        tc.adicionarListener(this);
    }
    
    //O parâmetro e contém informações sobre o evento
    //gerado ao apertar o botão.
    @Override
    public void actionPerformed(ActionEvent e) {
        String buttonName = ((JButton)e.getSource()).getName();
        switch (buttonName) {
            case "C":
                clientes.add(tc.getDadosCliente());
                break;
            case "R":
                System.out.println("LISTANDO CLIENTES");
                clientes.forEach(c -> {
                    System.out.println("==========================");
                    System.out.println("Cliente Guid:" + c.getGuid());
                    System.out.println("Cliente nome:" + c.getNome());
                    System.out.println("Cliente email:" + c.getEmail());
                });
                break;
            case "U":
                for (Cliente c : clientes) {
                    Cliente clienteLido = tc.getDadosCliente();
                    if(!clienteLido.getGuid().toLowerCase().equals(c.getGuid().toLowerCase()))
                        continue;
                    c.setNome(clienteLido.getNome());
                    c.setEmail(clienteLido.getEmail());
                }
                break;
            case "D":
                Cliente clienteRemovido = null;
                for (Cliente c : clientes) {
                    if(!tc.getDadosCliente().getGuid().toLowerCase().equals(c.getGuid().toLowerCase()))
                        continue;
                    clienteRemovido = c;
                }
                clientes.remove(clienteRemovido);
                break;
        }
    }
}