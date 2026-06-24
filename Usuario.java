package br.com.fiap.bean;

import javax.swing.*;

    //classe pai
public class Usuario {

    //atributos privados da classe Usuario
    private int id;
    private String nome;

    //construtor vazio
    public Usuario(){}

    //construtor com passagem de parâmetros
    public Usuario(int id, String nome){
        this.id = id;
        this.nome = nome;
    }

    //métodos getters/setters
        // get - pega o atributo e retorna o seu valor
        //set - altera ou define o valor do atributo

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    //método login() exibe uma mensagem confirmando que o usuário foi logado com sucesso, mostrando o nome dele.
    public void login() {
        JOptionPane.showMessageDialog(null, "Usuário " + nome + " logado com sucesso!");
    }

    //método visualizarAlertas() mostra os alertas do usuário
    public void visualizarAlertas() {
        JOptionPane.showMessageDialog(null, "Exibindo alertas do usuário: " + nome);
    }

    //o método consultarHistorico exibe uma janela mostrando o histórico de irrigações do usuário
    public void consultarHistorico() {
        JOptionPane.showMessageDialog(null, "Exibindo histórico de irrigações do usuário: " + nome);
    }

    //o método toString transforma o objeto em texto
    public String toString() {
        return "Usuario{" + "id=" + id + ", nome='" + nome + '\'' + '}';
    }
}
