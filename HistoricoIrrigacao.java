package br.com.fiap.bean;

import javax.swing.*;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

//implements - significa que está implementando a interface
public class HistoricoIrrigacao implements Consultavel{

    //atributos privados da classe HistoricoIrrigacao
    private LocalDateTime data;

    //construtor vazio
    public HistoricoIrrigacao(){}

    //construtor com passagem de parâmetro
    public HistoricoIrrigacao(LocalDateTime data){
        this.data = data;
    }

    //get - pega o atributo privado e retorna o seu valor
    public LocalDateTime getData() {
        return data;
    }

    //set - altera ou define o valor do atributo privado
    public void setData(LocalDateTime data) {
        this.data = data;
    }

    // método consultar() exibe o histórico de irrigação com a data formatada no padrão brasileiro (dd/MM/yyyy HH:mm)
    //O DateTimeFormatter é só o responsável por formatar a data nesse padrão antes de exibir na mensagem
    public void consultar() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
        JOptionPane.showMessageDialog(null, "Histórico de irrigação - Data: " + data.format(formatter));
    }

    //método registrar()
    //Captura o momento atual e salva no atributo data (LocalDateTime.now())
    //Exibe uma mensagem confirmando o registro com a data formatada no padrão brasileiro
    public void registrar() {
        this.data = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
        JOptionPane.showMessageDialog(null, "Irrigação registrada em: " + data.format(formatter));
    }

    //método gerarRelatorio() - Esse método exibe um relatório com a data da irrigação formatada no padrão brasileiro.
    public void gerarRelatorio() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
        JOptionPane.showMessageDialog(null, "Relatório gerado!\nData da irrigação: " + data.format(formatter));
    }

    //toString - converte o objeto em texto
    public String toString() {
        return "HistoricoIrrigacao{" + "data=" + data + '}';
    }
}
