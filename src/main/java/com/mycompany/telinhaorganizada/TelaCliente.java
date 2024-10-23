/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.telinhaorganizada;

import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

/**
 *
 * @author paulo
 */
public class TelaCliente extends JFrame{
    private JLabel jlGuid, jlNome, jlEmail;
    private JTextField jtGuid, jtNome, jtEmail;
    private JButton jbCadastrar, jbListar, jbAlterar, jbRemover;
    
    public TelaCliente(){
        //Configurar a própria tela
        setTitle("Minha Primeira Janela organizada!");
        setLayout(null);
        setSize(500, 500);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        
        jlGuid = new JLabel();
        jlGuid.setText("GUID:");
        jlGuid.setBounds(50, 50, 50, 20);
        
        jlNome = new JLabel();
        jlNome.setText("Nome:");
        jlNome.setBounds(50, 100, 50, 20);
        
        
        jlEmail = new JLabel();
        jlEmail.setText("Email:");
        jlEmail.setBounds(50, 150, 50, 20);
        
        
        
        jtGuid = new JTextField();
        jtGuid.setBounds(110,50,200,20);
        
        jtNome = new JTextField();
        jtNome.setBounds(110,100,200,20);
        
        jtEmail = new JTextField();
        jtEmail.setBounds(110,150,200,20);
        
        
        
        //Instancia o botão e configura
        jbCadastrar = new JButton();
        jbCadastrar.setText("Cadastrar");
        jbCadastrar.setBounds(130,200,150,30);
        jbCadastrar.setName("C");
        
        jbListar = new JButton();
        jbListar.setText("Listar");
        jbListar.setBounds(130,250,150,30);
        jbListar.setName("R");
        
        jbAlterar = new JButton();
        jbAlterar.setText("Alterar");
        jbAlterar.setBounds(130,300,150,30);
        jbAlterar.setName("U");
        
        jbRemover = new JButton();
        jbRemover.setText("Excluir");
        jbRemover.setBounds(130,350,150,30);
        jbRemover.setName("D");
        
        
        
        //Adicionar cada componente na janela gráfica
        add(jlGuid);
        add(jtGuid);
        add(jlNome);
        add(jtNome);
        add(jlEmail);
        add(jtEmail);
        add(jbCadastrar);
        add(jbListar);
        add(jbAlterar);
        add(jbRemover);
        //Deixar a janela visível
        setVisible(true);
    }
    
    public void adicionarListener(ActionListener gc){
        jbCadastrar.addActionListener(gc);
        jbListar.addActionListener(gc);
        jbAlterar.addActionListener(gc);
        jbRemover.addActionListener(gc);
    }
    
    public Cliente getDadosCliente(){
        Cliente c = new Cliente();
        c.setGuid(jtGuid.getText());
        c.setNome(jtNome.getText());
        c.setEmail(jtEmail.getText());
        
        return c;
    }
}
