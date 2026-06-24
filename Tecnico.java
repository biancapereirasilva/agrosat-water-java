package br.com.fiap.bean;

import javax.swing.*;

//essa classe é filha da classe Usuario
public class Tecnico extends Usuario{

    //atributos privados
    private String registro;

    //construtor vazio
    public Tecnico(){}

    //construtor com passagem de parâmetros
    public Tecnico(int id, String nome, String registro){
        super(id, nome);
        this.registro = registro;
    }

    //get - pega o atributo e retorna o valor dele
    public String getRegistro() {
        return registro;
    }

    //set - altera ou define o valor do atributo privado
    public void setRegistro(String registro) {
        this.registro = registro;
    }

    //método analisarSolo()
    //Pede pro usuário digitar o nome do talhão (showInputDialog)
    //Exibe uma mensagem confirmando que o solo daquele talhão foi analisado pelo técnico (showMessageDialog)
    public void analisarSolo() {
        String talhao = JOptionPane.showInputDialog(null, "Digite o talhão a ser analisado:");
        JOptionPane.showMessageDialog(null, "Solo do talhão '" + talhao + "' analisado pelo técnico " + getNome());
    }

    //método registrarAlerta
    //Pede pro usuário digitar a descrição do alerta (showInputDialog)
    //Exibe uma mensagem confirmando que o alerta foi registrado pelo técnico (showMessageDialog)
    public void registrarAlerta() {
        String descricao = JOptionPane.showInputDialog(null, "Digite a descrição do alerta:");
        JOptionPane.showMessageDialog(null, "Alerta '" + descricao + "' registrado pelo técnico " + getNome());
    }

    //método monitorarTalhao
    //Pede pro usuário digitar o nome do talhão (showInputDialog)
    //Exibe uma mensagem confirmando que o talhão está sendo monitorado pelo técnico (showMessageDialog)
    public void monitorarTalhao() {
        String talhao = JOptionPane.showInputDialog(null, "Digite o talhão a ser monitorado:");
        JOptionPane.showMessageDialog(null, "Talhão '" + talhao + "' sendo monitorado pelo técnico " + getNome());
    }

    //toString - transforma o objeto em texto
    public String toString() {
        return "Tecnico{" + "id=" + getId() + ", nome='" + getNome() + '\'' + ", registro='" + registro + '\'' + '}';
    }
}
