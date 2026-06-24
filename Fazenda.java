package br.com.fiap.bean;

import javax.swing.*;

// Interface = contrato com métodos sem implementação, todos relacionados entre si.

//Para acessar os métodos de uma Interface, a mesma deve ser
//implementada por uma classe (utilizando a palavra implements),
//parecido com o conceito de herança.

//Não é possível criar objetos diretamente de uma Interface.
//Uma Interface não possui construtores.

//A interface define o que precisa ser feito. O implements diz quem vai fazer.

public class Fazenda implements Cadastravel{
    //atributos privados da classe Fazenda
    private int id;
    private String nome;

    //Construtor → define os valores na criação do objeto:

    //construtor sem parâmetro
    public Fazenda(){}

    //Construtor com passagem de parâmetros
    public Fazenda(int id, String nome){
        this.id = id; //aqui o this.id diz que o atributo id recebe o mesmo valor do parâmetro id
        this.nome = nome; //definindo os valores iniciais do atributo
    }
    //Construtor → define os valores na criação do objeto
    //Um construtor em Java é um método especial que é usado na inicialização
    //(instanciação) de um objeto.

    //métodos getters/setters

    //Set → método que altera o valor de um atributo privado
    //Get → método que retorna o valor de um atributo privado.

    public int getId() {
        return id; // nesse caso tá retornando o valor do atributo
    }

    public void setId(int id) {
        this.id = id; //aqui está dizendo que o atributo recebe o valor do parâmetro id
    }

    public String getNome() {
        return nome; // neste caso está retornando o valor do atributo
    }

    public void setNome(String nome) {
        this.nome = nome; //o atributo nome recebe o valor do parâmetro nome
    }

    //métodos

    //O Método cadastrar cadasta a fazenda
    public void cadastrar() {
        String nomeFazenda = JOptionPane.showInputDialog(null, "Digite o nome da fazenda:");
        this.nome = nomeFazenda;
        JOptionPane.showMessageDialog(null, "Fazenda '" + this.nome + "' cadastrada com sucesso!");
    }

    //O método listarTalhoes lista os talhões
    public void listarTalhoes() {
        JOptionPane.showMessageDialog(null, "Listando talhões da fazenda: " + nome);
    }

    //O método exibirDetalhes exibe os detalhes
    public void exibirDetalhes() {
        JOptionPane.showMessageDialog(null, "Fazenda: " + nome + "\nID: " + id);
    }

    //O toString é um método especial que converte o objeto em texto.
    //O toString está fazendo uma concatenação com o + para montar o texto
    //O toString serve para exibir as informações do objeto de forma legível
    public String toString() {
        return "Fazenda{" + "id=" + id + ", nome='" + nome + '\'' + '}'; //retornando uma String com os dados do objeto
    }
}
