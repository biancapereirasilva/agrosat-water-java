package br.com.fiap.main;

import br.com.fiap.bean.*;
import javax.swing.*;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Main {
    public static void main(String[] args) {

        // Declaração das variáveis que serão usadas ao longo do programa
        String opcao, nomeAgricultor, cpfAgricultor, nomeTecnico, registroTecnico, nomeFazenda, localizacao;
        int opcaoInt, idAgricultor, idTecnico, idFazenda, idTalhao, idAlerta, idAlertaUmidade, idAlertaVazamento;
        double areaHectares, nivelUmidade;
        boolean executando = true;

        // Instanciação dos objetos como null porque os valores ainda não existem
        // — eles dependem do que o usuário vai digitar durante a execução
        Agricultor agricultor = null;
        Tecnico tecnico = null;
        Fazenda fazenda = null;
        Talhao talhao = null;
        Alerta alerta = null;
        AlertaUmidade alertaUmidade = null;
        AlertaVazamento alertaVazamento = null;
        HistoricoIrrigacao historico = null;

        // Loop principal — continua exibindo o menu enquanto "executando" for true
        while (executando) {

            // Exibe o menu principal e captura a opção digitada pelo usuário
            opcao = JOptionPane.showInputDialog(null,
                    "AgroSat Water\n\n" +
                            "1 - Cadastrar Dados\n" +
                            "2 - Cadastrar Fazenda e Talhão\n" +
                            "3 - Registrar Alerta de Umidade\n" +
                            "4 - Registrar Alerta de Vazamento ou Seca\n" +
                            "5 - Consultar Histórico de Irrigações\n" +
                            "6 - Sair\n\n" +
                            "Digite a opção:");

            // Se o usuário clicar em "Cancelar", opcao vem como null
            // Nesse caso, encerra o sistema alterando executando para false
            if (opcao == null) {
                JOptionPane.showMessageDialog(null, "Encerrando o sistema AgroSat Water. Até logo!");
                executando = false; // para o while
            } else {

                // try: tenta converter a opção digitada para número inteiro (Integer.parseInt)
                // Se o usuário digitar letras ou deixar em branco, lança NumberFormatException
                // e cai no catch correspondente
                try {
                    opcaoInt = Integer.parseInt(opcao);

                    // switch: verifica qual número foi digitado e direciona para o bloco correto
                    // Cada case corresponde a uma opção do menu
                    switch (opcaoInt) {

                        case 1:
                            // Coleta todos os dados necessários via JOptionPane e instancia os objetos
                            idAgricultor = Integer.parseInt(JOptionPane.showInputDialog("Digite o ID do agricultor:"));
                            nomeAgricultor = JOptionPane.showInputDialog("Digite o nome do agricultor:");
                            cpfAgricultor = JOptionPane.showInputDialog("Digite o CPF do agricultor:");
                            agricultor = new Agricultor(idAgricultor, nomeAgricultor, cpfAgricultor);

                            idTecnico = Integer.parseInt(JOptionPane.showInputDialog("Digite o ID do técnico:"));
                            nomeTecnico = JOptionPane.showInputDialog("Digite o nome do técnico:");
                            registroTecnico = JOptionPane.showInputDialog("Digite o registro do técnico:");
                            tecnico = new Tecnico(idTecnico, nomeTecnico, registroTecnico);

                            idFazenda = Integer.parseInt(JOptionPane.showInputDialog("Digite o ID da fazenda:"));
                            nomeFazenda = JOptionPane.showInputDialog("Digite o nome da fazenda:");
                            fazenda = new Fazenda(idFazenda, nomeFazenda);

                            idTalhao = Integer.parseInt(JOptionPane.showInputDialog("Digite o ID do talhão:"));
                            areaHectares = Double.parseDouble(JOptionPane.showInputDialog("Digite a área do talhão em hectares:"));
                            talhao = new Talhao(idTalhao, areaHectares);

                            idAlerta = Integer.parseInt(JOptionPane.showInputDialog("Digite o ID do alerta:"));
                            alerta = new Alerta(idAlerta);

                            idAlertaUmidade = Integer.parseInt(JOptionPane.showInputDialog("Digite o ID do alerta de umidade:"));
                            nivelUmidade = Double.parseDouble(JOptionPane.showInputDialog("Digite o nível de umidade:"));
                            alertaUmidade = new AlertaUmidade(idAlertaUmidade, nivelUmidade);

                            idAlertaVazamento = Integer.parseInt(JOptionPane.showInputDialog("Digite o ID do alerta de vazamento:"));
                            localizacao = JOptionPane.showInputDialog("Digite a localização do vazamento:");
                            alertaVazamento = new AlertaVazamento(idAlertaVazamento, localizacao);

                            // Registra o histórico com a data e hora do momento do cadastro
                            historico = new HistoricoIrrigacao(LocalDateTime.now());

                            // Exibe um resumo com todos os dados cadastrados usando os métodos get de cada objeto
                            JOptionPane.showMessageDialog(null,
                                    "Dados Cadastrados\n\n" +
                                            "👨‍🌾 AGRICULTOR\n" +
                                            "ID: " + agricultor.getId() + "\n" +
                                            "Nome: " + agricultor.getNome() + "\n" +
                                            "CPF: " + agricultor.getCpf() + "\n\n" +
                                            "👷 TÉCNICO\n" +
                                            "ID: " + tecnico.getId() + "\n" +
                                            "Nome: " + tecnico.getNome() + "\n" +
                                            "Registro: " + tecnico.getRegistro() + "\n\n" +
                                            "🏡 FAZENDA\n" +
                                            "ID: " + fazenda.getId() + "\n" +
                                            "Nome: " + fazenda.getNome() + "\n\n" +
                                            "🌱 TALHÃO\n" +
                                            "ID: " + talhao.getId() + "\n" +
                                            "Área: " + talhao.getAreaHectares() + " hectares\n\n" +
                                            "🔔 ALERTA\n" +
                                            "ID: " + alerta.getId() + "\n\n" +
                                            "💧 ALERTA DE UMIDADE\n" +
                                            "ID: " + alertaUmidade.getId() + "\n" +
                                            "Nível de Umidade: " + alertaUmidade.getNivelUmidade() + "%\n\n" +
                                            "🚨 ALERTA DE VAZAMENTO\n" +
                                            "ID: " + alertaVazamento.getId() + "\n" +
                                            "Localização: " + alertaVazamento.getLocalizacao() + "\n\n" +
                                            "📋 HISTÓRICO DE IRRIGAÇÃO\n" +
                                            "Data: " + historico.getData().format(DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm")));
                            break; // encerra o case 1 e sai do switch

                        case 2:
                            // Verifica se os objetos foram cadastrados antes de tentar usá-los
                            // Se ainda forem null, o cadastro não foi feito — exibe aviso
                            if (fazenda == null || talhao == null) {
                                JOptionPane.showMessageDialog(null, "Cadastre os dados primeiro! Escolha a opção 1.");
                            } else {
                                // Chama os métodos da fazenda: cadastrar, listar talhões, exibir detalhes e toString
                                fazenda.cadastrar();
                                fazenda.listarTalhoes();
                                fazenda.exibirDetalhes();
                                JOptionPane.showMessageDialog(null, fazenda.toString());

                                // Chama os métodos do talhão: cadastrar, registrar alerta, consultar histórico e toString
                                talhao.cadastrar();
                                talhao.registrarAlerta();
                                talhao.consultarHistorico();
                                JOptionPane.showMessageDialog(null, talhao.toString());
                            }
                            break; // encerra o case 2

                        case 3:
                            // Verifica se o alertaUmidade foi instanciado antes de chamar seus métodos
                            if (alertaUmidade == null) {
                                JOptionPane.showMessageDialog(null, "Cadastre os dados primeiro! Escolha a opção 1.");
                            } else {
                                // Notifica o alerta de umidade e calcula o risco com base no nível
                                alertaUmidade.notificar();
                                alertaUmidade.calcularRisco();
                                JOptionPane.showMessageDialog(null, alertaUmidade.toString());
                            }
                            break; // encerra o case 3

                        case 4:
                            // Verifica se o alertaVazamento foi instanciado antes de chamar seus métodos
                            if (alertaVazamento == null) {
                                JOptionPane.showMessageDialog(null, "Cadastre os dados primeiro! Escolha a opção 1.");
                            } else {
                                // Notifica o alerta e detecta o vazamento
                                alertaVazamento.notificar();
                                alertaVazamento.detectarVazamento();
                                JOptionPane.showMessageDialog(null, alertaVazamento.toString());
                            }
                            break; // encerra o case 4

                        case 5:
                            // Verifica se o histórico foi instanciado antes de chamar seus métodos
                            if (historico == null) {
                                JOptionPane.showMessageDialog(null, "Cadastre os dados primeiro! Escolha a opção 1.");
                            } else {
                                // Registra, consulta e gera relatório do histórico de irrigação
                                historico.registrar();
                                historico.consultar();
                                historico.gerarRelatorio();
                                JOptionPane.showMessageDialog(null, historico.toString());
                            }
                            break; // encerra o case 5

                        case 6:
                            // Encerra o sistema: exibe mensagem de despedida e para o loop
                            JOptionPane.showMessageDialog(null, "Encerrando o sistema AgroSat Water. Até logo!");
                            executando = false;
                            break; // encerra o case 6

                        default:
                            // Executado quando o número digitado não corresponde a nenhum case (ex: 7, 0, -1)
                            JOptionPane.showMessageDialog(null, "Opção inválida! Digite um número entre 1 e 6.");
                    }

                    // catch NumberFormatException: captura o erro quando o usuário digita
                    // letras ou caracteres no lugar de números (ex: "abc", "1.5", " ")
                } catch (NumberFormatException e) {
                    JOptionPane.showMessageDialog(null, "Erro: Digite apenas números!\n" + e.getMessage());

                    // catch Exception: captura qualquer outro erro inesperado que possa ocorrer
                    // durante a execução (ex: campo null não tratado, falha ao converter double)
                } catch (Exception e) {
                    JOptionPane.showMessageDialog(null, "Erro inesperado: " + e.getMessage());
                }
            }
        }
    }
}
