package br.com.fiap.bean;

import javax.swing.*;

//extends - foi herdado da classe usuário
public class Agricultor extends Usuario{

    //atributos privados da classe Agricultor
    private String cpf;

    //construtor vazio
    public Agricultor(){}

    //construtor com passagem de parâmetros
    public Agricultor(int id, String nome, String cpf){
        super(id, nome); //super - significa que foi herdando atributos da classe pai
        this.cpf = cpf;
    }

    // get - pega o atributo privado e retorna o seu valor
    public String getCpf() {
        return cpf;
    }

    // set - define ou altera o valor do atributo
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    //método cadastrarFazenda mostra mensagem pedido que o usuário digite o nome da fazenda(showinputdialog)
    //o showmessagedialog mostra a confirmação do cadastro da fazenda pelo agricultor
    public void cadastrarFazenda() {
        String nomeFazenda = JOptionPane.showInputDialog(null, "Digite o nome da fazenda:");
        JOptionPane.showMessageDialog(null, "Fazenda '" + nomeFazenda + "' cadastrada pelo agricultor " + getNome());
    }

    // o método cadastrarTalhao vai mostrando a mensagem pedindo que o usuário digite o nome do talhão (showinputdialog)
    //Confirma o cadastro exibindo uma mensagem com o nome digitado e o nome do agricultor (showMessageDialog)
    public void cadastrarTalhao() {
        String nomeTalhao = JOptionPane.showInputDialog(null, "Digite o nome do talhão:");
        JOptionPane.showMessageDialog(null, "Talhão '" + nomeTalhao + "' cadastrado pelo agricultor " + getNome());
    }

    //método gerarRelatorio vai mostrar a mensagem do relatório gerado
    public void gerarRelatorio() {
        JOptionPane.showMessageDialog(null, "Relatório gerado para o agricultor: " + getNome());
    }

    //toString - transforma o objeto em texto
    public String toString() {
        return "Agricultor{" + "id=" + getId() + ", nome='" + getNome() + '\'' + ", cpf='" + cpf + '\'' + '}';
    }
}
