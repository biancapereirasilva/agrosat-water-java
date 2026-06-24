package br.com.fiap.bean;

import javax.swing.*;

//extends - significa que ele herda da classe Alerta
public class AlertaUmidade extends Alerta{

    //atributos privados da classe AlertaUmidade
    private double nivelUmidade;

    //construtor sem parâmetro
    public AlertaUmidade(){}

    //construtor com parâmetros
    public AlertaUmidade(int id, double nivelUmidade){
        super(id);
        this.nivelUmidade = nivelUmidade;
    }

    //métodos getters/setters

    //get - pega o atributo e retorna
    //O get acessa um atributo privado da classe e retorna o valor dele.
    public double getNivelUmidade() {
        return nivelUmidade;
    }

    //set - altera ou define o valor do atributo
    public void setNivelUmidade(double nivelUmidade) {
        this.nivelUmidade = nivelUmidade;
    }

    //método notificar()
    //Esse método exibe uma janela de diálogo notificando o nível de umidade mostrando o ID do objeto e o valor do nivelUmidade em porcentagem.
    public void notificar() {
        JOptionPane.showMessageDialog(null, "Alerta de umidade #" + getId() + " - Nível: " + nivelUmidade + "%");
    }

    //Esse método calcula o risco com base no nível de umidade e exibe uma mensagem diferente pra cada situação
    public void calcularRisco() {
        //if - executa se a condição for verdadeira
        if (nivelUmidade < 30) {
            JOptionPane.showMessageDialog(null, "Risco ALTO: solo muito seco! Nível: " + nivelUmidade + "%");
            //else if → "senão, se essa outra condição for verdadeira, faz isso"
        } else if (nivelUmidade > 80) {
            JOptionPane.showMessageDialog(null, "Risco ALTO: solo encharcado! Nível: " + nivelUmidade + "%");
            //else → "senão, faz isso" (quando nenhuma condição anterior foi verdadeira)
        } else {
            JOptionPane.showMessageDialog(null, "Nível de umidade adequado: " + nivelUmidade + "%");
        }
    }

    //toString
    //O toString é um método especial que converte o objeto em texto
    //ele retorna uma String descrevendo aquele objeto.
    public String toString() {
        return "AlertaUmidade{" + "nivelUmidade=" + nivelUmidade + '}';
    }
}
