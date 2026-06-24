package br.com.fiap.bean;

import javax.swing.*;

//esta classe está implementando a interface Notificavel
public class Alerta implements Notificavel{
    //atributos privados da classe Alerta
    private int id;

    //construtor vazio
    public Alerta(){}

    //construtor com passagem de parâmetros
    public Alerta(int id){
        this.id = id;
    }

    // get - pega o atributo e retorna o seu valor
    public int getId() {
        return id;
    }

    // set - altera ou define o valor do atributo privado
    public void setId(int id) {
        this.id = id;
    }

    // método notificar() - exibe uma janela com o alerta e o ID dele
    public void notificar() {
        JOptionPane.showMessageDialog(null, "Alerta #" + id + " notificado.");
    }

    // método exibirAlerta() - exibe uma janela com o alerta e o id
    public void exibirAlerta() {
        JOptionPane.showMessageDialog(null, "Exibindo alerta #" + id);
    }

    //método registrarAlerta - exibe uma janela com o alerta e o id dizendo que foi registrado
    public void registrarAlerta() {
        JOptionPane.showMessageDialog(null, "Alerta #" + id + " registrado no sistema.");
    }

    //toString - transforma o objeto em texto
    public String toString() {
        return "Alerta{" +
                "id=" + id + '}';
    }
}
