package br.com.fiap.bean;

import javax.swing.*;
//essa classe implementa a interface Cadastravel
public class Talhao implements Cadastravel{
    //atributos privados da classe Talhao
    private int id;
    private double areaHectares;

    //construtor vazio
    public Talhao(){}

    //construtor com passagem de parâmetros
    public Talhao(int id, double areaHectares){
        this.id = id;
        this.areaHectares = areaHectares;
    }
    //métodos getters/setters
    //get - pega o atributo e retorna o valor dele
    // set - altera ou define o valor do atributo
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getAreaHectares() {
        return areaHectares;
    }

    public void setAreaHectares(double areaHectares) {
        this.areaHectares = areaHectares;
    }

    //método cadastrar() - exibe uma janela pedindo para digitar a área do talhão em hectares (showinputdialog)
    //showmesagedialog - mostra uma janela dizendo que o talhão foi registrado e exibe também a área do talhão em hectares
    //Double.parseDouble(area) — converte o texto digitado pelo usuário em número decimal e salva no atributo areaHectares
    public void cadastrar() {
        String area = JOptionPane.showInputDialog(null, "Digite a área do talhão em hectares:");
        this.areaHectares = Double.parseDouble(area);
        JOptionPane.showMessageDialog(null, "Talhão cadastrado com " + this.areaHectares + " hectares!");
    }

    //método registrarAlerta - exibe mensagem dizendo que o alerta foi registrado para o talhão e exibe o id
    public void registrarAlerta() {
        JOptionPane.showMessageDialog(null, "Alerta registrado para o talhão #" + id);
    }

    //método consultarHistorico() - exibe o histórico de irrigações do talhão e o id
    public void consultarHistorico() {
        JOptionPane.showMessageDialog(null, "Histórico de irrigações do talhão #" + id);
    }

    //toString - transforma o objeto em texto
    public String toString() {
        return "Talhao{" + "id=" + id + ", areaHectares=" + areaHectares + '}';
    }
}
