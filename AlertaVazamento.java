package br.com.fiap.bean;

import javax.swing.*;

//o extends diz que herda da classe Alerta
public class AlertaVazamento extends Alerta{

    //atributos privados da classe AlertaVazamento
    private String localizacao;
// construtor vazio
    public AlertaVazamento(){}

    //construtor com passagem de parâmetro
    public AlertaVazamento(int id, String localizacao){
        super(id);
        this.localizacao = localizacao;
    }

    //get - pega o atributo privado e retorna o valor dele
    public String getLocalizacao() {
        return localizacao;
    }

    //set - ele define/altera o valor de um atributo privado.
    // O set recebe um valor como parâmetro e atribui esse valor ao atributo privado.
    public void setLocalizacao(String localizacao) {
        this.localizacao = localizacao;
    }

    //notificar() → método que exibe um alerta de vazamento
    public void notificar() {
        JOptionPane.showMessageDialog(null, "Alerta de vazamento #" + getId() + " - Local: " + localizacao);
    }

    //detectarVazamento() → método que exibe a mensagem pedindo manutenção
    public void detectarVazamento() {
        JOptionPane.showMessageDialog(null, "Vazamento detectado em: " + localizacao + ". Acionar manutenção imediatamente!");
    }

    //toString
    //o toString converte o objeto em texto
    public String toString() {
        return "AlertaVazamento{" + "localizacao='" + localizacao + '\'' + '}';
    }
}
